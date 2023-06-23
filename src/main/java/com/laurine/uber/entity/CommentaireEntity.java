package com.laurine.uber.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "commentaire")
public class CommentaireEntity {
	
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
    private LocalDateTime timestamp;
	public CommentaireEntity() {
		super();
	}
	public CommentaireEntity(Long idCommentaire, Long idEvolution, Long idClient, String contenu, LocalDateTime timestamp) {
		super();
		this.idCommentaire = idCommentaire;
		this.idEvolution = idEvolution;
		this.idClient = idClient;
		this.contenu = contenu;
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
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
    
    

}
