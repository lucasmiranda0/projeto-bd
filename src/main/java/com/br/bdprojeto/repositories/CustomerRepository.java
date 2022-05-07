package com.br.bdprojeto.repositories;

import java.util.List;

import com.br.bdprojeto.models.CustomerModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, String> {    

    @Query(value= "EXEC sp", nativeQuery= true)
	public List<CustomerModel> storageProcedure();

    
}
