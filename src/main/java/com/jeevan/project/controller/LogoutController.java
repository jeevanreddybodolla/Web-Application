package com.jeevan.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LogoutController {

	@RequestMapping(value = "/logout.htm", method = RequestMethod.GET)
	public ModelAndView loginOut(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		
			request.getSession().invalidate();
			return new ModelAndView("LoginPage");
	}
	
}
