package com.iset.tournois.services;

import java.util.List;

import com.iset.tournois.entities.Entraineur;

public interface EntraineurService {
	
	public List<Entraineur> getAll();
	
	public Entraineur getById(long id );
	
	public void deleteById(long id);
	
	public Entraineur save(Entraineur entraineur);

	public Entraineur update(long id, Entraineur entraineur);

}
