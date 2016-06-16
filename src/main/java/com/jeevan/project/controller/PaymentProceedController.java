package com.jeevan.project.controller;

import java.util.Properties;

import javax.persistence.Entity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.mail.MailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jeevan.project.Dao.OrderDao;
import com.jeevan.project.Dao.PaymentDao;
import com.jeevan.project.pojo.OrderTable;
import com.jeevan.project.pojo.Payment;


@Controller
public class PaymentProceedController {

	@RequestMapping(value = "/paymentProceed.htm", method = RequestMethod.POST)
	public ModelAndView orderItemTable(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {

		//HttpSession session = request.getSession();
		

		Payment payment = new Payment();
//		OrderDao orderDao = new OrderDao();
//		OrderTable order= orderDao.getOrderDetails();		
		
//		PaymentDao p = new PaymentDao();
//		payment.setCardHolderName(request.getParameter("cardHolderName"));
//		payment.setCardNumber(Long.parseLong(request.getParameter("cardNumber")));
//		payment.setPasscode(Integer.parseInt(request.getParameter("passcode")));
//		payment.setOrderTable(order);
//		p.addPayment(payment);
		
	//	order.getOrderPrice();
	//session.setAttribute("paymentDetails",payment);	

		return new ModelAndView("ViewInvoice");
	}
	
}
