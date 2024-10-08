package com.demo.demo2.repository;

import com.demo.demo2.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequestRepository extends JpaRepository<Request,Integer> {
    List<Request> findByTokenKey(String tokenKey);
}
