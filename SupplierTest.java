package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.Supplierdao;
import com.model.Supplier;

public class SupplierTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
	
	context.scan("com.shop.decoratives"); 
	context.refresh();
	
	Supplierdao supplierdao=(Supplierdao) context.getBean("supplierdao");
	Supplier supplier= (Supplier) context.getBean("supplier");
	
	
	supplier.setId("200");
	supplier.setName("teakwood");
	supplier.setAddress("no 45.adb st,xx city");
	
	supplierdao.save(supplier);
	System.out.println("successfully inserted");
		
}

}
