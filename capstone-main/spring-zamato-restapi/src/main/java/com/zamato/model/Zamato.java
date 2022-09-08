package com.zamato.model;

public class Zamato {

	private Integer id;
	private String address;
	private Items customer;
	private Account account;

	public Zamato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Zamato(Integer id, String address, Items customer, Account account) {
		super();
		this.id = id;
		this.address = address;
		this.customer = customer;
		this.account = account;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Items getCustomer() {
		return customer;
	}

	public void setCustomer(Items customer) {
		this.customer = customer;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Zamato [id=" + id + ", address=" + address + ", customer=" + customer + ", account=" + account + "]";
	}

}
