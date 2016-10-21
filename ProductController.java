package com.niit.shopcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.niit.shopcart.dao.CategoryDAO;
import com.niit.shopcart.dao.ProductDAO;
import com.niit.shopcart.dao.SupplierDAO;
import com.niit.shopcart.model.Category;
import com.niit.shopcart.model.Product;
import com.niit.shopcart.model.Supplier;
import com.niit.shopcart.utils.Util;

@Controller
public class ProductController {

	@Autowired(required=true)
	private ProductDAO productDAO;
	
	@Autowired(required=true)
	private CategoryDAO categoryDAO;
	
	@Autowired(required=true)
	private SupplierDAO supplierDAO;
	
	/*private String path=";
	*/
	@RequestMapping(value="/AdminProduct")
	public String listProducts(Model model)
	{
		model.addAttribute("product", new Product());
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("category",new Category());
		model.addAttribute("productList",this.productDAO.list());
		model.addAttribute("categoryList",this.categoryDAO.list());
		model.addAttribute("supplierList",this.supplierDAO.list());
		return "AdminProduct";
	}
	
	@RequestMapping(value="/addproduct")
public String addProduct(@ModelAttribute("product")Product product,Model model)
{
		String newID=	Util.removeComma(product.getId());
		product.setId(newID);
		Category category = categoryDAO.getByName(product.getCategory().getName());
		categoryDAO.saveOrUpdate(category);
		Supplier supplier = supplierDAO.getByName(product.getSupplier().getName());
		supplierDAO.saveOrUpdate(supplier);
		
		product.setCategory(category);
		product.setSupplier(supplier);
		
		product.setCategory_id(category.getId());
		product.setSupplier_id(supplier.getId());
		
		productDAO.saveOrUpdate(product);
	/*	
		MultipartFile image= product.getImage();
		FileUtil.upload(path, image, product.getId()+".jpg");*/
		
		model.addAttribute("productList",this.productDAO.list());
	  return "AdminProduct";
}
	
@RequestMapping("removeproduct/{id}")
public String deleteProduct(@PathVariable("id")String id ,ModelMap model)throws Exception{
try{
	productDAO.delete(id);
	model.addAttribute("msg", "successfully added");
}
catch (Exception e)
{
	model.addAttribute("msg", e.getMessage());
	e.printStackTrace();
}
		return "redirect:/AdminProduct";
	}

@RequestMapping("editproduct/{id}")
public String editProduct(@PathVariable("id")String id, Model model) 
{
	System.out.println("editProduct");
	model.addAttribute("product", this.productDAO.get(id));
	model.addAttribute("ProductList", this.productDAO.list());
	model.addAttribute("categoryList",this.categoryDAO.list());
	model.addAttribute("supplierList",this.supplierDAO.list());
	

	return "AdminProduct";
}

@RequestMapping("product/get/{id}")
public String getSelectedProduct(@PathVariable("id") String id, Model model ,RedirectAttributes redirectAttributes) 
{
	System.out.println("getSelectedProduct");
	redirectAttributes.addFlashAttribute("selectedProduct", this.productDAO.get(id));
model.addAttribute("categoryList", this.categoryDAO.list());
	return "redirect:/index";
	}

}




