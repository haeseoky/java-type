package com.example.javaType.sample.presentation;

import com.example.javaType.sample.application.OrderService;
import com.example.javaType.sample.presentation.request.ReqOrderCreate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public Boolean createOrder(
        @RequestBody ReqOrderCreate reqOrderCreate
    ) {
        return orderService.save();
    }
}
