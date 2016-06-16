package com.jeevan.project.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ProductCategory")
public class ProductCategory implements Serializable {

	public ProductCategory(){	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productCategory_Id", unique=true, nullable=false)
	private Integer productCategory_id;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="productCategory", cascade=CascadeType.ALL)
	private Set<Products> products = new HashSet<Products>();
	
	@Column(name="categoryName", unique=true, nullable=false, length=30)
	private String categoryName;

	public Integer getProductCategory_id() {
		return productCategory_id;
	}

	public void setProductCategory_id(Integer productCategory_id) {
		this.productCategory_id = productCategory_id;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


}
