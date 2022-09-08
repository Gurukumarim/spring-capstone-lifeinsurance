package com.lifeinsurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Client {
	@Column(length = 20)
	private String clientName;
	@Id
	@GeneratedValue(generator = "client_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="client_id",sequenceName = "client_seq",allocationSize = 10,initialValue = 1)
	private Integer clientId;
	private long phoneNumber;
	@OneToOne
	private Nominee nominee;
	
	private Address address;
	
	private Insurance insurance;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String clientName, long phoneNumber, Nominee nominee, Address address) {
		super();
		this.clientName = clientName;
		this.phoneNumber = phoneNumber;
		this.nominee = nominee;
		this.address = address;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Nominee getNominee() {
		return nominee;
	}

	public void setNominee(Nominee nominee) {
		this.nominee = nominee;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "Client [clientName=" + clientName + ", phoneNumber=" + phoneNumber + ", nominee=" + nominee
				+ ", address=" + address + "]";
	}
	
	

}
