package com.iset.tournois.services;

import java.util.List;

import com.iset.tournois.entities.Match;

public interface MatchService {
	
	public List<Match> getAll();
	
	public Match getById(long id );
	
	public void deleteById(long id);
	
	public Match save(Match match);

	public Match update(long id, Match match);

}
