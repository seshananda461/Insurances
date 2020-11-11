package com.insurence.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CustomerTransactionRequestDto {
	@NotNull(message ="To Account Number is Mandatory")
	private Long toAccountNumber;
	@NotNull(message ="Amount is Mandatory")
	private double amount;
	@NotNull(message ="Account Number is Mandatory")
	private Long accountNumber;
	@NotEmpty(message="Description is Mandatory")
	private String description;
	private Date date;
	
	public Long getToAccountNumber() {
		return toAccountNumber;
	}
	public void setToAccountNumber(Long toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
