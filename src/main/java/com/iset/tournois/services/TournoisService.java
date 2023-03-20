package com.iset.tournois.services;

import java.util.List;

import com.iset.tournois.entities.Tournois;

public interface TournoisService {
	
	public List<Tournois> getAll();
	
	public Tournois getById(long id );
	
	public void deleteById(long id);
	
	public Tournois save(Tournois tournois);

	public Tournois update(long id, Tournois tournois);

}
