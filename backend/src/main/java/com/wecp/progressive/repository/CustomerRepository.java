package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Customers;

import java.sql.SQLException;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customers,Integer> {
    public Customers findByCustomerId(int customerId)throws SQLException;
}