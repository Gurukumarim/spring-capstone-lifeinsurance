package com.lifeinsurance.model;

import javax.persistence.Entity;

@Entity
public class Plan {
	
	private String planName;
	private Integer planId;
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plan(String planName) {
		super();
		this.planName = planName;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	@Override
	public String toString() {
		return "Plan [planName=" + planName + "]";
	}
	
	

}
