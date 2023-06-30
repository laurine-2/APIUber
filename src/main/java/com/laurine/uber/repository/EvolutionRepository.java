package com.laurine.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurine.uber.entity.EvolutionEntity;
@Repository
public interface EvolutionRepository extends JpaRepository<EvolutionEntity, Long>{

}
