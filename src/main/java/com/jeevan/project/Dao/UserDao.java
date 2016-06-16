package com.jeevan.project.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.jeevan.project.exception.AdException;
import com.jeevan.project.pojo.CustomerDetails;
import com.jeevan.project.pojo.UserTable;


public class UserDao extends DAO{

	
	public UserDao(){	
	}
	
	public UserTable validate(String username, String password)
            throws AdException {
        try {
            begin();
            
            
            Query query = getSession().createQuery("from UserTable where username ='"+username+"' and password='"+password+"'");
            System.out.println("the value is query"+query);
            UserTable user = (UserTable)query.uniqueResult();
//            if (user == null) {
//                throw new RuntimeException("Unable to find useraccount for username :" + username);
//           }
           commit();
         //  getSession().close();
           return user;
        } 
        catch (HibernateException e) {
            rollback();
            throw new AdException("Could not get user " + username, e);
        }
    }
	
	
	public Integer findID(String userName)
	{
		begin();
        Query query = getSession().createQuery("from UserTable where username ='"+userName+"'");
        
        UserTable user = (UserTable)query.list().get(0);
        commit();
       // getSession().close();
      return user.getUserId();
	}
	
	public CustomerDetails findByuserId(int userId)
	{
		begin();
        Query query = getSession().createQuery("from CustomerDetails where userId ='"+userId+"'");
        
        CustomerDetails customerDetails = (CustomerDetails)query.list().get(0);
        commit();
       // getSession().close();
      return customerDetails;
	}
	
	
}
