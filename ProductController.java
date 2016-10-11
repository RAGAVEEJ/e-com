/*package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dao.Categorydao;
import com.dao.Productdao;
import com.dao.Supplierdao;
import com.model.Category;
import com.model.Product;
import com.model.Supplier;

@Controller
public class ProductController {

	@Autowired(required = true)
	private Productdao productdao;
	
	@Autowired(required= true)
	private Categorydao categorydao;
	
	@Autowired(required = true)
	private Supplierdao supplierdao;
	 
	private String path = "D:\\shoppingcart\\img";
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String listProducts(Model model){
		model.addAttribute("product", new Product());
		model.addAttribute("category", new Category());
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("productList", this.productdao.list());
		model.addAttribute("categoryList", this.categorydao.list());
		model.addAttribute("supplierList", this.categorydao.list());
		return "product";
	}
	// for add and update product
	@RequestMapping(value = "/product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product, @RequestParam("image") MultipartFile file)
	
	Category category = categorydao.getByName  (product.getCategory().getName());
	Supplier supplier = supplierdao.getByName(product.getSupplier().getName());
	
	product.setCategory(category);
	product.setSupplier(supplier);
	product.setCategory_id(category.getId());
	product.setSupplier_id(supplier.getId());
	productdao.save(product);
	 
	//FileUtil.upload(path, file, product.getId() + ".jpg");
	return "product";
}

@RequestMapping("product/remove/{id}")
public String removeProduct(@PathVariable("id") String id, ModelMap model) throws Exception {
	
	try{
		productdao.delete(id);
		model.addAttribute("msg", "successfully removed");
		} catch (Exception e) {
			model.addAttribute("msg", e.getMessage());
			e.printStackTrace();
		}
      return "product";
}

@RequestMapping("product/edit/{id}")
public String editProduct(@PathVariable("id") String id, Model model) {
	System.out.println("edit product");
	model.addAttribute("product", this.productdao.get(id));
	model.addAttribute("listProducts", this.productdao.list());
	model.addAttribute("categorylist", this.categorydao.list());
	model.addAttribute("supplierlist", this.supplierdao.list());
	return "product";
}

@RequestMapping(value = "product/get/{id}")
public Model getProduct (@PathVariable("id") String id, Model model){
	Product selectedProduct = productdao.get(id);
	model.addAttribute("selectedproducts", selectedProduct);
	return model;
	}
}

	
	

*/