package com.example.javaType.sample.application;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {
    public Boolean save(){
        return true;
    }
}
