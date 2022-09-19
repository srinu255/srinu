package com.org.java.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.java.Models.Product;
import com.org.java.Repositeries.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {

		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProductDetails() {
		List<Product> getAll = productRepository.findAll();
		return getAll;
	}

}
