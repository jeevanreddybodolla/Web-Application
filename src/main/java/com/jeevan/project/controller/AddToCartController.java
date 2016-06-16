package com.jeevan.project.controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.loader.custom.Return;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jeevan.project.Dao.CreateProductDao;
import com.jeevan.project.Dao.OrderDao;
import com.jeevan.project.Dao.OrderItemDao;
import com.jeevan.project.Dao.ProductCategoryDao;
import com.jeevan.project.Dao.UserDao;
import com.jeevan.project.pojo.CustomerDetails;
import com.jeevan.project.pojo.OrderItem;
import com.jeevan.project.pojo.OrderTable;
import com.jeevan.project.pojo.ProductCategory;
import com.jeevan.project.pojo.Products;

@Controller
public class AddToCartController {

	
	@RequestMapping(value = "/addToCart.htm", method = RequestMethod.POST)
	public ModelAndView addToCart(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		

		HttpSession session = request.getSession(true);
		String userName = (String)session.getAttribute("userName");
		System.out.println("This is the userName:" +userName);
		UserDao ud = new UserDao();
		int userId=ud.findID(userName);
		System.out.println("This is the userID:" +userId);
		CustomerDetails customerDetails = (CustomerDetails)ud.findByuserId(userId);
		session.setAttribute("customerId",userId);
		
		
		
		ArrayList<Products> cartlist=new ArrayList<Products>();
	     
		Float totalPrice = 0.0f;
        int size=request.getParameterValues("cartProducts").length;
        String[]  productids=request.getParameterValues("cartProducts");
        OrderItemDao oid=new OrderItemDao();
        HashSet<OrderItem> orderitems=new HashSet<OrderItem>();
        
        OrderTable order=new OrderTable();
 	    OrderDao od=new OrderDao();
 	    CreateProductDao cpd = new CreateProductDao();		
        for(String pd: productids){
   		Products custprod = (Products)cpd.getProducts(pd);
   		OrderItem oi=new OrderItem();
   		oi.setProductName(custprod.getProductName());
   		oi.setProductPrice(custprod.getProductPrice());
   		oi.setProducts(custprod);
   		totalPrice = totalPrice+ (custprod.getProductPrice());
   		System.out.println("total"+totalPrice);
   		oi.setOrderTable(order);
   	        cartlist.add(custprod);	
   	        orderitems.add(oi);
        }
        order.setOrderitems(orderitems);
        order.setOrderPrice(totalPrice);
        System.out.println(totalPrice);
        order.setCustomer(customerDetails);
        order.setOrderStatus("Order Placed");
        od.addOrder(order);
        session.setAttribute("orderId", order.getOrderid());
        
		return new ModelAndView("ShoppingCart","cartlist",cartlist);
	}	
		
	
	
	@RequestMapping(value = "/mycart.htm", method = RequestMethod.POST)
	public ModelAndView viewMyCart(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		
		
		//session.setAttribute("prodCartList", cartlist);
		return new ModelAndView("ShoppingCart");
	}
	
	
	
}
