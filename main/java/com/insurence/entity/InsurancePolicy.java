package com.insurence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="insurence_policy")
public class InsurancePolicy {

	@Id
	@NotNull
	private Long policyinsuranceId;
	@NotEmpty
	private String policyinsuranceName;
	@NotEmpty
	private String policyinsuranceDesc;
	@NotNull
	private int policyinsuranceTenure;
	@NotNull
	private double policyinsuranceSumAssured;
	@NotNull
	private double policyinsuranceEmiMonthly;
	@NotNull
	private double policyinsuranceEmiYearly;
	@NotNull
	private double policyinsuranceBenfitAmount;
	@NotNull
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
	public double getPolicyinsuranceEmiMonthly() {
		return policyinsuranceEmiMonthly;
	}
	public void setPolicyinsuranceEmiMonthly(double policyinsuranceEmiMonthly) {
		this.policyinsuranceEmiMonthly = policyinsuranceEmiMonthly;
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
	
	
}
