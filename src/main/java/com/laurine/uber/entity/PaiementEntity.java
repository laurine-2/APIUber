package com.laurine.uber.entity;

import jakarta.persistence.Column;
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
    
    private String typeCarte;
    @Column
    private int numCarte;
    @Column
    private String codeCVC;
    
    // Constructors, getters bet setters
    
    public PaiementEntity() {
    }

	public PaiementEntity(Long idPaiement, String typeCarte, int numCarte, String codeCVC) {
		super();
		IdPaiement = idPaiement;
		this.typeCarte = typeCarte;
		this.numCarte = numCarte;
		this.codeCVC = codeCVC;
	}

	public Long getIdPaiement() {
		return IdPaiement;
	}

	public void setIdPaiement(Long idPaiement) {
		IdPaiement = idPaiement;
	}

	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	public int getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}

	public String getCodeCVC() {
		return codeCVC;
	}

	public void setCodeCVC(String codeCVC) {
		this.codeCVC = codeCVC;
	}
    
    
}
