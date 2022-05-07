package com.br.bdprojeto.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.br.bdprojeto.models.CustomerModel;
import com.br.bdprojeto.repositories.CustomerRepository;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public CustomerModel save(CustomerModel customerModel) {
        return customerRepository.save(customerModel);
    }

    public List<CustomerModel> findAll() {
        return customerRepository.findAll();
    }

    public Optional<CustomerModel> findById(String id) {
        return customerRepository.findById(id);
    }

    public void delete(CustomerModel customerModel) {
        customerRepository.delete(customerModel);
    }

    public List<CustomerModel> storageProcedure() {
		List<CustomerModel> list= this.customerRepository.storageProcedure();
		return list;
	}
}
