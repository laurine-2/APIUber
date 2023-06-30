package com.laurine.uber.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "livraison")
public class LivraisonEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idLivraison;
    @Column
    private String status;
    
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private CommandeEntity commande;
    
	public LivraisonEntity() {
		super();
	}

	public LivraisonEntity(Long idLivraison, String status, CommandeEntity commande) {
		super();
		this.idLivraison = idLivraison;
		this.status = status;
		this.commande = commande;
	}

	public Long getIdLivraison() {
		return idLivraison;
	}

	public void setIdLivraison(Long idLivraison) {
		this.idLivraison = idLivraison;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CommandeEntity getCommande() {
		return commande;
	}

	public void setCommande(CommandeEntity commande) {
		this.commande = commande;
	}

	

}
