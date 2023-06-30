package com.laurine.uber.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
    private Date date;
    @Column
    private double price;
    @Column
    private String status;
    
    @ManyToMany
    @JoinTable(name = "detail_commande",
            joinColumns = @JoinColumn(name = "commande_id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id"))
    private List<MenuEntity> menus;
    
    @OneToMany(mappedBy = "commande")
    private List<LivraisonEntity> livraison;
    
    
	public CommandeEntity() {
		super();
	}


	public CommandeEntity(Long idCommande, Date date, double price, String status, List<MenuEntity> menus) {
		super();
		this.idCommande = idCommande;
		this.date = date;
		this.price = price;
		this.status = status;
		this.menus = menus;
	}


	public Long getIdCommande() {
		return idCommande;
	}


	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public List<MenuEntity> getMenus() {
		return menus;
	}


	public void setMenus(List<MenuEntity> menus) {
		this.menus = menus;
	}

	

}
