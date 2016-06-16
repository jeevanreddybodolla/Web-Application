package com.jeevan.project.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jeevan.project.Dao.OrderDao;
import com.jeevan.project.Dao.UserDao;
import com.jeevan.project.pojo.CustomerDetails;
import com.jeevan.project.pojo.OrderItem;
import com.jeevan.project.pojo.OrderTable;

@Controller
public class PdfViewController {
	
	
	@RequestMapping(value = "/viewInvoice.pdf", method = RequestMethod.GET)
	 protected ModelAndView makePayment(Locale locale,ModelMap model,
	            HttpServletRequest request,
	            HttpServletResponse response) throws Exception {
	
		HttpSession session = request.getSession(true);
		int customerId=(Integer)session.getAttribute("customerId");
		int orderId=(Integer)session.getAttribute("orderId");
//		System.out.println("This is user session name " +session.getAttribute("userName"));

		System.out.println("This is custId in invoice controller:" + customerId);
		
		OrderDao orderDao = new OrderDao();
		UserDao ud = new UserDao();
		OrderTable order= orderDao.getOrderDetails(customerId, orderId);	
		CustomerDetails customerDetails = (CustomerDetails)ud.findByuserId(customerId);
		float totalAmount=order.getOrderPrice();
		Set<OrderItem> orderItem = order.getOrderitems();
		String orderStatus= order.getOrderStatus();
		
		System.out.println("Order Total is total amount" + totalAmount);
		System.out.println("These are order items" + orderItem);
		System.out.println("This is order ststus" + orderStatus);
		
		model.addAttribute("orderItem", orderItem);
		model.addAttribute("totalAmount", totalAmount);
		model.addAttribute("orderStatus", orderStatus);
		model.addAttribute("customerDetails", customerDetails);
		
		return new ModelAndView(new PdfView(),model);	
		}
}

