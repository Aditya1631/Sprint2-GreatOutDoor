package com.cg.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.ProductDaoI;
import com.cg.Entity.Product;
@Service
public class ProductServiceImp implements ProductServiceI{
	
	@Autowired
	ProductDaoI pro;

	@Override
	public void create(Product p) {
		
		pro.create(p);
		
	}

	@Override
	public Product addById(int id) {
		
		return pro.addProductById(id);
		
	}

	@Override
	public List retrieve() {
		return pro.retrieve();
	}

}
