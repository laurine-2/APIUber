package com.laurine.uber.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laurine.uber.entity.PromotionEntity;
import com.laurine.uber.repository.PromotionRepository;

@Service
public class PromotionService {
	private PromotionRepository promotionRepository;

	public PromotionService(PromotionRepository promotionRepository) {
		super();
		this.promotionRepository = promotionRepository;
	}
	
	public List<PromotionEntity> getAllPromotion(){
		return promotionRepository.findAll();
	}
	
	public PromotionEntity getPromotionById(Long idPromotion) {
		return promotionRepository.findById(idPromotion)
				.orElseThrow(() -> new RuntimeException("promotion not found"));
	}
	
	public PromotionEntity addPromotion(PromotionEntity promotion) {
		return promotionRepository.save(promotion);
	}
	
	public PromotionEntity updatePromotion(Long idPromotion, PromotionEntity updatedPromotion) {
		PromotionEntity promotion = getPromotionById(idPromotion);
        promotion.setCodePromo(updatedPromotion.getCodePromo());
        promotion.setDescription(updatedPromotion.getDescription());
        promotion.setDateStart(updatedPromotion.getDateStart());
        promotion.setDateEnd(updatedPromotion.getDateEnd());
        promotion.setConditionEligibilite(updatedPromotion.getConditionEligibilite());
        return promotionRepository.save(promotion);
	}
	
	public void deletePromotion(Long idPromotion) {
		promotionRepository.deleteById(idPromotion);
	}
	
	
	
}
