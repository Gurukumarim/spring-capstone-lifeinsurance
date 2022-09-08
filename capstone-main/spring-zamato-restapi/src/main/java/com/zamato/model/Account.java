package com.zamato.model;

public class Account {

	private Integer accountId;
	private String accountName;
	private long accountNumber;
	private String accountGender;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Integer accountId, String accountName, long accountNumber, String accountGender) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountGender = accountGender;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountGender() {
		return accountGender;
	}

	public void setAccountGender(String accountGender) {
		this.accountGender = accountGender;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", accountNumber=" + accountNumber
				+ ", accountGender=" + accountGender + "]";
	}

}
