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

import com.dao.Supplierdao;
import com.model.Supplier;

@Controller
public class SupplierController {
	private static Logger log = LoggerFactory.getLogger("CategoryController.class");

	@Autowired
	private Supplierdao supplierdao;

	@Autowired
	private Supplier supplier;

	@Autowired
	Model mv;

	@RequestMapping(value = "/supplier", method = RequestMethod.GET)
	public String listsupplier(Model model) {
		log.debug("starting of the method listSupplier");
		model.addAttribute("supplier", supplier);
		model.addAttribute("supplierList", this.supplierdao.list());
		log.debug("end of the method listSupplier");
		return "supplier";
	}

	@RequestMapping(value = "/supplier/add", method = RequestMethod.POST)
	public String addsupplier(@ModelAttribute("supplier") Supplier supplier) {
		log.debug("starting of the method addSupplier");
		// String newID=Util.removecommaa(supplier.getId());
		// supplier.setId(newID);

		supplierdao.save(supplier);
		log.debug("ending of the method addsupplier");
		return "supplier";
	}

	@RequestMapping("/supplier/remove/{id}")
	public ModelAndView deletesupplier(@PathVariable("id") String id) throws Exception {

		boolean flag = supplierdao.delete(id);
		ModelAndView mv = new ModelAndView("supplier");
		String msg = "Successfully done the operation";
		if (flag != true) {
			msg = "operation could not success";
		}
		mv.addObject("msg", msg);
		return mv;
	}

	@RequestMapping("/supplier/edit/{id}")
	public String editsupplier(@ModelAttribute("supplier") Supplier supplier) {
		log.debug("starting of the method editsupplier");
		if (supplierdao.update(supplier) == true) {
			mv.addAttribute("msg", "successfully updated the supplier");
		} else {
			mv.addAttribute("msg", "cannot update the supplier");
		}

		log.debug("end of the method editSupplier");
		return "supplier";
	}

}
