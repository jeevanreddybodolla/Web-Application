package com.jeevan.project.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.jeevan.project.pojo.CustomerDetails;
import com.jeevan.project.pojo.SupplierDetails;
import com.jeevan.project.pojo.UserTable;

public class RegistrationDao extends DAO {

	public RegistrationDao(){
		
	}

	public void customerDetails(CustomerDetails cust){
		
		try{
		begin();
		getSession().save(cust);
        commit();
        getSession().close();
		}
		catch(HibernateException e){
			System.out.println(e);
		}
	}
	public void userDetails(UserTable ud){
		
		try{
		begin();
		getSession().save(ud);
        commit();
        getSession().close();
		}
		catch(HibernateException e){
			System.out.println(e);
		}
	}
	
	
	
		public void supplierDetails(SupplierDetails sd){
		
		try{
		begin();
		getSession().save(sd);
        commit();
        getSession().close();
		}
		catch(HibernateException e){
			System.out.println(e);
		}
	}
		
		
		
	
}
