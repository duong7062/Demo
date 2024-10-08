package com.demo.demo2.controller;

import com.demo.demo2.dto.RequestDTO;
import com.demo.demo2.service.RequestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/request")
public class RequestController {
    private final Logger logger = LoggerFactory.getLogger(RequestController.class);
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private RequestService requestService;
    @PostMapping
    public ResponseEntity<?> creatRequest(@Valid @RequestBody RequestDTO requestDTO) throws JsonProcessingException {
        if (requestService.validateRequest(requestDTO)){
            logger.info("Send message to Rabbit" + requestDTO);
            rabbitTemplate.convertAndSend("exchange", "routingkey", objectMapper.writeValueAsString(requestDTO));
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
