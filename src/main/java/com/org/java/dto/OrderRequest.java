package com.org.java.dto;
import com.org.java.Models.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
	
	private Customer customer ;

	
}
