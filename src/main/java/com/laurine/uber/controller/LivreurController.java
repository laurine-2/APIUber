package com.laurine.uber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laurine.uber.entity.LivreurEntity;
import com.laurine.uber.service.LivreurService;

@RestController
@RequestMapping("/livreur")
public class LivreurController {
	private LivreurService livreurService;
	@Autowired
	public LivreurController(LivreurService livreurService) {
		this.livreurService = livreurService;
	}
	
	@GetMapping
	public List<LivreurEntity> getAllLivreur(){
		return livreurService.getAllLivreur();
	}
	
	@GetMapping("/{idLivreur}")
	public LivreurEntity getLivreurById(@PathVariable Long idLivreur) {
		return livreurService.getLivreurById(idLivreur);
	}
	
	@PostMapping
	public LivreurEntity addLivreur(@RequestBody LivreurEntity livreur) {
		return this.livreurService.addLivreur(livreur);
	}
	
	@PutMapping("/{idLivreur}")
	public LivreurEntity updateLivreur(@PathVariable Long idLivreur, @RequestBody LivreurEntity updatedLivreur) {
		return livreurService.updateLivreur(idLivreur, updatedLivreur);
	}
	
	@DeleteMapping("/{idLivreur}")
	public void deleteLivreur(@PathVariable Long idLivreur) {
		livreurService.deleteLivreur(idLivreur);
	}
	
	

}
