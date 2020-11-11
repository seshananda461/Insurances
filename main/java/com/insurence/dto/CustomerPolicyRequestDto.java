package com.insurence.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CustomerPolicyRequestDto {

	@NotNull(message ="Account Number is Mandatory")
	private Long fromAccount;
	@NotNull(message ="Customer Id is Mandatory")
	@Min(value = 0)
	private int customerId;
	private List<PolicyRequestDto> policyDetails = new ArrayList<PolicyRequestDto>();
	public Long getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Long fromAccount) {
		this.fromAccount = fromAccount;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public List<PolicyRequestDto> getPolicyDetails() {
		return policyDetails;
	}
	public void setPolicyDetails(List<PolicyRequestDto> policyDetails) {
		this.policyDetails = policyDetails;
	}
}
