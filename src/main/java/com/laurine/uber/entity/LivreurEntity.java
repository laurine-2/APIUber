package com.laurine.uber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="livreur")
public class LivreurEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivreur;
    private String firstName;
    private String lastName;
    private int phone;
    private String address;
    private String email;
    private String password;

    // Constructeurs, getters et setters

    public LivreurEntity() {
    }

    public LivreurEntity(String firstName, String lastName, int phone, String address, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public Long getIdLivreur() {
        return idLivreur;
    }

    public void setIdLivreur(Long idLivreur) {
        this.idLivreur = idLivreur;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

