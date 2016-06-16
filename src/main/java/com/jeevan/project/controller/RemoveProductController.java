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
import com.jeevan.project.pojo.OrderItem;
import com.jeevan.project.pojo.Products;

@Controller
public class RemoveProductController {

	@RequestMapping(value = "/removeProd.htm", method = RequestMethod.GET)
	public ModelAndView removeProd(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		
		CreateProductDao cpd = new CreateProductDao();	
		System.out.println("inside remove");
		//String[]  productID= request.getParameterValues("removeProd");
		//System.out.println("Lenght of array : "+ productID.length);
		String[] remove = request.getParameterValues("remove");
		ArrayList<Products> cartlist=new ArrayList<Products>();		
		int i=1;
		for(String pd: remove){
			OrderItem oi = new OrderItem();
			Products productDetails = (Products)cpd.removeProd(pd);
			
			cartlist.add(productDetails);
			System.out.println("This is time" + i++);
		}		
		session.setAttribute("cartlist", cartlist);
		return new ModelAndView("ShoppingCart");
	}

	
	
		
}
