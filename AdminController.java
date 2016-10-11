package com.controller;

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
public class AdminController {
	
	
	@Autowired
	private Categorydao categorydao;
	
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
	
	@RequestMapping("/Category")
	public ModelAndView categories(){
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("category", category);
		mv.addObject("isAdminClickedCategories", "true");
		mv.addObject("categoryList", categorydao.list());
		return mv;
	}
	@RequestMapping("/Product")
	public ModelAndView products(){
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("product", product);
		mv.addObject("isAdminClickedProducts", "true");
		mv.addObject("productList", productdao.list());
		return mv;		
	}
	@RequestMapping("/Supplier")
	public ModelAndView supplier(){
	ModelAndView mv = new ModelAndView("home");
	mv.addObject("supplier", supplier);
	mv.addObject("isAdminClickedSuppliers", "true");
	mv.addObject("supplierList", supplierdao.list());
	return mv;
	}
}


