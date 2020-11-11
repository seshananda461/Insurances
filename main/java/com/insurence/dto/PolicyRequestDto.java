package com.insurence.dto;

import javax.validation.constraints.NotNull;

public class PolicyRequestDto {

	@NotNull(message="Policy Insurance Number is Mandatory")
	private Long insuranceNumber;
	@NotNull(message="Policy Insurance Emi yearly is Mandatory")
	private boolean yearlyEmi;

	public boolean isYearlyEmi() {
		return yearlyEmi;
	}

	public void setYearlyEmi(boolean yearlyEmi) {
		this.yearlyEmi = yearlyEmi;
	}

	public Long getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(Long insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

}
