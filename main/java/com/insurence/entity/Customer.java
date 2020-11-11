package com.insurence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer_details")
public class Customer {

	@Id
	@NotNull(message="customer id is mandatory")
	private Integer customerId;
	@NotEmpty(message="customer mail is mandatory")
    private String	customerEmail;
	@NotEmpty(message="customer firstname is mandatory")
    private String customerFirstName;
	@NotEmpty(message="customer lastname is mandatory")
    private String customerLastName;
	@NotEmpty(message="customer login is mandatory")
    private String customerLoginName;
	@Size(message="customer password is mandatory")
    private String password;
	@NotEmpty(message="customer phonenNumber is mandatory")
    private String phoneNo;
	@NotEmpty(message="customer address is mandatory")
    private String address;
	@NotNull(message="customer age  is mandatory")
    private int age;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerLoginName() {
		return customerLoginName;
	}
	public void setCustomerLoginName(String customerLoginName) {
		this.customerLoginName = customerLoginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	private String dob;
	private String pan_no;
}
