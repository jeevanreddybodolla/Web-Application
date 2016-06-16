package com.jeevan.project.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="userTable")
public class UserTable implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_Id", unique=true, nullable=false)
	private Integer userId;
	
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="userTable", cascade=CascadeType.ALL)
	private CustomerDetails customerDetails;
	
//	@OneToOne(fetch=FetchType.LAZY, mappedBy="userTab", cascade=CascadeType.ALL)
//	private OrderTable orderTable;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="userID", cascade=CascadeType.ALL)
	private SupplierDetails supplierDetails;
	
	@Column(name="UserName", unique=true, length=10)
	private String username;
	
	@Column(name="Password", unique=false, length=30)
	private String password;
	
	@Column(name="cnfrmPassword", unique=false, length=30)
	private String cnfrmPassword;
	
	@Column(name="UserRole", unique=false, length=30)
	private String role;
	

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCnfrmPassword() {
		return cnfrmPassword;
	}

	public void setCnfrmPassword(String cnfrmPassword) {
		this.cnfrmPassword = cnfrmPassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public SupplierDetails getSupplierDetails() {
		return supplierDetails;
	}

	public void setSupplierDetails(SupplierDetails supplierDetails) {
		this.supplierDetails = supplierDetails;
	}
	
}
