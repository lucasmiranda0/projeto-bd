package com.br.bdprojeto.repositories;

import com.br.bdprojeto.models.OrderDetailsModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetailsModel, Integer> {

    
    
}
