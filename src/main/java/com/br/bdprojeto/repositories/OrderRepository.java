package com.br.bdprojeto.repositories;

import java.util.List;

import com.br.bdprojeto.models.OrderModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <OrderModel, Integer> {
    
    @Query(value = "EXEC pedidosbrazil", nativeQuery = true)
    public List<OrderModel> storageProcedure();
}
