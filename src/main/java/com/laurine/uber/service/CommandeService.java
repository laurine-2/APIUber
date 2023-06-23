package com.laurine.uber.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laurine.uber.entity.ClientEntity;
import com.laurine.uber.entity.CommandeEntity;
import com.laurine.uber.repository.CommandeRepository;

@Service
public class CommandeService {
	
	private final CommandeRepository repos;

	public CommandeService(CommandeRepository repos) {
		super();
		this.repos = repos;
	}
	
	public List<CommandeEntity> getAllCommande() {
		return repos.findAll();
		
	}
	
	public CommandeEntity addCommande(CommandeEntity commande) {
		return repos.save(commande);
	}
	
	public CommandeEntity getCommandeById(Long idCommande) {
		return repos.findById(idCommande)
				.orElseThrow(() -> new RuntimeException("Commande not found"));
	}
	
	public CommandeEntity updateCommande(Long idCommande, CommandeEntity updatedCommande) {
		 CommandeEntity commande = getCommandeById(idCommande);
	        commande.setClient(updatedCommande.getClient());
	        commande.setAddress(updatedCommande.getAddress());
	        commande.setStatus(updatedCommande.getStatus());
	        return repos.save(commande);
	}
	public void deleteCommande(Long idCommande) {
		repos.deleteById(idCommande);
	}

}
