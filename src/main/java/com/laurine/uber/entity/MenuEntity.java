package com.laurine.uber.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	public MenuEntity() {
		super();
	}
	public MenuEntity(long idMenu, String name, String descriotion, double price) {
		super();
		this.idMenu = idMenu;
		Name = name;
		this.descriotion = descriotion;
		this.price = price;
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
	

}
