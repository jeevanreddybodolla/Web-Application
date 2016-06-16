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
import com.jeevan.project.Dao.OrderDao;
import com.jeevan.project.Dao.OrderItemDao;
import com.jeevan.project.pojo.OrderItem;
import com.jeevan.project.pojo.OrderTable;
import com.jeevan.project.pojo.Products;

@Controller
public class OrderController {

	@RequestMapping(value = "/orderProceed.htm", method = RequestMethod.POST)
	public ModelAndView orderItemTable(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		
		int customerId=(Integer)session.getAttribute("customerId");
		int orderId=(Integer)session.getAttribute("orderId");
		System.out.println("This is custoemrID after order placed:"+customerId);
		
		OrderDao orderDao = new OrderDao();
		OrderTable order= orderDao.getOrderDetails(customerId, orderId);		
		order.getOrderPrice();
		
		  System.out.println(order.getOrderPrice()+"order Controller");
		session.setAttribute("orderDetails",order);
		session.setAttribute("customerDetails",customerId);
		
	//	System.out.println(String.valueOf(cartlist));
		return new ModelAndView("PaymentPage");
	}
	
}
