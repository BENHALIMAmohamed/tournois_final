package com.iset.tournois.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "date_creation")
    private Date dateCreation;

	public Equipe() {
		super();
	}

	public Equipe(Long id, String nom, Date dateCreation) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateCreation = dateCreation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
    
}
