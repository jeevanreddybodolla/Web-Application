package com.jeevan.project.Dao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.jeevan.project.pojo.Products;
import com.jeevan.project.pojo.SupplierDetails;

public class SupplierDao extends DAO{

	public ArrayList<SupplierDetails> viewSupplierDetails(){
		
		begin();
		Query q = getSession().createQuery("from SupplierDetails");
		List list = q.list();
		ArrayList<SupplierDetails> supplierDetails = new ArrayList<SupplierDetails>();
		if (!list.isEmpty()){
			for (int i=0;i<list.size();i++)	{
				SupplierDetails prc = (SupplierDetails)list.get(i);
				supplierDetails.add(prc);
			}
		}
			commit();
			getSession().close();
			return supplierDetails;		
	}
}
