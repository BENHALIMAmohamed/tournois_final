package com.iset.tournois.services;

import java.util.List;

import com.iset.tournois.entities.Pays;

public interface PaysService {
	
	public List<Pays> getAll();
	
	public Pays getById(long id );
	
	public void deleteById(long id);
	
	public Pays save(Pays pays);

	public Pays update(long id, Pays pays);

}
