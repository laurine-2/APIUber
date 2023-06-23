package com.laurine.uber.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laurine.uber.entity.PaiementEntity;
import com.laurine.uber.service.PaiementService;

@RestController
@RequestMapping("/paiement")
public class PaiementController {
	private PaiementService paiementService;

	public PaiementController(PaiementService paiementService) {
		super();
		this.paiementService = paiementService;
	}
	
	@GetMapping
	public List<PaiementEntity> getAllPaiement(){
		return paiementService.getAllPaiement();
	}
	@GetMapping("/{idPaiement}")
	public PaiementEntity getPaiementById(@PathVariable Long idPaiement) {
		return paiementService.getPaiementById(idPaiement);
	}
	
	@PostMapping
	public PaiementEntity addPaiement(@RequestBody PaiementEntity paiement) {
		return paiementService.addPaiement(paiement);
	}
	@PutMapping("/{idPaiement}")
	public PaiementEntity updatePaiement(@PathVariable Long idPaiement, @RequestBody PaiementEntity updatePaiement) {
		return paiementService.updatedPaiement(idPaiement, updatePaiement);
	}
	
	@DeleteMapping("/{idPaiement}")
	public void deletePiament(@PathVariable Long idPaiement) {
		paiementService.deletePaiement(idPaiement);
	}
}
