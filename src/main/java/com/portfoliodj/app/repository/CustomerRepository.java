package com.portfoliodj.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfoliodj.app.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    public Optional <Customer> findByName(String name);
}
