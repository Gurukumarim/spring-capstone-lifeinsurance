package com.lifeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeinsurance.model.Client;
import com.lifeinsurance.model.Nominee;
import com.lifeinsurance.repository.IClientRepository;
@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	IClientRepository iClientRepository;
	
	@Override
	public void addClient(Client client) {
		
		iClientRepository.save(client);
		
	}

	@Override
	public void updateClient(Client client) {
	
		iClientRepository.save(client);
	}

	@Override
	public void deleteClient(int clientId) {
	
		iClientRepository.deleteById(clientId);
	}

	@Override
	public List<Client> getByName(String clientName) {
		
		return iClientRepository.findByName(clientName);
	}

	@Override
	public List<Client> getById(int clientId) {
		
		return iClientRepository.findById(clientId);
	}

	@Override
	public List<Client> getByNameAndId(String clientName, int clientId) {
		
		return iClientRepository.getByNameAndId(clientName, clientId);
	}

	@Override
	public List<Client> getByIdAndNominee(int clientId, Nominee nominee) {

		return iClientRepository.getByIdAndNominee(clientId, nominee);
	}

	
}
