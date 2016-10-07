package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Categorydao;
import com.dao.Productdao;
import com.dao.Supplierdao;
import com.dao.Userdao;
import com.model.Category;
import com.model.Product;
import com.model.Register;
import com.model.Supplier;

@Controller
public class HomeController {
	
	@Autowired
	Register register;
	
	@Autowired
	private Categorydao categorydao;
	
	@Autowired
	private Userdao userdao;
	
	@Autowired
	private Category category;
	
	@Autowired
	private Product product;
	
	@Autowired
	private Supplier supplier;
	
	@Autowired
	private Supplierdao supplierdao;
	
	@Autowired
	private Productdao productdao;
	
	
	@Autowired
	private HttpSession session;
	
	
	@RequestMapping("/")
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("home");
		session.setAttribute("category", category);
		session.setAttribute("categoryList", categorydao.list());
		session.setAttribute("product", product);
		session.setAttribute("supplier", supplier);
		session.setAttribute("productList", productdao.list());
		session.setAttribute("supplierList", supplierdao.list());
		
		return mv;	
	}
}
