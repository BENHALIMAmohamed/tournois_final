package com.iset.tournois.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;


@MappedSuperclass
public class Joueur {

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

    @Column(name = "matchs_joues")
    private Integer matchsJoues;

    @Column(name = "avertissements_recus")
    private Integer avertissementsRecus;

    @Column(name = "avertissements_actifs")
    private Integer avertissementsActifs;

    @Column(name = "total_explusions")
    private Integer totalExplusions;

    @Column(name = "matchs_suspendus")
    private Integer matchsSuspendus;

    @Column(name = "etat")
    private Boolean etat;
    
    @ManyToOne
    private Equipe equipe;
    
    @OneToMany(cascade = CascadeType.PERSIST)

    private List<But> buts = new ArrayList<But>();
    
    @ManyToMany(cascade = CascadeType.PERSIST)
 
    private List<Tiers> titulaires = new ArrayList<Tiers>();
    
    @ManyToMany(cascade = CascadeType.PERSIST)

    private List<Tiers> remplacants = new ArrayList<Tiers>();

	public Joueur() {
		super();
	}

	public Joueur(Long id, String nom, Date dateNaissance, Float salaire, Integer matchsJoues,
			Integer avertissementsRecus, Integer avertissementsActifs, Integer totalExplusions, Integer matchsSuspendus,
			Boolean etat, Equipe equipe, List<But> buts, List<Tiers> titulaires, List<Tiers> remplacants) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.salaire = salaire;
		this.matchsJoues = matchsJoues;
		this.avertissementsRecus = avertissementsRecus;
		this.avertissementsActifs = avertissementsActifs;
		this.totalExplusions = totalExplusions;
		this.matchsSuspendus = matchsSuspendus;
		this.etat = etat;
		this.equipe = equipe;
		this.buts = buts;
		this.titulaires = titulaires;
		this.remplacants = remplacants;
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

	public Integer getMatchsJoues() {
		return matchsJoues;
	}

	public void setMatchsJoues(Integer matchsJoues) {
		this.matchsJoues = matchsJoues;
	}

	public Integer getAvertissementsRecus() {
		return avertissementsRecus;
	}

	public void setAvertissementsRecus(Integer avertissementsRecus) {
		this.avertissementsRecus = avertissementsRecus;
	}

	public Integer getAvertissementsActifs() {
		return avertissementsActifs;
	}

	public void setAvertissementsActifs(Integer avertissementsActifs) {
		this.avertissementsActifs = avertissementsActifs;
	}

	public Integer getTotalExplusions() {
		return totalExplusions;
	}

	public void setTotalExplusions(Integer totalExplusions) {
		this.totalExplusions = totalExplusions;
	}

	public Integer getMatchsSuspendus() {
		return matchsSuspendus;
	}

	public void setMatchsSuspendus(Integer matchsSuspendus) {
		this.matchsSuspendus = matchsSuspendus;
	}

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public List<But> getButs() {
		return buts;
	}

	public void setButs(List<But> buts) {
		this.buts = buts;
	}

	public List<Tiers> getTitulaires() {
		return titulaires;
	}

	public void setTitulaires(List<Tiers> titulaires) {
		this.titulaires = titulaires;
	}

	public List<Tiers> getRemplacants() {
		return remplacants;
	}

	public void setRemplacants(List<Tiers> remplacants) {
		this.remplacants = remplacants;
	}
    
    
    
}
