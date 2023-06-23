package com.laurine.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurine.uber.entity.LivraisonEntity;
@Repository
public interface LivraisonRepository extends JpaRepository<LivraisonEntity, Long>{

}
