package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.Userdao;
import com.model.Register;

public class UserTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.*");
		context.refresh();

		Userdao userdao = (Userdao) context.getBean("userdao");
		Register register = (Register) context.getBean("register");

		//register.setId("ser60");
		//register.setFirstname("fgtjthrgujr");
		//register.setLastname("cde");
		//register.setUsername("niitt");
		//register.setPassword("123");
		//register.setEmail("abc@gmail.com");
		//register.setPhone("123456789");
		//register.setAddress("cc city");

		userdao.delete("ser60");

		System.out.println("Data inserted into the database sucessfully");
	}
}
