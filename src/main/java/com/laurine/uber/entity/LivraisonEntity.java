package com.laurine.uber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "livraison")
public class LivraisonEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idLivraison;
    private Long idCommande;
    private Long idLivreur;
    private String status;
    private String estimationDeLivraison;
    
	public LivraisonEntity() {
		super();
	}

	public LivraisonEntity(Long idCommande, Long idLivreur, String status, String estimationDeLivraison) {
		super();
		this.idCommande = idCommande;
		this.idLivreur = idLivreur;
		this.status = status;
		this.estimationDeLivraison = estimationDeLivraison;
	}

	public LivraisonEntity(Long idLivraison, Long idCommande, Long idLivreur, String status, String estimationDeLivraison) {
		super();
		this.idLivraison = idLivraison;
		this.idCommande = idCommande;
		this.idLivreur = idLivreur;
		this.status = status;
		this.estimationDeLivraison = estimationDeLivraison;
	}

	public Long getIdLivraison() {
		return idLivraison;
	}

	public void setIdLivraison(Long idLivraison) {
		this.idLivraison = idLivraison;
	}

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Long getIdLivreur() {
		return idLivreur;
	}

	public void setIdLivreur(Long idLivreur) {
		this.idLivreur = idLivreur;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEstimationDeLivraison() {
		return estimationDeLivraison;
	}

	public void setEstimationDeLivraison(String estimationDeLivraison) {
		this.estimationDeLivraison = estimationDeLivraison;
	}
	
    
    

}
