package com.lifeinsurance.service;

import java.util.List;

import com.lifeinsurance.model.Insurance;

public interface IInsuranceService {

	void addInsurance(String insuranceName);
	void updateInsurance(int insuranceId);
	void deleteInsurance(int insuranceId);
	
	List<Insurance> getByInsuranceName(String insuranceName);
	Insurance getByInsuranceId(int insuranceId);
	
}
