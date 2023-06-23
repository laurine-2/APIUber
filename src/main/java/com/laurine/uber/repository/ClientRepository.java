package com.laurine.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurine.uber.entity.ClientEntity;

import ch.qos.logback.core.net.server.Client;
@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long>{

}
