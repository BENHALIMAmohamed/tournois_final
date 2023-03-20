package com.iset.tournois.entities;

import javax.persistence.*;

@Entity
public class But {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "origine")
    private String origine;

    @Column(name = "minute")
    private Integer minute;

    @Column(name = "mi_temps")
    private Integer miTemps;

	public But() {
		super();
	}

	public But(Long id, String origine, Integer minute, Integer miTemps) {
		super();
		this.id = id;
		this.origine = origine;
		this.minute = minute;
		this.miTemps = miTemps;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public Integer getMiTemps() {
		return miTemps;
	}

	public void setMiTemps(Integer miTemps) {
		this.miTemps = miTemps;
	}
    
}
