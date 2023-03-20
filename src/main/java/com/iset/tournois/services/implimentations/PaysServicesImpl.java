package com.iset.tournois.services.implimentations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iset.tournois.entities.Pays;
import com.iset.tournois.repositories.PaysRepository;
import com.iset.tournois.services.PaysService;

@Service
public class PaysServicesImpl implements PaysService{
	
	@Autowired
	private PaysRepository repository;

	@Override
	public List<Pays> getAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Pays getById(long id) {
		// TODO Auto-generated method stub
		return this.repository.getOne(id);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
	}

	@Override
	public Pays save(Pays pays) {
		// TODO Auto-generated method stub
		return this.repository.save(pays);
	}

	@Override
	public Pays update(long id, Pays pays) {
		// TODO Auto-generated method stub
		pays.setId(id);
		return this.repository.save(pays);
	}

}
