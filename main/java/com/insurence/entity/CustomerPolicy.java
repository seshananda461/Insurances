package com.insurence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customer_policy")
public class CustomerPolicy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long customerPolicyNumber;
	@NotNull
	private int customerId;
	@NotNull
	private Long PolicyId;
	@NotEmpty
	private String status;
	public Long getCustomerPolicyNumber() {
		return customerPolicyNumber;
	}
	public void setCustomerPolicyNumber(Long customerPolicyNumber) {
		this.customerPolicyNumber = customerPolicyNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Long getPolicyId() {
		return PolicyId;
	}
	public void setPolicyId(Long policyId) {
		PolicyId = policyId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
