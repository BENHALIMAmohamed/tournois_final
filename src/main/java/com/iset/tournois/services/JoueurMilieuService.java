package com.iset.tournois.services;

import java.util.List;

import com.iset.tournois.entities.JoueurMilieu;

public interface JoueurMilieuService {
	
	public List<JoueurMilieu> getAll();
	
	public JoueurMilieu getById(long id );
	
	public void deleteById(long id);
	
	public JoueurMilieu save(JoueurMilieu joueurMilieu);

	public JoueurMilieu update(long id, JoueurMilieu joueurMilieu);

}
