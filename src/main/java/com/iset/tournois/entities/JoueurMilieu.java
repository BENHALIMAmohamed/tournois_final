package com.iset.tournois.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class JoueurMilieu extends Joueur {

    @Column(name = "nombre_buts")
    private Integer nombreButs;

    @Column(name = "meilleur_distance")
    private Float meilleurDistance;

	public JoueurMilieu() {
		super();
	}

	public JoueurMilieu(Integer nombreButs, Float meilleurDistance) {
		super();
		this.nombreButs = nombreButs;
		this.meilleurDistance = meilleurDistance;
	}

	public JoueurMilieu(Long id, String nom, Date dateNaissance, Float salaire, Integer matchsJoues,
			Integer avertissementsRecus, Integer avertissementsActifs, Integer totalExplusions, Integer matchsSuspendus,
			Boolean etat, Equipe equipe, List<But> buts, List<Tiers> titulaires, List<Tiers> remplacants,
			Integer nombreButs, Float meilleurDistance) {
		super(id, nom, dateNaissance, salaire, matchsJoues, avertissementsRecus, avertissementsActifs, totalExplusions,
				matchsSuspendus, etat, equipe, buts, titulaires, remplacants);
		this.nombreButs = nombreButs;
		this.meilleurDistance = meilleurDistance;
	}

	public Integer getNombreButs() {
		return nombreButs;
	}

	public void setNombreButs(Integer nombreButs) {
		this.nombreButs = nombreButs;
	}

	public Float getMeilleurDistance() {
		return meilleurDistance;
	}

	public void setMeilleurDistance(Float meilleurDistance) {
		this.meilleurDistance = meilleurDistance;
	}
    
}
