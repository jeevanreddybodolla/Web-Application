package com.jeevan.project.Dao;

import org.hibernate.HibernateException;



import org.hibernate.Query;

import com.jeevan.project.pojo.OrderTable;

public class OrderDao extends DAO {

	
public void addOrder(OrderTable o){
		
		try{
			begin();
			getSession().save(o);
			commit();
			getSession().close();
		}
		catch(HibernateException e){
			System.out.println(e);
		}
	}


	public OrderTable getOrderDetails(int customerId, int orderId)
        throws Exception {
    try {
        begin();
        Query q = getSession().createQuery("from OrderTable where customer =:customerId and orderId = :orderId");
        q.setInteger("customerId", customerId);
        q.setInteger("orderId", orderId);
        OrderTable order = (OrderTable) q.uniqueResult();
      
        commit();
        System.out.println(order.getOrderPrice()+"DAO");
        return order;
    } catch (HibernateException e) {
        rollback();
        throw new Exception("Could not order " + e);
    }
}




}
