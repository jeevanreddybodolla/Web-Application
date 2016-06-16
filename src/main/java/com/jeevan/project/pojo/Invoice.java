package com.jeevan.project.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="Invoice")
public class Invoice implements Serializable{

	
	public Invoice(){
		
	}
	
	@GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="orderid"))
	@Id
	@GeneratedValue(generator="generator")
	@Column(name="OrderID", unique=true, nullable=false)
	private Integer orderId;
	
	@OneToOne(fetch= FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private OrderTable orderTable;
	
	//@Temporal(TemporalType.TIMESTAMP)
	@Column(name="InvoiceDate", unique=false, nullable=false)
	private Timestamp invoiceDate;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public OrderTable getOrderTable() {
		return orderTable;
	}

	public void setOrderTable(OrderTable orderTable) {
		this.orderTable = orderTable;
	}

	public Timestamp getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Timestamp invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	
	
	
	
}
