package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Customers;

public class CustomerServiceImplJpa implements CustomerService{
    
   
    private static List<Customers> customersList = new ArrayList<>();

   

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return null;
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        return null;
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
        return -1;
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        
        return null;
    }

    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        return customersList;
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        customersList.add(customers);
        return customersList;
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList(){
        List<Customers> sortedCustomers = customersList;
        Collections.sort(sortedCustomers);
        return sortedCustomers;
    }

    @Override
    public void emptyArrayList() {
        customersList = new ArrayList<>();
    }
}