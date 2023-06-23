package com.laurine.uber.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant")
public class RestaurantEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommentaire;
	@Column
    private Long idEvolution;
	@Column
    private Long idClient;
	@Column
    private String contenu;
	@Column
    private String name;
	@Column
    private Date horaire;
	@Column
    private String specialiteRestaurant;
	@Column
    private int phone;
	@Column
    private String Address;
	@Column
    private String email;
	@Column
    private LocalDateTime timestamp;

	public RestaurantEntity() {
		super();
	}

	public RestaurantEntity(Long idCommentaire, Long idEvolution, Long idClient, String contenu, String name,
			Date horaire, String specialiteRestaurant, int phone, String address, String email,
			LocalDateTime timestamp) {
		super();
		this.idCommentaire = idCommentaire;
		this.idEvolution = idEvolution;
		this.idClient = idClient;
		this.contenu = contenu;
		this.name = name;
		this.horaire = horaire;
		this.specialiteRestaurant = specialiteRestaurant;
		this.phone = phone;
		Address = address;
		this.email = email;
		this.timestamp = timestamp;
	}

	public Long getIdCommentaire() {
		return idCommentaire;
	}

	public void setIdCommentaire(Long idCommentaire) {
		this.idCommentaire = idCommentaire;
	}

	public Long getIdEvolution() {
		return idEvolution;
	}

	public void setIdEvolution(Long idEvolution) {
		this.idEvolution = idEvolution;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHoraire() {
		return horaire;
	}

	public void setHoraire(Date horaire) {
		this.horaire = horaire;
	}

	public String getSpecialiteRestaurant() {
		return specialiteRestaurant;
	}

	public void setSpecialiteRestaurant(String specialiteRestaurant) {
		this.specialiteRestaurant = specialiteRestaurant;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	

}
