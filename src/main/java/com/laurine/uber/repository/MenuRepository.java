package com.laurine.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurine.uber.entity.MenuEntity;
@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Long>{

}
