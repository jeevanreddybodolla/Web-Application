package com.jeevan.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jeevan.project.HomeController;
import com.jeevan.project.Dao.RegistrationDao;
import com.jeevan.project.Dao.UserDao;
import com.jeevan.project.pojo.UserTable;


@Controller
public class HomePageController {

private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/homepage.htm", method = RequestMethod.GET)
	public ModelAndView loginpage(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		

		System.out.println("in the homepage controller");
		//RegistrationDao rd = new RegistrationDao();
		//UserTable ut = new UserTable();
		//ut.setUsername("admin");
		//ut.setPassword("admin");
		//ut.setCnfrmPassword("admin");
		//ut.setRole("Admin");
		//rd.userDetails(ut);
		
		return new ModelAndView("home_1");
	}

	
	
}
