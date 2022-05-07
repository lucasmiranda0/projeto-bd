package com.br.bdprojeto.services;

import javax.transaction.Transactional;

import com.br.bdprojeto.models.OrderDetailsModel;
import com.br.bdprojeto.repositories.OrderDetailsRepository;

import org.springframework.stereotype.Service;

@Service
public class OrderDetailsService {
    
    final OrderDetailsRepository orderDetailsRepository;

    public OrderDetailsService(OrderDetailsRepository orderDetailsRepository) {
        this.orderDetailsRepository = orderDetailsRepository;
    }

    @Transactional
    public OrderDetailsModel save(OrderDetailsModel orderDetailsModel) {
        return orderDetailsRepository.save(orderDetailsModel);
    }

}
