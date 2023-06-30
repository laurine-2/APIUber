package com.laurine.uber.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

public class DetailCommande {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinColumn(name = "commande_id")
    private CommandeEntity commande;

    @ManyToMany
    @JoinColumn(name = "menu_id")
    private MenuEntity menu;

    private int quantite;

	public DetailCommande() {
		super();
	}

	public DetailCommande(Long id, CommandeEntity commande, MenuEntity menu, int quantite) {
		super();
		this.id = id;
		this.commande = commande;
		this.menu = menu;
		this.quantite = quantite;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CommandeEntity getCommande() {
		return commande;
	}

	public void setCommande(CommandeEntity commande) {
		this.commande = commande;
	}

	public MenuEntity getMenu() {
		return menu;
	}

	public void setMenu(MenuEntity menu) {
		this.menu = menu;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
    
    
}
