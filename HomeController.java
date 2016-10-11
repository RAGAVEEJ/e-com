package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		session.setAttribute("category", category);
		session.setAttribute("categoryList", categorydao.list());
		session.setAttribute("product", product);
		session.setAttribute("supplier", supplier);
		session.setAttribute("productList", productdao.list());
		session.setAttribute("supplierList", supplierdao.list());

		return mv;
	}

	/*@RequestMapping(value = "login/register", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute Register register) {
		ModelAndView mv = new ModelAndView("/home");

		if (userdao.get(register.getUsername()) == null) {
			userdao.save(register);
			mv.addObject("success", "you are successfully registered");
		} else {
			mv.addObject("message", "user already exists");
		}
		return mv;
	}*/

	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("register", register);
		mv.addObject("isUserClickedRegister", "true");
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("register", register);
		mv.addObject("isUserClickedLogin", "true");
		return mv;

	}

	@RequestMapping("/aboutus")
	public String aboutus() {
		return "aboutus";
	}

	@RequestMapping("/contactus")
	public String contactus() {
		return "contactus";
	}

}
