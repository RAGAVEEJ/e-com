package com.niit.shopcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shopcart.dao.SupplierDAO;
import com.niit.shopcart.model.Supplier;


@Controller
public class SupplierController {

	@Autowired(required=true)
	Supplier supplier;
	
	@Autowired(required=true)
	SupplierDAO supplierDAO;
	
	@RequestMapping(value="/supplier")
	public String listSupplier(Model model)
	{
	    model.addAttribute("supplier", supplier);
		model.addAttribute("supplierList", this.supplierDAO.list());
		return "supplier";		
	}
	
	@RequestMapping(value="/addsupplier", method=RequestMethod.POST)
	public String addSupplier(@ModelAttribute("supplier") Supplier supplier, Model model){
              supplierDAO.saveOrUpdate(supplier);
			/*model.addAttribute("supplierList", this.supplierDAO.list());*/
                  return "redirect:/supplier";

	}
	
	@RequestMapping("/removesupplier/{id}")
	public String deleteSupplier(@PathVariable("id") String id, ModelMap model)
	{
		
		System.out.println("delete");
		supplierDAO.delete(id);
		return "redirect:/supplier";
	}
	
	@RequestMapping("/editsupplier/{id}")
	public String editSupplier(@PathVariable("id")String id, Model model)
	{
		model.addAttribute("supplier",this.supplierDAO.get(id));
		model.addAttribute("supplierList", this.supplierDAO.list());
		return "supplier";
	}
	
	
}
