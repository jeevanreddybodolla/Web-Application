package com.jeevan.project.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jeevan.project.Dao.CreateProductDao;
import com.jeevan.project.Dao.ProductCategoryDao;
import com.jeevan.project.Dao.RegistrationDao;
import com.jeevan.project.pojo.CustomerDetails;
import com.jeevan.project.pojo.ProductCategory;
import com.jeevan.project.pojo.Products;
import com.jeevan.project.pojo.UserTable;

@Controller
public class CreateProductsController {

	@RequestMapping(value = "/productsPage.htm", method = RequestMethod.GET)
	public ModelAndView registerPage(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {

		
		HttpSession session = request.getSession();
		ProductCategoryDao pcd = new ProductCategoryDao();
		ArrayList<ProductCategory> list =pcd.productCategory();
		session.setAttribute("catgList", list);
		return new ModelAndView("CreateProducts","categoryList",list);
			
	}
	

	@RequestMapping(value = "/createProducts.htm", method = RequestMethod.POST)
	public ModelAndView loginpage(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		
		Products products = new Products();		
		
		//products.setProductCategory(request.getParameter("productCategory"));
		products.setProductName(request.getParameter("productName"));
		products.setProductPrice(Float.parseFloat(request.getParameter("productPrice")));
		products.setProductQuantity(Integer.parseInt(request.getParameter("productQuantity")));
		
		CreateProductDao cp = new CreateProductDao();
		
		ProductCategoryDao pcd = new ProductCategoryDao();
		System.out.println("This is a category"+request.getParameter("productCategory"));
		ProductCategory p=(ProductCategory)pcd.getCategory(request.getParameter("productCategory"));
		
		products.setProductCategory(p);
		
		cp.addProducts(products);
		
		return new ModelAndView("SupplierHomePage");
		
	}
}
