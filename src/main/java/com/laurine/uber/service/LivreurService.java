package com.laurine.uber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laurine.uber.entity.LivreurEntity;
import com.laurine.uber.repository.LivreurRepository;

@Service
public class LivreurService {
	private LivreurRepository livreurRepository;
	
	@Autowired
	public LivreurService(LivreurRepository livreurRepository) {
		this.livreurRepository = livreurRepository;
	}
	public List<LivreurEntity> getAllLivreur(){
		return livreurRepository.findAll();
	}
	
	public LivreurEntity getLivreurById(Long idLivreur) {
		return livreurRepository.findById(idLivreur)
				.orElseThrow(() -> new RuntimeException("Livreur not found"));
	}
	
	public LivreurEntity addLivreur(LivreurEntity livreur) {
		return livreurRepository.save(livreur);
	}
	
	public LivreurEntity updateLivreur(Long idLivreur, LivreurEntity updatedLivreur) {
		LivreurEntity livreur = getLivreurById(idLivreur);
        livreur.setFirstName(updatedLivreur.getFirstName());
        livreur.setLastName(updatedLivreur.getLastName());
        livreur.setPhone(updatedLivreur.getPhone());
        livreur.setAddress(updatedLivreur.getAddress());
        livreur.setEmail(updatedLivreur.getEmail());
        livreur.setPassword(updatedLivreur.getPassword());
        return livreurRepository.save(livreur);
	}
	
	public void deleteLivreur(Long idLivreur) {
		livreurRepository.deleteById(idLivreur);
	}

}
