package com.lifeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lifeinsurance.model.Insurance;

@Repository
public interface IInsuranceRepository extends JpaRepository<Insurance, Integer> {
	
	void addInsurance(Insurance insurance);
	void updateInsurance(Insurance insurance);
	void deleteInsurance(int insuranceId);
	
	List<Insurance> findAll();
	List<Insurance> findByPlan(int planId);
	
	

}
