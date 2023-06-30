package com.laurine.uber.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="menu")
public class MenuEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMenu;
	@Column
	private String Name;
	@Column
	private String descriotion;
	@Column
	private double price;
	
	@ManyToMany(mappedBy = "menus")
    private List<CommandeEntity> commandes;
	
	public MenuEntity() {
		super();
	}

	public MenuEntity(long idMenu, String name, String descriotion, double price, List<CommandeEntity> commandes) {
		super();
		this.idMenu = idMenu;
		Name = name;
		this.descriotion = descriotion;
		this.price = price;
		this.commandes = commandes;
	}

	public long getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(long idMenu) {
		this.idMenu = idMenu;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescriotion() {
		return descriotion;
	}

	public void setDescriotion(String descriotion) {
		this.descriotion = descriotion;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<CommandeEntity> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<CommandeEntity> commandes) {
		this.commandes = commandes;
	}
	
	

}
