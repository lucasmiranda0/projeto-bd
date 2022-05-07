package com.br.bdprojeto.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.br.bdprojeto.dtos.CustomerDto;
import com.br.bdprojeto.models.CustomerModel;
import com.br.bdprojeto.services.CustomerService;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/customers")
public class CustomerController {
    
    final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<Object> saveCustomer(@RequestBody @Valid CustomerDto customerDto) {
        var customerModel = new CustomerModel();
        BeanUtils.copyProperties(customerDto, customerModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.save(customerModel));
    }

    @GetMapping
    public ResponseEntity<List<CustomerModel>> getAllCustomers() {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.findAll());
    }
    
    @GetMapping("/sp")
    public ResponseEntity<List<CustomerModel>> storageProcedure() {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.storageProcedure());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneCustomer(@PathVariable(value = "id") String id) {
        Optional<CustomerModel> customerModelOptional = customerService.findById(id);
        if(!customerModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The customer was not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(customerModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCustomer(@PathVariable(value = "id") String id) {
        Optional<CustomerModel> customerModelOptional = customerService.findById(id);
        if(!customerModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The customer was not found");
        }
        customerService.delete(customerModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("The cliente was deleted");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCustomer(@PathVariable(value = "id") String id,
    @RequestBody @Valid CustomerDto customerDto) {
        Optional<CustomerModel> customerModelOptional = customerService.findById(id);
        if(!customerModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The customer was not found");
        }
        var customerModel = customerModelOptional.get();
        customerModel.setCompanyName(customerDto.getCompanyName());
        customerModel.setContactName(customerDto.getContactName());        
        customerModel.setAddress(customerDto.getAddress());
        customerModel.setCity(customerDto.getCity());
        customerModel.setRegion(customerDto.getRegion());
        customerModel.setPostalCode(customerDto.getPostalCode());
        customerModel.setCountry(customerDto.getCountry());
        customerModel.setPhone(customerDto.getPhone());
        customerModel.setFax(customerDto.getFax());
        return ResponseEntity.status(HttpStatus.OK).body(customerService.save(customerModel));
    }
}
