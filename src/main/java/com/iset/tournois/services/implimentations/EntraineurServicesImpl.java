package com.iset.tournois.services.implimentations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iset.tournois.entities.Entraineur;
import com.iset.tournois.repositories.EntraineurRepository;
import com.iset.tournois.services.EntraineurService;

@Service
public class EntraineurServicesImpl implements EntraineurService{
	
	@Autowired
	private EntraineurRepository repository;

	@Override
	public List<Entraineur> getAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Entraineur getById(long id) {
		// TODO Auto-generated method stub
		return this.repository.getOne(id);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
	}

	@Override
	public Entraineur save(Entraineur entraineur) {
		// TODO Auto-generated method stub
		return this.repository.save(entraineur);
	}

	@Override
	public Entraineur update(long id, Entraineur entraineur) {
		// TODO Auto-generated method stub
		entraineur.setId(id);
		return this.repository.save(entraineur);
	}

}
