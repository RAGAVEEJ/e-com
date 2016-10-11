package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Categorydao;
import com.model.Category;

import sun.util.logging.resources.logging;

@Controller
public class CategoryController {
	private static Logger log = LoggerFactory.getLogger("CategoryController.class");

	@Autowired
	private Categorydao categorydao;

	@Autowired
	private Category category;

	@Autowired
	Model mv;

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public String listcategory(Model model) {
		log.debug("starting of the method listCategories");
		model.addAttribute("category", category);
		model.addAttribute("categoryList", this.categorydao.list());
		log.debug("end of the method listCategories");
		return "category";
	}

	@RequestMapping(value = "/category/add", method = RequestMethod.POST)
	public String addcategory(@ModelAttribute("category") Category category) {
		log.debug("starting of the method addCategory");
		if (categorydao.save(category) == true) {
			mv.addAttribute("msg", "successfully added the category");
		} else {
			mv.addAttribute("msg", "cannot add the category");
		}

		log.debug("ending of the method addCategory");
		
		return "category";
	}

	@RequestMapping("/category/remove/{id}")
	public ModelAndView deletecategory(@PathVariable("id") String id) throws Exception {

		boolean flag = categorydao.delete(id);
		ModelAndView mv = new ModelAndView("category");
		String msg = "Successfull done the operation";
		if (flag != true) {
			msg = "operation could not success";
		}
		mv.addObject("msg", msg);
		return mv;
	}

	@RequestMapping("/category/edit/{id}")
	public String editcategory(@ModelAttribute("category") Category category) {
		log.debug("starting of the method editCategory");
		if (categorydao.update(category) == true) {
			mv.addAttribute("msg", "successfully updated the category");
		} else {
			mv.addAttribute("msg", "cannot update the category");
		}

		log.debug("end of the method editCategory");
		return "category";
	}

}
