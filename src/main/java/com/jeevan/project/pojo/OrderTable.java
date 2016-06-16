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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="orderTable")
public class OrderTable implements Serializable {

	
	public OrderTable(){
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="OrderID", unique=true, nullable=false)
	private Integer orderid;
	
//	@GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="userTab"))
//	@Id
//	@GeneratedValue(generator="generator")
//	@Column(name="userName", unique=true, nullable=false)
//	private String userName;
	
//	@OneToOne(fetch= FetchType.LAZY)
//	@PrimaryKeyJoinColumn
//	private UserTable userTab;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="customerID",nullable=false)
	private CustomerDetails customer;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="orderTable", cascade=CascadeType.ALL)
	private Set<OrderItem> orderitems= new HashSet<OrderItem>();
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="orderTable", cascade=CascadeType.ALL)
	private Invoice invoice;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="orderTable", cascade=CascadeType.ALL)
	private Payment payment;

//	@OneToOne(fetch= FetchType.LAZY)
//	@PrimaryKeyJoinColumn
//	private CustomerDetails customerDetails;
	
	@Column(name="orderPrice", unique=false, nullable=false, length=20)
	private float orderPrice;
	
	@Column(name="orderStatus", unique=false, nullable=false, length=20)
	private String orderStatus;
	
	
	
	public CustomerDetails getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDetails customer) {
		this.customer = customer;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public float getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(float orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Set<OrderItem> getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(Set<OrderItem> orderitems) {
		this.orderitems = orderitems;
	}

	
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
