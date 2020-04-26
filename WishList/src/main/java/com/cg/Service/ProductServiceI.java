package com.cg.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.Entity.Product;

@Service
public interface ProductServiceI {
	
	public void create(Product p);
	public Product addById(int id);
	
	public List retrieve();
	

}
