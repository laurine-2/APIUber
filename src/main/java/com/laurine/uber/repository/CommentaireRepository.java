package com.laurine.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurine.uber.entity.CommentaireEntity;
@Repository
public interface CommentaireRepository extends JpaRepository<CommentaireEntity, Long>{

}
