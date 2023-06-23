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

import com.laurine.uber.entity.LivraisonEntity;
import com.laurine.uber.service.LivraisonService;

@RestController
@RequestMapping("/livraison")
public class LivraisonController {
	private LivraisonService livraisonService;

	
	
	public LivraisonController(LivraisonService livraisonService) {
		super();
		this.livraisonService = livraisonService;
	}

	@GetMapping
	public List<LivraisonEntity> getAllLivraison(){
		return livraisonService.getAllLivraison();
	}
	
	@GetMapping("/{idLivraison}")
	public LivraisonEntity getLivraisonById(@PathVariable Long idLivraison) {
		return livraisonService.getLivraisonById(idLivraison);
	}
	
	@PostMapping
	public LivraisonEntity addLivraison(@RequestBody LivraisonEntity livraison) {
		return livraisonService.addLivraison(livraison);
		
	}
	
	@PutMapping("/{idLivraison}")
	public LivraisonEntity updateLivraison(@PathVariable Long idLivraison, @RequestBody LivraisonEntity updatedLivraison) {
		return livraisonService.updateLivraison(idLivraison, updatedLivraison);
	}
	
	@DeleteMapping("/{livraison}")
	public void deleteLivraison(@PathVariable Long idLivraison) {
		livraisonService.deleteLivraison(idLivraison);
	}
	
	

}
