package com.laurine.uber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laurine.uber.entity.ClientEntity;
import com.laurine.uber.service.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {
	private final ClientService clientService;
	
	@Autowired
	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}
	
	@GetMapping
	public List<ClientEntity> getAllClient(){
		return clientService.getAllClient(null);
	}
	
	@GetMapping("/{idClient}")
	public ClientEntity getClientById(@PathVariable Long idClient) {
		return clientService.getClientById(idClient);
	}
	
	@PostMapping
	public ClientEntity addClient(@RequestBody ClientEntity clientEntity) {
		return clientService.addClient(clientEntity);
	}
	
	@PutMapping("/{idClient}")
	public ClientEntity updateClient(@PathVariable Long idClient, @RequestBody ClientEntity updateClient) {
		return clientService.updateClient(idClient, updateClient);
	}
	
	@DeleteMapping("/{idClient}")
	public void deleteClient(@PathVariable Long idClient) {
		clientService.deleteClient(idClient);
	}
	
	
	
	

}
