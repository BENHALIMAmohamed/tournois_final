package com.iset.tournois.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "Example")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom")
    private String nom;
    
    @OneToMany
    @JsonIgnoreProperties({"equipe"})
    private List<Tiers> tiers = new ArrayList<Tiers>();
    
    @ManyToOne
    @JsonIgnoreProperties({"matchs", "tournois"})
    private Journee journee;
    
	public Match() {
		super();
	}
	
	public Match(Long id, String nom, List<Tiers> tiers, Journee journee) {
		super();
		this.id = id;
		this.nom = nom;
		this.tiers = tiers;
		this.journee = journee;
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

	public List<Tiers> getTiers() {
		return tiers;
	}

	public void setTiers(List<Tiers> tiers) {
		this.tiers = tiers;
	}

	public Journee getJournee() {
		return journee;
	}

	public void setJournee(Journee journee) {
		this.journee = journee;
	}
    
}
