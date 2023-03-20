package com.iset.tournois.entities;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Tournois {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "description")
    private String description;

    @Column(name = "annee")
    private Integer annee;

    @Column(name = "nombre_equipe")
    private Integer nombreEquipe;

    @Column(name = "date_ouverture")
    private Date dateOuverture;

    @Column(name = "date_fermeture")
    private Date dateFermeture;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Pays pays;

	public Tournois() {
		super();
	}

	public Tournois(Long id, String numero, String description, Integer annee, Integer nombreEquipe, Date dateOuverture,
			Date dateFermeture, Pays pays) {
		super();
		this.id = id;
		this.numero = numero;
		this.description = description;
		this.annee = annee;
		this.nombreEquipe = nombreEquipe;
		this.dateOuverture = dateOuverture;
		this.dateFermeture = dateFermeture;
		this.pays = pays;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public Integer getNombreEquipe() {
		return nombreEquipe;
	}

	public void setNombreEquipe(Integer nombreEquipe) {
		this.nombreEquipe = nombreEquipe;
	}

	public Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public Date getDateFermeture() {
		return dateFermeture;
	}

	public void setDateFermeture(Date dateFermeture) {
		this.dateFermeture = dateFermeture;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

}
