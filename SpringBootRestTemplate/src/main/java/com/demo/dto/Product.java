package com.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	
	private Long productId;
	
	
	private String productName;
	
	
	private String category;
	
	
	private Long quantity;
	
	
	
	
	private Double price;
	
	private Integer averageRating;
	
}
