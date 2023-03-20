package com.iset.tournois.services;

import java.util.List;

import com.iset.tournois.entities.But;

public interface ButService {
	
	public List<But> getAll();
	
	public But getById(long id );
	
	public void deleteById(long id);
	
	public But save(But but);

	public But update(long id, But but);

}
