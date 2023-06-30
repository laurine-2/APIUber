package com.laurine.uber.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laurine.uber.entity.PaiementEntity;
import com.laurine.uber.repository.PaiementRepository;

@Service
public class PaiementService {
	private PaiementRepository paiementRepository;

	public PaiementService(PaiementRepository paiementRepository) {
		super();
		this.paiementRepository = paiementRepository;
	}
	
	public List<PaiementEntity> getAllPaiement(){
		return paiementRepository.findAll();
	}
	
	public PaiementEntity getPaiementById(Long idPaiement) {
		return paiementRepository.findById(idPaiement)
				.orElseThrow(() -> new RuntimeException("paiement not found"));
		
	}
	
	public PaiementEntity addPaiement(PaiementEntity paiement) {
		return paiementRepository.save(paiement);
	}
	
	public PaiementEntity updatedPaiement(Long idPaiement, PaiementEntity updatedPaiement) {
		PaiementEntity paiement = getPaiementById(idPaiement);
        paiement.setTypeCarte(updatedPaiement.getTypeCarte());
        paiement.setNumCarte(updatedPaiement.getNumCarte());
        paiement.setCodeCVC(updatedPaiement.getCodeCVC());
        return paiementRepository.save(paiement);
	}
	
	public void deletePaiement(Long idPiament) {
		paiementRepository.deleteById(idPiament);
	}

}
