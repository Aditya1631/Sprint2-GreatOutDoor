package com.cg.Dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cg.Entity.Product;


public class ProductDaoImp implements ProductDaoI{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public Product addProductById(int id) {
		
		return em.find(Product.class,id);
	}

	@Override
	public Product removeproductId(int id) {
		
		return em.find(Product.class, id);
	}

	@Override
	public List retrieve() {
		Query q=em.createQuery("from Product p");
		return q.getResultList();
	}

	@Override
	public void create(Product p) {
		em.persist(p);
		
	}

	

	
	


}
