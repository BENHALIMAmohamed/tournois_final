package com.iset.tournois.services;

import java.util.List;

import com.iset.tournois.entities.Gardien;

public interface GardienService {
	
	public List<Gardien> getAll();
	
	public Gardien getById(long id );
	
	public void deleteById(long id);
	
	public Gardien save(Gardien gardien);

	public Gardien update(long id, Gardien gardien);

}
