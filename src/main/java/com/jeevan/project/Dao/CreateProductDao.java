package com.jeevan.project.Dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.jeevan.project.pojo.ProductCategory;
import com.jeevan.project.pojo.Products;

public class CreateProductDao extends DAO {

		
		public CreateProductDao() {
		} 
	
public void addProducts(Products p){
		
		try{
		begin();
		getSession().save(p);
        commit();
        getSession().close();
		}
		catch(HibernateException e){
			System.out.println(e);
		}
	}


	public Products getProducts(String productID) throws Exception  {
	try {
		begin();
		Query q = getSession().createQuery("from Products where productId= :productID");
		q.setString("productID", productID);
		Products category = (Products)q.list().get(0);
		commit();
		return category;
	} catch (HibernateException e) {
		rollback();
		throw new Exception("Could not obtain the named category " + productID + " " + e.getMessage());
	}
}


/*
		public ArrayList<Products> getProducts(String productID){
	
			begin();
			Query q = getSession().createQuery("from Products where productId= :productID ");
			q.setString("productID", productID);
			List list = q.list();
			ArrayList<Products> prodList = new ArrayList<Products>();
			if (!list.isEmpty()){
				for (int i=0;i<list.size();i++)	{
					Products prc = (Products)list.get(i);
					prodList.add(prc);
				}
			}	
			commit();
			//getSession().close();
			return prodList;		
}
		
*/
	
	public Products removeProd(String productID) throws Exception  {
		try {
			begin();
			Query q = getSession().createQuery("delete from Products where productId= :productID");
			q.setString("productId", productID);
			Products category = (Products) q.uniqueResult();
			commit();
			return category;
		} catch (HibernateException e) {
			rollback();
			throw new Exception("Could not obtain the named category " + productID + " " + e.getMessage());
		}
	}
	

}
