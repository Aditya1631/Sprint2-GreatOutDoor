package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Entity.Product;
import com.cg.Service.ProductServiceI;
@CrossOrigin("*")
@RestController
public class ProductController {
	
	@Autowired
	ProductServiceI service;
	

	@GetMapping(value="/products")
	public List<Product> viewProducts() {
		return service.retrieve();
	}
	
	@PostMapping(value="/product/new",consumes= {"application/json"})
	public String addProduct(@RequestBody Product product)
	{
		service.create(product);
		return "product added successfully";
	}

}
