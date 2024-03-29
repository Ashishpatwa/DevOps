package com.example.customerService.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	
	@Id
	@Column(name="customer_Id")
	private String customerId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="customer_gmail")
	private String gmail;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phone_Number", length=10)
	private Long phnNo;
	
	@Column(name="address")
	private String address;
	
	@Column(name="pincode", length=6)
	private Integer pincode;
	
	@Column(name="data_of_birth")
	private LocalDate dateOfBirth;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getGmail() {
		return gmail;
	}


	public void setGmail(String gmail) {
		this.gmail = gmail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getPhnNo() {
		return phnNo;
	}


	public void setPhnNo(Long phnNo) {
		this.phnNo = phnNo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Integer getPincode() {
		return pincode;
	}


	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
}
