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

import com.laurine.uber.entity.CommandeEntity;
import com.laurine.uber.service.CommandeService;

@RestController
@RequestMapping("/commande")
public class CommandeController {
	private  CommandeService commande;
	@Autowired
	public CommandeController(CommandeService commande) {
		super();
		this.commande = commande;
	}
	@GetMapping
	public List<CommandeEntity> getAllCommande(){
		return commande.getAllCommande();
	}
	@GetMapping("/{idCommande}")
	public CommandeEntity getCommandeById(@PathVariable Long idCommande) {
		return commande.getCommandeById(idCommande);
	}
	
	@PostMapping
	public CommandeEntity addCommande(@RequestBody CommandeEntity commande) {
		return this.commande.addCommande(commande);
	}
	@PutMapping("/{idCommandee}")
	public CommandeEntity updateCommande(@PathVariable Long idCommande, @RequestBody CommandeEntity updateCommande) {
		return commande.updateCommande(idCommande, updateCommande);
	}
	
	@DeleteMapping("/{idCommande}")
	public void deleteCommande(@PathVariable Long idCommande) {
		commande.deleteCommande(idCommande);
	}
	

}
