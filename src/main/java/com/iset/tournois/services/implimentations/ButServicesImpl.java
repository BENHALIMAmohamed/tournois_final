package com.iset.tournois.services.implimentations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iset.tournois.entities.But;
import com.iset.tournois.repositories.ButRepository;
import com.iset.tournois.services.ButService;

@Service
public class ButServicesImpl implements ButService{
	
	@Autowired
	private ButRepository repository;

	@Override
	public List<But> getAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public But getById(long id) {
		// TODO Auto-generated method stub
		return this.repository.getOne(id);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
	}

	@Override
	public But save(But but) {
		// TODO Auto-generated method stub
		return this.repository.save(but);
	}

	@Override
	public But update(long id, But but) {
		// TODO Auto-generated method stub
		but.setId(id);
		return this.repository.save(but);
	}

}
