package com.laurine.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurine.uber.entity.AdminEntity;
@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long>{

}
