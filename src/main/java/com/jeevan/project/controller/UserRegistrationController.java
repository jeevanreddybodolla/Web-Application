package com.jeevan.project.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

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
import com.jeevan.project.Dao.RegistrationDao;
import com.jeevan.project.pojo.CustomerDetails;
import com.jeevan.project.pojo.UserTable;


@Controller
public class UserRegistrationController {

private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/userRegistration.htm", method = RequestMethod.POST)
	public ModelAndView loginpage(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		
		CustomerDetails cd = new CustomerDetails();
		cd.setFirstName(request.getParameter("fname"));
		cd.setLastName(request.getParameter("lname"));
		cd.setEmail(request.getParameter("email"));
		cd.setMobile(Long.parseLong(request.getParameter("mobile")));
		cd.setGender(request.getParameter("sex"));
		cd.setAddress(request.getParameter("address"));
		cd.setCity(request.getParameter("city"));
		cd.setState(request.getParameter("state"));
		
		
		UserTable ud = new UserTable();
		ud.setUsername(request.getParameter("userName"));
		ud.setPassword(request.getParameter("password"));
		ud.setCnfrmPassword(request.getParameter("conpassword"));
		ud.setRole("Customer");
		//ud.setRole("Admin");
		
		RegistrationDao rd = new RegistrationDao();
		cd.setUserTable(ud);
		ud.setCustomerDetails(cd);
		rd.customerDetails(cd);
		rd.userDetails(ud);
		return new ModelAndView("home_1");
		
		
	}

	@RequestMapping(value = "/userRegister.htm", method = RequestMethod.GET)
	public ModelAndView registerPage(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {

		return new ModelAndView("UserRegistrationPage");
			
	}
}
