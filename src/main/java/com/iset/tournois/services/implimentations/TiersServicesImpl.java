package com.iset.tournois.services.implimentations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iset.tournois.entities.Tiers;
import com.iset.tournois.repositories.TiersRepository;
import com.iset.tournois.services.TiersService;

@Service
public class TiersServicesImpl implements TiersService{
	
	@Autowired
	private TiersRepository repository;

	@Override
	public List<Tiers> getAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Tiers getById(long id) {
		// TODO Auto-generated method stub
		return this.repository.getOne(id);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
	}

	@Override
	public Tiers save(Tiers tiers) {
		// TODO Auto-generated method stub
		return this.repository.save(tiers);
	}

	@Override
	public Tiers update(long id, Tiers tiers) {
		// TODO Auto-generated method stub
		tiers.setId(id);
		return this.repository.save(tiers);
	}

}
