package com.demo.demo2.consumer;
import com.demo.demo2.dto.RequestDTO;
import com.demo.demo2.service.RequestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private RequestService requestService;
    @Autowired
    private ObjectMapper objectMapper;
    @RabbitListener(queues = "queue1")
    public void receive(String message) {
        try {
            logger.info("Get message from queue: " + message);
            RequestDTO requestDTO = objectMapper.readValue(message, RequestDTO.class);
            logger.info("Received request: " + requestDTO);
            requestService.saveRequest(requestDTO);
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
        }
    }
}
