package com.jeevan.project.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jeevan.project.Dao.ProductCategoryDao;
import com.jeevan.project.Dao.SupplierDao;
import com.jeevan.project.pojo.Products;
import com.jeevan.project.pojo.SupplierDetails;

@Controller
public class SupplierViewController {

	 
	@RequestMapping(value = "/viewSupplier.htm", method = RequestMethod.GET)
	public ModelAndView loginpage(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
	
		SupplierDao ad = new SupplierDao();
		ArrayList<SupplierDetails> supplierList=ad.viewSupplierDetails();
		return new ModelAndView("ViewSupplier","supplierList",supplierList);
	}
	
}