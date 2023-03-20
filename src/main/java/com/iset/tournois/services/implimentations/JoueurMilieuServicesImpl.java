package com.iset.tournois.services.implimentations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iset.tournois.entities.JoueurMilieu;
import com.iset.tournois.repositories.JoueurMilieuRepository;
import com.iset.tournois.services.JoueurMilieuService;

@Service
public class JoueurMilieuServicesImpl implements JoueurMilieuService{
	
	@Autowired
	private JoueurMilieuRepository repository;

	@Override
	public List<JoueurMilieu> getAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public JoueurMilieu getById(long id) {
		// TODO Auto-generated method stub
		return this.repository.getOne(id);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
	}

	@Override
	public JoueurMilieu save(JoueurMilieu joueurMilieu) {
		// TODO Auto-generated method stub
		return this.repository.save(joueurMilieu);
	}

	@Override
	public JoueurMilieu update(long id, JoueurMilieu joueurMilieu) {
		// TODO Auto-generated method stub
		joueurMilieu.setId(id);
		return this.repository.save(joueurMilieu);
	}

}
