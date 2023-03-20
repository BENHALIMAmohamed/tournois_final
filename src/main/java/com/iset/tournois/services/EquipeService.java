package com.iset.tournois.services;

import java.util.List;

import com.iset.tournois.entities.Equipe;

public interface EquipeService {
	
	public List<Equipe> getAll();
	
	public Equipe getById(long id );
	
	public void deleteById(long id);
	
	public Equipe save(Equipe equipe);

	public Equipe update(long id, Equipe equipe);

}
