/*package com.niit.shopcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopcart.dao.CategoryDAO;
import com.niit.shopcart.dao.ProductDAO;
import com.niit.shopcart.dao.SupplierDAO;

import com.niit.shopcart.model.Category;
import com.niit.shopcart.model.Product;
import com.niit.shopcart.model.Supplier;


@Controller
public class AdminController {

	@Autowired
	private Product product;
	
	 @Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private Supplier supplier;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	
	@RequestMapping("/Admin")
	public ModelAndView Admin()
	{
		ModelAndView mv = new ModelAndView("Admin");
	
		return mv;
	}
	
	@RequestMapping("/manageCategories")
	public ModelAndView categories()
	{
		ModelAndView mv = new ModelAndView("AdminCategory");
		mv.addObject("category", category);
		
		mv.addObject("categoryList", categoryDAO.list());
		return mv;
	}
	
	@RequestMapping("/manageSuppliers")
	public ModelAndView suppliers()
	{
		ModelAndView mv = new ModelAndView("AdminSupplier");
		mv.addObject("supplier", supplier);
		
		mv.addObject("supplierList", supplierDAO.list());
		return mv;
	}
	
	@RequestMapping("/manageProducts")
	public ModelAndView products()
	{
		ModelAndView mv = new ModelAndView("/AdminProduct");
		mv.addObject("supplier", new Supplier());
		mv.addObject("category",new Category());
		mv.addObject("categoryList",this.categoryDAO.list());
		mv.addObject("supplierList",this.supplierDAO.list());
	
		mv.addObject("product", product);
	
		mv.addObject("productList", productDAO.list());
		return mv;
	}

}
*/