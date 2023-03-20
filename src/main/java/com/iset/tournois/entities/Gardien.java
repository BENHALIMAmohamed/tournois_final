package com.iset.tournois.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Gardien extends Joueur {

    @Column(name = "id")
    private Long id;

    @Column(name = "nombre_buts")
    private Integer nombreButs;

    @Column(name = "nombre_clean_sheet")
    private Integer nombreCleanSheet;

	public Gardien() {
		super();
	}

	public Gardien(Long id, String nom, Date dateNaissance, Float salaire, Integer matchsJoues,
			Integer avertissementsRecus, Integer avertissementsActifs, Integer totalExplusions, Integer matchsSuspendus,
			Boolean etat, Equipe equipe, List<But> buts, List<Tiers> titulaires, List<Tiers> remplacants, Long id2,
			Integer nombreButs, Integer nombreCleanSheet) {
		super(id, nom, dateNaissance, salaire, matchsJoues, avertissementsRecus, avertissementsActifs, totalExplusions,
				matchsSuspendus, etat, equipe, buts, titulaires, remplacants);
		id = id2;
		this.nombreButs = nombreButs;
		this.nombreCleanSheet = nombreCleanSheet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNombreButs() {
		return nombreButs;
	}

	public void setNombreButs(Integer nombreButs) {
		this.nombreButs = nombreButs;
	}

	public Integer getNombreCleanSheet() {
		return nombreCleanSheet;
	}

	public void setNombreCleanSheet(Integer nombreCleanSheet) {
		this.nombreCleanSheet = nombreCleanSheet;
	}
    
    
}
