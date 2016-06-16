package com.jeevan.project.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="Payment")
public class Payment implements Serializable{

	public Payment(){
		
	}
	
	@GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="orderid"))
	@Id
	@GeneratedValue(generator="generator")
	@Column(name="OrderID", unique=true, nullable=false)
	private Integer orderId;
	
	@OneToOne(fetch= FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private OrderTable orderTable;
	
	
	@Column(name="cardHolderName", unique=false, nullable=false)
	private String cardHolderName;
	
	@Column(name="cardnumber", unique=false, nullable=false)
	private long cardNumber;
	
	@Column(name="passcode", unique=false, nullable=false)
	private int passcode;

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

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getPasscode() {
		return passcode;
	}

	public void setPasscode(int passcode) {
		this.passcode = passcode;
	}
		
}
