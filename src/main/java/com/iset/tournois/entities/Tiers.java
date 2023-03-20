package com.iset.tournois.entities;

import javax.persistence.*;

@Entity
public class Tiers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre_but")
    private Integer nombreBut;
    
    @ManyToOne
    private Equipe equipe;
    
	public Tiers() {
		super();
	}

	public Tiers(Integer nombreBut, Long id, Equipe equipe) {
		super();
		this.nombreBut = nombreBut;
		this.id = id;
		this.equipe = equipe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNombreBut() {
		return nombreBut;
	}

	public void setNombreBut(Integer nombreBut) {
		this.nombreBut = nombreBut;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
}
