package com.laurine.uber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="paiement")
public class PaiementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPaiement;
    
    private String name;
    
    private String description;
    
    private String accountDetails;
    
    // Constructors, getters bet setters
    
    public PaiementEntity() {
    }
    
    public PaiementEntity(String name, String description, String accountDetails) {
        this.name = name;
        this.description = description;
        this.accountDetails = accountDetails;
    }
    
    public Long getPaymentMethodId() {
        return IdPaiement;
    }
    
    public void setPaymentMethodId(Long paymentMethodId) {
        this.IdPaiement = paymentMethodId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getAccountDetails() {
        return accountDetails;
    }
    
    public void setAccountDetails(String accountDetails) {
        this.accountDetails = accountDetails;
    }
}
