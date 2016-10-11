package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
public class LoginController {
	@Autowired
	private Categorydao categorydao;

	@Autowired
	private Category category;

	@Autowired
	private Productdao productdao;

	@Autowired
	private Product product;

	@Autowired
	private Supplierdao supplierdao;

	@Autowired
	private Supplier supplier;

	@Autowired
	private Userdao userdao;

	@Autowired
	Register register;

	@Autowired
	private HttpSession session;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView userlogin(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {

		ModelAndView mv = new ModelAndView("home");
		register = userdao.isValidUser(username, password);

		if (register != null) {
			register = userdao.get(username);
			session.setAttribute("loggedInUser", register.getUsername());
			session.setAttribute("register", register);

			
			if (register.getRole().equals("ROLE_ADMIN")) {
                 mv.addObject("isAdmin", "true");
				session.setAttribute("categoryList", categorydao.list());
				session.setAttribute("supplierList", supplierdao.list());
				session.setAttribute("productList", productdao.list());

				session.setAttribute("category", category);
				session.setAttribute("supplier", supplier);
				session.setAttribute("product", product);

			} else if (register.getRole().equals("ROLE_USER"))
				mv = new ModelAndView("Home");
			session.setAttribute("username", register.getUsername());
		}

		return mv;
	}
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request,HttpSession session) {
		ModelAndView mv = new ModelAndView("/home");
		session.invalidate();
		session = request.getSession(true);
		session.setAttribute("category", category);
		session.setAttribute("categoryList", categorydao.list());
		
		mv.addObject("logoutmessage", "you logged out successfully");
		mv.addObject("loggedout", "true");
		return mv;
	}
}
