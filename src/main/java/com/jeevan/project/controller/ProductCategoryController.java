package com.jeevan.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jeevan.project.HomeController;
import com.jeevan.project.Dao.ProductCategoryDao;
import com.jeevan.project.Dao.RegistrationDao;
import com.jeevan.project.Dao.UserDao;
import com.jeevan.project.pojo.CustomerDetails;
import com.jeevan.project.pojo.ProductCategory;
import com.jeevan.project.pojo.SupplierDetails;
import com.jeevan.project.pojo.UserTable;

@Controller
public class ProductCategoryController {

private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/addProductCatg.htm", method = RequestMethod.GET)
	public ModelAndView productCategory(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		return new ModelAndView("CreateProductCategory");
	}
	
	@RequestMapping(value = "/productCategory.htm", method = RequestMethod.POST)
	public ModelAndView prodCatg(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		
		ProductCategory pc = new ProductCategory();
		String prodCatg = request.getParameter("productCatg");
		pc.setCategoryName(prodCatg);
		
		ProductCategoryDao pcd = new ProductCategoryDao();
		pcd.addProductCatg(pc);
				
		return new ModelAndView("CreateProductCategory");
	}
	
	
}
