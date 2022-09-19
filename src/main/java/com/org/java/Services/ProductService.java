package com.org.java.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.org.java.Models.Product;

@Component
public interface ProductService {

	Product saveProduct(Product product);

	List<Product> getAllProductDetails(); 

}
