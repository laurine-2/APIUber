package com.laurine.uber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laurine.uber.entity.LivraisonEntity;
import com.laurine.uber.repository.LivraisonRepository;

@Service
public class LivraisonService {
	private LivraisonRepository livraisonRepository;

	
	@Autowired
	public LivraisonService(LivraisonRepository livraisonRepository) {
		super();
		this.livraisonRepository = livraisonRepository;
	}
	public List<LivraisonEntity> getAllLivraison(){
		return livraisonRepository.findAll();
		
	}
	
	public LivraisonEntity getLivraisonById(Long idLivraison) {
		return livraisonRepository.findById(idLivraison)
				.orElseThrow(() -> new RuntimeException("Livraison not found"));
		
	}
	
	public LivraisonEntity addLivraison(LivraisonEntity livraison) {
		return livraisonRepository.save(livraison);
	}
	
	public LivraisonEntity updateLivraison(Long idLivraison, LivraisonEntity updatedLivraison) {
		 LivraisonEntity livraison = getLivraisonById(idLivraison);
	        livraison.setIdCommande(updatedLivraison.getIdCommande());
	        livraison.setIdLivreur(updatedLivraison.getIdLivreur());
	        livraison.setStatus(updatedLivraison.getStatus());
	        livraison.setEstimationDeLivraison(updatedLivraison.getEstimationDeLivraison());
	        return livraisonRepository.save(livraison);
		
	}
	
	public void deleteLivraison(Long idLivraison) {
		livraisonRepository.deleteById(idLivraison);
	}

	

}
