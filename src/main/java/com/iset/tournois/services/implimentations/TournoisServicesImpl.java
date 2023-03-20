package com.iset.tournois.services.implimentations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iset.tournois.entities.Tournois;
import com.iset.tournois.repositories.TournoisRepository;
import com.iset.tournois.services.TournoisService;

@Service
public class TournoisServicesImpl implements TournoisService{
	
	@Autowired
	private TournoisRepository repository;

	@Override
	public List<Tournois> getAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Tournois getById(long id) {
		// TODO Auto-generated method stub
		return this.repository.getOne(id);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
	}

	@Override
	public Tournois save(Tournois tournois) {
		// TODO Auto-generated method stub
		return this.repository.save(tournois);
	}

	@Override
	public Tournois update(long id, Tournois tournois) {
		// TODO Auto-generated method stub
		tournois.setId(id);
		return this.repository.save(tournois);
	}

}
