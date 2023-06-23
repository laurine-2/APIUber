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

import com.laurine.uber.entity.PromotionEntity;
import com.laurine.uber.service.PromotionService;

@RestController
@RequestMapping("/promotion")
public class PromotionController {
	private PromotionService promotionService;

	public PromotionController(PromotionService promotionService) {
		super();
		this.promotionService = promotionService;
	}
	
	@GetMapping
	public List<PromotionEntity> getAllPromotion(){
		return promotionService.getAllPromotion();
	}
	
	@GetMapping("/{idPromotion}")
	public PromotionEntity getPromotionById(@PathVariable Long idPromotion) {
		return promotionService.getPromotionById(idPromotion);
	}
	
	@PostMapping
	public PromotionEntity addPromotion(@RequestBody PromotionEntity promotion) {
		return promotionService.addPromotion(promotion);
	}
	
	@PutMapping("/{idPromotion}")
	public PromotionEntity updatePromotion(@PathVariable Long idPromotion, @RequestBody PromotionEntity updatedPromotion) {
		return promotionService.updatePromotion(idPromotion, updatedPromotion);
	}
	
	@DeleteMapping("/{idPromotion}")
	public void deletePromotion(@PathVariable Long idPromotion) {
		promotionService.deletePromotion(idPromotion);
	}
	

}
