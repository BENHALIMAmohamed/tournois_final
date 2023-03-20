package com.iset.tournois.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entraineur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nom")
    private String nom;

    @Column(name = "date_naissance")
    private Date dateNaissance;

    @Column(name = "salaire")
    private Float salaire;

	public Entraineur() {
		super();
	}

	public Entraineur(Long id, String nom, Date dateNaissance, Float salaire) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.salaire = salaire;
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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Float getSalaire() {
		return salaire;
	}

	public void setSalaire(Float salaire) {
		this.salaire = salaire;
	}

    
}
