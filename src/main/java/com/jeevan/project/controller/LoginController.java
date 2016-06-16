package com.jeevan.project.controller;



import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jeevan.project.HomeController;
import com.jeevan.project.Dao.ProductCategoryDao;
import com.jeevan.project.Dao.UserDao;
import com.jeevan.project.pojo.Products;
import com.jeevan.project.pojo.UserTable;

@Controller
public class LoginController {

	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public ModelAndView loginpage(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		

		System.out.println("in the controller");
		return new ModelAndView("LoginPage");
	}
	
	@RequestMapping(value = "/userlogin.htm", method = RequestMethod.POST)
	public ModelAndView userLogin(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		
		HttpSession session = request.getSession(true);
	
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		session.setAttribute("userName",userName);
		UserDao userDao = new UserDao();
        UserTable b=(UserTable)userDao.validate(userName, password);
        if(b==null){
        	return new ModelAndView("LoginPage");
        }
      //  int userId=userDao.findID(userName);
        
        if(b.getRole().equalsIgnoreCase("Customer")){
        	
        	ProductCategoryDao pcd = new ProductCategoryDao();
        	ArrayList<Products> prodList=pcd.viewProducts();
        	System.out.println(String.valueOf(prodList));
        	
        	//session.setAttribute("userID", userId);
        	return new ModelAndView("CustomerHomePage","prodList",prodList);
        }
        else if(b.getRole().equalsIgnoreCase("Admin")){
        	//session.setAttribute("userID", userId);
        	return new ModelAndView("AdminMainPage");
        }
        else if(b.getRole().equalsIgnoreCase("Supplier")){
        	//session.setAttribute("userID", userId);
        	return new ModelAndView("SupplierHomePage");
        }      
        else{
      	return new ModelAndView("error");
       }
	}
}
