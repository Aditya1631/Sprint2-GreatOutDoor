package com.cg.Dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.cg.Entity.Product;

@Repository
public interface ProductDaoI {
	
	public void create(Product p);
	public Product addProductById(int id);
	public Product removeproductId(int id);

	public List retrieve();

}
