package com.insurence.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class FundTransactionDto {

	@NotNull(message ="To Account Number is Mandatory")
	private Long toAccountNumber;
	@NotNull(message ="Amount is Mandatory")
	private double amount;
	@NotNull(message ="Account Number is Mandatory")
	private Long accountNumber;
	@NotEmpty(message="Description is Mandatory")
	private String description;
	private Date date;
	private Long transactionId;

	
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

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	
	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public FundTransactionDto() {
		super(); // TODO Auto-generated constructor stub }

	}
	public FundTransactionDto(Long accountNumber, Long toAccountNumber, double amount, String description, Date date,
			Long transactionId) {
		super();
		this.toAccountNumber = toAccountNumber;
		this.amount = amount;
		this.description = description;
		this.date = date;
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
	}



}