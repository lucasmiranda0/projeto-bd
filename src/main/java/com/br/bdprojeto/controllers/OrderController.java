package com.br.bdprojeto.controllers;

import java.util.List;

import javax.validation.Valid;

import com.br.bdprojeto.dtos.OrderDto;
import com.br.bdprojeto.models.OrderModel;
import com.br.bdprojeto.services.OrderService;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/orders")
public class OrderController {
    
    final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Object> saveOrder(@RequestBody @Valid OrderDto orderDto) {
        var orderModel = new OrderModel();
        BeanUtils.copyProperties(orderDto, orderModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.save(orderModel));
    }

    @GetMapping
    public ResponseEntity<List<OrderModel>> getAllOrders() {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.findAll());
    }

    @GetMapping("/sp")
    public ResponseEntity<List<OrderModel>> storageProcedure() {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.storageProcedure());
    }
}
