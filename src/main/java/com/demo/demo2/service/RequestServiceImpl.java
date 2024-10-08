package com.demo.demo2.service;

import com.demo.demo2.dto.RequestDTO;
import com.demo.demo2.entity.Request;
import com.demo.demo2.repository.RequestRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Service
public class RequestServiceImpl implements RequestService {
    private final Logger logger = LoggerFactory.getLogger(RequestServiceImpl.class);
    private ModelMapper modelMapper = new ModelMapper();
    @Autowired
    private RequestRepository requestRepository;
    @Override
    @Transactional
    public void saveRequest(RequestDTO requestDTO) {
        logger.info("Saving request: " + requestDTO);
        Request request = new Request(requestDTO.getTokenKey(), requestDTO.getApiID());
        logger.info("Request: " + request);
        Request newRequest = null;
        try {
            newRequest = this.requestRepository.saveAndFlush(request);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        logger.info("Saved request: " + newRequest);
    }

    @Override
    public boolean validateRequest(RequestDTO requestDTO) {
        logger.info("Validating request: " + requestDTO);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        try{
            LocalDateTime localDateTime = LocalDateTime.parse(requestDTO.getPayDate(), formatter);
        } catch (Exception e){
            logger.error(e.getMessage());
            return false;
        }
        if(requestDTO.getRealAmount() > requestDTO.getDebitAmount()) return false;
        if(requestDTO.getRealAmount()!=requestDTO.getDebitAmount()){
            if(requestDTO.getPromotionCode()==null||requestDTO.getPromotionCode().trim().equals("")) return false;
        }
        List<Request> sameTokenKeyRequests = requestRepository.findByTokenKey(requestDTO.getTokenKey());
        LocalDate newPayDate = LocalDateTime.parse(requestDTO.getPayDate(), formatter).toLocalDate();
        for (Request request : sameTokenKeyRequests) {
            LocalDate existingPayDate = LocalDateTime.parse(request.getPayDate(), formatter).toLocalDate();
            if (newPayDate.equals(existingPayDate)) return false;
        }
        logger.info("Request has been validated");
        return true;
    }
}
