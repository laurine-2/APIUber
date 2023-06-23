package com.laurine.uber.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="commande")
public class CommandeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idCommande;

    @Column
    private String listeCommande;

    private String address;
    @Column
    private String status;
    
    @ManyToOne
    @JoinColumn(name = "idClient")
    private ClientEntity client;
    
    @ManyToOne
    @JoinColumn(name ="idRestaurant")
    private RestaurantEntity restaurant;
    
    //@OneToMany(mappedBy = "commande")
   // private List<ArticleCommande> listeArticleCommande;
    
	public CommandeEntity() {
		super();
	}

	public CommandeEntity(Long idCommande, String listeCommande, String address, String status, ClientEntity client) {
		super();
		this.idCommande = idCommande;
		this.listeCommande = listeCommande;
		this.address = address;
		this.status = status;
		this.client = client;
	}

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public String getListeCommande() {
		return listeCommande;
	}

	public void setListeCommande(String listeCommande) {
		this.listeCommande = listeCommande;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ClientEntity getClient() {
		return client;
	}

	public void setClient(ClientEntity client) {
		this.client = client;
	}
	
	
	
	

    
    


}
