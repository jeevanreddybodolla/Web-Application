package com.jeevan.project.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.jeevan.project.pojo.OrderItem;
import com.jeevan.project.pojo.ProductCategory;
import com.jeevan.project.pojo.Products;

public class OrderItemDao extends DAO {

	
	public void addOrderItem(OrderItem o){
		
		try{
			begin();
			getSession().save(o);
			commit();
		//	getSession().close();
		}
		catch(HibernateException e){
			System.out.println(e);
		}
	}

	public ArrayList<OrderItem> viewOrderItem(){
		
		begin();
		Query q = getSession().createQuery("from OrderItem");
		List list = q.list();
		ArrayList<OrderItem> orderItemList = new ArrayList<OrderItem>();
		if (!list.isEmpty()){
			for (int i=0;i<list.size();i++)	{
				OrderItem ord = (OrderItem)list.get(i);
				orderItemList.add(ord);
			}
		}
			commit();
			getSession().close();
			return orderItemList;		
	}
}
