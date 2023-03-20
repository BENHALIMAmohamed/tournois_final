package com.iset.tournois.entities;

import javax.persistence.*;

@Entity
public class Journee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "numero")
    private Integer numero;
    
    @ManyToOne
    private Tournois tournois;
    
	public Journee() {
		super();
	}

	public Journee(Long id, Integer numero, Tournois tournois) {
		super();
		this.id = id;
		this.numero = numero;
		this.tournois = tournois;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Tournois getTournois() {
		return tournois;
	}

	public void setTournois(Tournois tournois) {
		this.tournois = tournois;
	}
    
}
