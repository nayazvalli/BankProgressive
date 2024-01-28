package com.wecp.progressive.controller;


import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.service.CustomerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping

public class CustomerController {
    @Autowired
    CustomerServiceImpl service;

    public ResponseEntity<List<Customers>> getAllCustomers() {
        return new ResponseEntity<>(service.getAllCustomers(),HttpStatus.OK);
    }

    public ResponseEntity<Customers> getCustomerById(int customerId) {
        return null;
    }

    public ResponseEntity<Integer> addCustomer(Customers customers) {
        return null;
    }

    public ResponseEntity<Void> updateCustomer(int customerId, Customers customers) {
        return null;
    }
    public ResponseEntity<Void> deleteCustomer(int customerId) {
        return null;
    }

    public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(int cutomerId) {
        return null;
    }
}
