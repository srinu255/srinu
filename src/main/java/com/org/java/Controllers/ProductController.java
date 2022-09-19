package com.org.java.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.java.Models.Product;
import com.org.java.Services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/save")
	public ResponseEntity<Product> saveProductDetails(@RequestBody Product product) {
		Product prod = productService.saveProduct(product);
		return new ResponseEntity<>(prod, HttpStatus.CREATED);

	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Product>> getAllProductData(){
	List<Product> productAll=productService.getAllProductDetails();
	return new ResponseEntity<>(productAll,HttpStatus.OK);
	}

}
