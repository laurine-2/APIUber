package com.laurine.uber.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EvolutionEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idEvolution;
	 	@Column
	    private double longitude;
	 	@Column
	    private double latitude;
	 	
	 	
		public EvolutionEntity() {
			super();
		}
		public EvolutionEntity(Long idEvolution, double longitude, double latitude) {
			super();
			this.idEvolution = idEvolution;
			this.longitude = longitude;
			this.latitude = latitude;
		}
		public Long getIdEvolution() {
			return idEvolution;
		}
		public void setIdEvolution(Long idEvolution) {
			this.idEvolution = idEvolution;
		}
		public double getLongitude() {
			return longitude;
		}
		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}
		public double getLatitude() {
			return latitude;
		}
		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}
	 	
}
