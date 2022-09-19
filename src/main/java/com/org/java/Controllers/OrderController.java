package com.org.java.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.java.Models.Customer;
import com.org.java.Repositeries.CustomerRepository;
import com.org.java.Repositeries.ProductRepository;
import com.org.java.dto.OrderRequest;

@RestController
public class OrderController {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/placeorder")
	public Customer placeOrder(@RequestBody OrderRequest request){
		return customerRepository.save(request.getCustomer());
		
	}
	@GetMapping("/findAll")
	public List<Customer> findAllOrders(){
		return customerRepository.findAll();
		
	}

}
