package com.lifeinsurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Insurance {
	
	@Column(length = 30)
	private String insuranceName;
	
	@Id
	@GeneratedValue(generator = "insurance_id" , strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "insurance_id" , sequenceName = "insurance_seq", allocationSize = 10, initialValue = 1)
	private Integer insuranceId;
	
	private double duration;
	
	@OneToOne
	private Plan plan;
	private double premium;
	
	@OneToMany
	private Client client;
	private double sumAssured;
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Insurance(String insuranceName, Integer insuranceId, double duration, Plan plan, double premium,
			Client client, double sumAssured) {
		super();
		this.insuranceName = insuranceName;
		this.insuranceId = insuranceId;
		this.duration = duration;
		this.plan = plan;
		this.premium = premium;
		this.client = client;
		this.sumAssured = sumAssured;
	}

	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public Integer getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public double getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}
	
	@Override
	public String toString() {
		return "Insurance [insuranceName=" + insuranceName + ", insuranceId=" + insuranceId + ", duration=" + duration
				+ ", plan=" + plan + ", premium=" + premium + ", client=" + client + ", sumAssured=" + sumAssured + "]";
	}
	
	
	
	
	
	
	

}
