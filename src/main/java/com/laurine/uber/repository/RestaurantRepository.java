package com.laurine.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurine.uber.entity.RestaurantEntity;
@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long>{

}
