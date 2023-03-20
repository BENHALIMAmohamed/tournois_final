package com.iset.tournois.services;

import java.util.List;

import com.iset.tournois.entities.Journee;

public interface JourneeService {
	
	public List<Journee> getAll();
	
	public Journee getById(long id );
	
	public void deleteById(long id);
	
	public Journee save(Journee journee);

	public Journee update(long id, Journee journee);

}
