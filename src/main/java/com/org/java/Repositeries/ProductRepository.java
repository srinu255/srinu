package com.org.java.Repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.java.Models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
