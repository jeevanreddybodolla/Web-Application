package com.jeevan.project.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="OrderItem")
public class OrderItem implements Serializable {

		public OrderItem(){
		}
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="orderItemId", unique=true, nullable=false)
		private Integer orderItemId;
		
		@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
		@JoinColumn(name="OrderID", nullable=false)
		private OrderTable orderTable;

		@OneToOne(fetch=FetchType.LAZY)
		@PrimaryKeyJoinColumn
		private Products products;
		
		
		@Column(name="productPrice", unique=false, nullable=false, length=10)
		private float productPrice;
		
		@Column(name="productName", unique=false, nullable=false, length=30)
		private String productName;
		
	
	public String getProductName() {
		return productName;	
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Integer getOrderItemId() {
			return orderItemId;
		}

		public void setOrderItemId(Integer orderItemId) {
			this.orderItemId = orderItemId;
		}

		public Products getProducts() {
			return products;
		}

		public void setProducts(Products products) {
			this.products = products;
		}

		public float getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(float productPrice) {
			this.productPrice = productPrice;
		}

		public OrderTable getOrderTable() {
			return orderTable;
		}

		public void setOrderTable(OrderTable orderTable) {
			this.orderTable = orderTable;
		}

			
}
