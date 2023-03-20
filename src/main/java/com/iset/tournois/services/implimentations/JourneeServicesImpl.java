package com.iset.tournois.services.implimentations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iset.tournois.entities.Journee;
import com.iset.tournois.repositories.JourneeRepository;
import com.iset.tournois.services.JourneeService;

@Service
public class JourneeServicesImpl implements JourneeService{
	
	@Autowired
	private JourneeRepository repository;

	@Override
	public List<Journee> getAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Journee getById(long id) {
		// TODO Auto-generated method stub
		return this.repository.getOne(id);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
	}

	@Override
	public Journee save(Journee journee) {
		// TODO Auto-generated method stub
		return this.repository.save(journee);
	}

	@Override
	public Journee update(long id, Journee journee) {
		// TODO Auto-generated method stub
		journee.setId(id);
		return this.repository.save(journee);
	}

}
