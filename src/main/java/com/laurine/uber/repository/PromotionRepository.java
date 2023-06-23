package com.laurine.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurine.uber.entity.PromotionEntity;
@Repository
public interface PromotionRepository extends JpaRepository<PromotionEntity, Long>{

}
