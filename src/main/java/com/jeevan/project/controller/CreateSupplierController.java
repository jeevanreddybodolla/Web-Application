package com.jeevan.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jeevan.project.Dao.RegistrationDao;
import com.jeevan.project.pojo.SupplierDetails;
import com.jeevan.project.pojo.UserTable;

@Controller
public class CreateSupplierController {

	
	@RequestMapping(value = "/createProductAdmin.htm", method = RequestMethod.GET)
	public ModelAndView createProductAdmin(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		return new ModelAndView("CreateProductAdmin");
	}
	
	@RequestMapping(value = "/prodAdminRegister.htm", method = RequestMethod.POST)
	public ModelAndView prodAdminRegister(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		SupplierDetails sd = new SupplierDetails();
		sd.setLocation(request.getParameter("location"));
		sd.setSupplierEmail(request.getParameter("email"));
		sd.setSupplierName(request.getParameter("supplierName"));
		
		
		UserTable ud = new UserTable();
		ud.setUsername(request.getParameter("userName"));
		ud.setPassword(request.getParameter("password"));
		ud.setCnfrmPassword(request.getParameter("conpassword"));
		ud.setRole("Supplier");
		ud.setSupplierDetails(sd);
		sd.setUserID(ud);
		
		RegistrationDao rd = new RegistrationDao();
		rd.userDetails(ud);
		
		return new ModelAndView("AdminMainPage");
	}
}
