package com.iset.tournois.services.implimentations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iset.tournois.entities.Equipe;
import com.iset.tournois.repositories.EquipeRepository;
import com.iset.tournois.services.EquipeService;

@Service
public class EquipeServicesImpl implements EquipeService{
	
	@Autowired
	private EquipeRepository repository;

	@Override
	public List<Equipe> getAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Equipe getById(long id) {
		// TODO Auto-generated method stub
		return this.repository.getOne(id);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
	}

	@Override
	public Equipe save(Equipe equipe) {
		// TODO Auto-generated method stub
		return this.repository.save(equipe);
	}

	@Override
	public Equipe update(long id, Equipe equipe) {
		// TODO Auto-generated method stub
		equipe.setId(id);
		return this.repository.save(equipe);
	}

}
