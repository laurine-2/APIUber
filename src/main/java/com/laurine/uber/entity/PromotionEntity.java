package com.laurine.uber.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="promotion")
public class PromotionEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPromotion;
	@Column
    private String codePromo;
	@Column
    private String description;
	@Column
    private LocalDate dateStart;
	@Column
    private LocalDate dateEnd;
	@Column
    private String conditionEligibilite;
	public PromotionEntity() {
		super();
	}
	public PromotionEntity(Long idPromotion, String codePromo, String description, LocalDate dateStart,
			LocalDate dateEnd, String conditionEligibilite) {
		super();
		this.idPromotion = idPromotion;
		this.codePromo = codePromo;
		this.description = description;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.conditionEligibilite = conditionEligibilite;
	}
	public Long getIdPromotion() {
		return idPromotion;
	}
	public void setIdPromotion(Long idPromotion) {
		this.idPromotion = idPromotion;
	}
	public String getCodePromo() {
		return codePromo;
	}
	public void setCodePromo(String codePromo) {
		this.codePromo = codePromo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDateStart() {
		return dateStart;
	}
	public void setDateStart(LocalDate dateStart) {
		this.dateStart = dateStart;
	}
	public LocalDate getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}
	
	public String getConditionEligibilite() {
		return conditionEligibilite;
	}
	public void setConditionEligibilite(String conditionEligibilite) {
		this.conditionEligibilite = conditionEligibilite;
	}
	public void setCondition(String condition) {
		this.conditionEligibilite = condition;
	}
	

}
