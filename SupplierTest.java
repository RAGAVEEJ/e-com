package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.Supplierdao;
import com.model.Supplier;

public class SupplierTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
	
	context.scan("com"); 
	context.refresh();
	
	Supplierdao supplierdao=(Supplierdao) context.getBean("supplierdao");
	Supplier supplier= (Supplier) context.getBean("supplier");
	
	
	//supplier.setId("227");
	//supplier.setName("teakwood");
	//supplier.setAddress("agh city");
	
	supplierdao.delete("227");
	System.out.println("successfully inserted");
		
}

}
