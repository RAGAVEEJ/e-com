package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.Productdao;
import com.model.Product;



public class ProductTest {
	public static void main(String[] args) {
		
		 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();

	context.scan("com"); 
	context.refresh();
	
	Productdao productdao= (Productdao) context.getBean("productdao");
	Product product = (Product) context.getBean("product");
	
	product.setId("pro200");
	product.setName("dinning sets");
	product.setPrice("1000");
	
	product.setId("pro201");
	product.setName("wall hanging");
	product.setPrice("500");
	
	productdao.save(product);
	System.out.println("product inserted successfully");
	
	System.out.println("data inserted successfully");
	
}
}