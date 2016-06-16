package com.jeevan.project.Dao;

import org.hibernate.HibernateException;

import com.jeevan.project.pojo.OrderTable;
import com.jeevan.project.pojo.Payment;

public class PaymentDao extends DAO {

	
public void addPayment(Payment payment){
		
		try{
			begin();
			getSession().save(payment);
			commit();
			getSession().close();
		}
		catch(HibernateException e){
			System.out.println(e);
		}
	}

}
