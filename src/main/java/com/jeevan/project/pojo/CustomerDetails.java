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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="customerDetails")
public class CustomerDetails implements Serializable {

	
		public CustomerDetails(){
		}
	
		@GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="userTable"))
		@Id
		@GeneratedValue(generator="generator")
		@Column(name="user_Id", unique=true, nullable=false)
		private Integer userId;
		
		@OneToOne(fetch= FetchType.LAZY)
		@PrimaryKeyJoinColumn
		private UserTable userTable;
		
//		@OneToOne(fetch=FetchType.LAZY, mappedBy="customerDetails", cascade=CascadeType.ALL)
//		private OrderTable orderTable;
		
		@Column(name="FirstName", unique=false, nullable=false, length=30)
		private String firstName;
		
		@Column(name="LastName", unique=false, nullable=false, length=30)
		private String lastName;
		
		@Column(name="Mobile", unique=true, nullable=false, length=30)
		private long mobile;
		
		@Column(name="Email", unique=true, nullable=false, length=30)
		private String email;
		
		@Column(name="Gender", unique=false, nullable=false, length=10)
		private String gender;
	
		@Column(name="Address", unique=false, nullable=false, length=40)
		private String address;
		
		@Column(name="City", unique=false, nullable=false, length=20)
		private String city;
	
		@Column(name="State", unique=false, nullable=false, length=40)
		private String state;
		
		@OneToMany(fetch=FetchType.LAZY, mappedBy="customer", cascade=CascadeType.ALL)
		private Set<OrderTable> orders = new HashSet<OrderTable>();
		
		

		public Set<OrderTable> getOrders() {
			return orders;
		}

		public void setOrders(Set<OrderTable> orders) {
			this.orders = orders;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		
		public UserTable getUserTable() {
			return userTable;
		}

		public void setUserTable(UserTable userTable) {
			this.userTable = userTable;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public long getMobile() {
			return mobile;
		}

		public void setMobile(long mobile) {
			this.mobile = mobile;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
	
		
		
		
}
