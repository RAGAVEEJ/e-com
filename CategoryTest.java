package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.Categorydao;
import com.model.Category;

public class CategoryTest {

 public static void main(String[] args) {
	
	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();

context.scan("com.*"); 
context.refresh();
 
Categorydao categorydao=(Categorydao) context.getBean("categorydao");
Category category=(Category) context.getBean("category");

category.setId("170");
category.setName("furniture");
category.setDescription("it is furniture");

categorydao.save(category);
System.out.println("data inserted successfully");
 
 }
}
