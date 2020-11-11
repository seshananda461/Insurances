package com.insurence.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class InsurancePolicyDto {

	@NotNull(message="Policy Insurance Id is Mandatory")
	private Long policyinsuranceId;
	@NotEmpty(message="Policy Insurance Name is Mandatory")
	private String policyinsuranceName;
	@NotEmpty(message="Policy Insurance Description is Mandatory")
	private String policyinsuranceDesc;
	@NotNull(message="Policy Insurance Tenture is Mandatory")
	private int policyinsuranceTenure;
	@NotNull(message="Policy Insurance Sum Assured is Mandatory")
	private double policyinsuranceSumAssured;
	@NotNull(message="Policy Insurance Emi yearly is Mandatory")
	private double policyinsuranceEmiYearly;
	@NotNull(message="Policy Insurance Benfit Amount is Mandatory")
	private double policyinsuranceBenfitAmount;
	@NotNull(message="To Account is Mandatory")
	private Long toAccount;

	public Long getPolicyinsuranceId() {
		return policyinsuranceId;
	}

	public void setPolicyinsuranceId(Long policyinsuranceId) {
		this.policyinsuranceId = policyinsuranceId;
	}

	public String getPolicyinsuranceName() {
		return policyinsuranceName;
	}

	public void setPolicyinsuranceName(String policyinsuranceName) {
		this.policyinsuranceName = policyinsuranceName;
	}

	public String getPolicyinsuranceDesc() {
		return policyinsuranceDesc;
	}

	public void setPolicyinsuranceDesc(String policyinsuranceDesc) {
		this.policyinsuranceDesc = policyinsuranceDesc;
	}

	public int getPolicyinsuranceTenure() {
		return policyinsuranceTenure;
	}

	public void setPolicyinsuranceTenure(int policyinsuranceTenure) {
		this.policyinsuranceTenure = policyinsuranceTenure;
	}

	public double getPolicyinsuranceSumAssured() {
		return policyinsuranceSumAssured;
	}

	public void setPolicyinsuranceSumAssured(double policyinsuranceSumAssured) {
		this.policyinsuranceSumAssured = policyinsuranceSumAssured;
	}

	public double getPolicyinsuranceEmiYearly() {
		return policyinsuranceEmiYearly;
	}

	public void setPolicyinsuranceEmiYearly(double policyinsuranceEmiYearly) {
		this.policyinsuranceEmiYearly = policyinsuranceEmiYearly;
	}

	public double getPolicyinsuranceBenfitAmount() {
		return policyinsuranceBenfitAmount;
	}

	public void setPolicyinsuranceBenfitAmount(double policyinsuranceBenfitAmount) {
		this.policyinsuranceBenfitAmount = policyinsuranceBenfitAmount;
	}

	public Long getToAccount() {
		return toAccount;
	}

	public void setToAccount(Long toAccount) {
		this.toAccount = toAccount;
	}

	public InsurancePolicyDto(Long policyinsuranceId, String policyinsuranceName, String policyinsuranceDesc,
			int policyinsuranceTenure, double policyinsuranceSumAssured, double policyinsuranceEmiYearly,
			double policyinsuranceBenfitAmount, Long toAccount) {
		super();
		this.policyinsuranceId = policyinsuranceId;
		this.policyinsuranceName = policyinsuranceName;
		this.policyinsuranceDesc = policyinsuranceDesc;
		this.policyinsuranceTenure = policyinsuranceTenure;
		this.policyinsuranceSumAssured = policyinsuranceSumAssured;
		this.policyinsuranceEmiYearly = policyinsuranceEmiYearly;
		this.policyinsuranceBenfitAmount = policyinsuranceBenfitAmount;
		this.toAccount = toAccount;
	}

	public InsurancePolicyDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
