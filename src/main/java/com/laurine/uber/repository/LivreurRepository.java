package com.laurine.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurine.uber.entity.LivreurEntity;
@Repository
public interface LivreurRepository extends JpaRepository<LivreurEntity, Long>{

}
