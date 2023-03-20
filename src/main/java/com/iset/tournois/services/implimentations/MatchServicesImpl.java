package com.iset.tournois.services.implimentations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iset.tournois.entities.Match;
import com.iset.tournois.repositories.MatchRepository;
import com.iset.tournois.services.MatchService;

@Service
public class MatchServicesImpl implements MatchService{
	
	@Autowired
	private MatchRepository repository;

	@Override
	public List<Match> getAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Match getById(long id) {
		// TODO Auto-generated method stub
		return this.repository.getOne(id);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
	}

	@Override
	public Match save(Match match) {
		// TODO Auto-generated method stub
		return this.repository.save(match);
	}

	@Override
	public Match update(long id, Match match) {
		// TODO Auto-generated method stub
		match.setId(id);
		return this.repository.save(match);
	}

}
