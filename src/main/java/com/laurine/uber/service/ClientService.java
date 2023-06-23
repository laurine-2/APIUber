package com.laurine.uber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laurine.uber.entity.ClientEntity;
import com.laurine.uber.repository.ClientRepository;

@Service
public class ClientService {
	private ClientRepository repos;

	@Autowired
	public ClientService(ClientRepository repos) {
		super();
		this.repos = repos;
	}
	public List<ClientEntity> getAllClient(ClientRepository repos){
		return repos.findAll();
		
	}
	
	public ClientEntity getClientById(Long idClient) {
		return repos.findById(idClient)
				.orElseThrow(() -> new RuntimeException("Client not found"));
	}
	
	public ClientEntity addClient(ClientEntity clientEntity) {
		return repos.save(clientEntity);
	}
	
	public ClientEntity updateClient(Long idClient, ClientEntity updatedClient) {
		ClientEntity client = getClientById(idClient);
		client.setFirstName(updatedClient.getFirstName());
        client.setLastName(updatedClient.getLastName());
        client.setPhone(updatedClient.getPhone());
        client.setAddress(updatedClient.getAddress());
        client.setEmail(updatedClient.getEmail());
        client.setPassword(updatedClient.getPassword());
        return repos.save(client);
		
	}
	
	public void deleteClient(Long idClient) {
		repos.deleteById(idClient);
	}
	
	
	
	

}
