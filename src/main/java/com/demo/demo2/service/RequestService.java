package com.demo.demo2.service;

import com.demo.demo2.dto.RequestDTO;

public interface RequestService {
    void saveRequest(RequestDTO requestDTO);
    boolean validateRequest(RequestDTO requestDTO);
}
