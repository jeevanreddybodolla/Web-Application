package com.jeevan.project.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.stat.internal.CategorizedStatistics;

import com.jeevan.project.pojo.CustomerDetails;
import com.jeevan.project.pojo.ProductCategory;
import com.jeevan.project.pojo.Products;


public class ProductCategoryDao extends DAO{

	public ProductCategoryDao(){
		
	}
	
		public void addProductCatg(ProductCategory pc){
		
			try{
				begin();
				getSession().save(pc);
				commit();
				getSession().close();
			}
			catch(HibernateException e){
				System.out.println(e);
			}
		}

		public ProductCategory getCategory(String catgName) throws Exception  {
			try {
				begin();
				Query q = getSession().createQuery("from ProductCategory where categoryName= :catgName");
				q.setString("catgName", catgName);
				ProductCategory category = (ProductCategory) q.uniqueResult();
				commit();
				return category;
			} catch (HibernateException e) {
				rollback();
				throw new Exception("Could not obtain the named category " + catgName + " " + e.getMessage());
			}
		}

		public ArrayList<ProductCategory> productCategory(){
			
				begin();
				Query q = getSession().createQuery("from ProductCategory");
				List list = q.list();
				ArrayList<ProductCategory> categoryList = new ArrayList<ProductCategory>();
				if (!list.isEmpty()){
					for (int i=0;i<list.size();i++)	{
						ProductCategory prc = (ProductCategory)list.get(i);
						categoryList.add(prc);
					}
				}
					commit();
					getSession().close();
					return categoryList;		
		}
		
		public ArrayList<Products> viewProducts(){
			
			begin();
			Query q = getSession().createQuery("from Products");
			List list = q.list();
			ArrayList<Products> productsList = new ArrayList<Products>();
			if (!list.isEmpty()){
				for (int i=0;i<list.size();i++)	{
					Products prc = (Products)list.get(i);
					productsList.add(prc);
				}
			}
				commit();
				getSession().close();
				return productsList;		
		}
		
		
		
	
}
