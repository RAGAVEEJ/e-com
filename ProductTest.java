package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.Productdao;
import com.model.Product;

public class ProductTest {
	public static void main(String[] args) {

		// get domain and dao instance without creating a new operator so create
		// context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		// mention the package from where context have to get instance
		context.scan("com");
		context.refresh();

		Productdao productdao = (Productdao) context.getBean("productdao");
		Product product = (Product) context.getBean("product");

		// insert the data into table
		product.setId("678");
		product.setName("wall hanging2");
		product.setPrice(300);
		product.setDescription("haiii");
		product.setCategory_id("166");
		product.setSupplier_id("201");
		// perform save crud operations
		productdao.save(product);

		System.out.println("product inserted successfully");

	}
}