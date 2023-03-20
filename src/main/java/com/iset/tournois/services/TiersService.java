package com.iset.tournois.services;

import java.util.List;

import com.iset.tournois.entities.Tiers;

public interface TiersService {
	
	public List<Tiers> getAll();
	
	public Tiers getById(long id );
	
	public void deleteById(long id);
	
	public Tiers save(Tiers tiers);

	public Tiers update(long id, Tiers tiers);

}
