package com.laurine.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurine.uber.entity.PaiementEntity;
@Repository
public interface PaiementRepository extends JpaRepository<PaiementEntity, Long>{

}
