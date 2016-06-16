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
@Table(name="supplierDetails")
public class SupplierDetails implements Serializable {

			public SupplierDetails(){
				
			}

			@GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="userID"))
			@Id
			@GeneratedValue(generator="generator")
			@Column(name="user_Id", unique=true, nullable=false)
			private Integer userId;
			
			
			@OneToOne(fetch= FetchType.LAZY)
			@PrimaryKeyJoinColumn
			private UserTable userID;
			
			@Column(name="SupplierName", unique=true, nullable=false, length=30)
			private String supplierName;
			
			@Column(name="Location", unique=true, nullable=false, length=30)
			private String location;
			
			@Column(name="email", unique=true, nullable=false, length=30)
			private String supplierEmail;

			public Integer getUserId() {
				return userId;
			}

			public void setUserId(Integer userId) {
				this.userId = userId;
			}

			public UserTable getUserID() {
				return userID;
			}

			public void setUserID(UserTable userID) {
				this.userID = userID;
			}

			public String getSupplierName() {
				return supplierName;
			}

			public void setSupplierName(String supplierName) {
				this.supplierName = supplierName;
			}

			public String getLocation() {
				return location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getSupplierEmail() {
				return supplierEmail;
			}

			public void setSupplierEmail(String supplierEmail) {
				this.supplierEmail = supplierEmail;
			}

			
			
	}

