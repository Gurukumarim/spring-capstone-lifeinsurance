package com.lifeinsurance.service;

import java.util.List;

import com.lifeinsurance.model.Nominee;

public interface INomineeService {

	void addNominee(Nominee nominee);
	void updateNominee(Nominee nominee );
	void deleteNominee(int age);
	
	List<Nominee> getByNomineeName(String nomineeName);
	Nominee getById(int id);
	List<Nominee> getByNameAndRelation(String name,String relation);
	List<Nominee> getByNameAndAge(String name,int age);
	
}
