package com.br.bdprojeto.services;

import java.util.List;

import javax.transaction.Transactional;

import com.br.bdprojeto.models.OrderModel;
import com.br.bdprojeto.repositories.OrderRepository;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public OrderModel save(OrderModel orderModel) {
        return orderRepository.save(orderModel);
    }

    public List<OrderModel> findAll() {
        return orderRepository.findAll();
    }

    public List<OrderModel> storageProcedure() {
        List<OrderModel> list = this.orderRepository.storageProcedure();
        return list;
    }
}
