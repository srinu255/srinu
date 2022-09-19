package com.org.java.Repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.java.Models.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
