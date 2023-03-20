package com.iset.tournois.services.implimentations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iset.tournois.entities.Gardien;
import com.iset.tournois.repositories.GardienRepository;
import com.iset.tournois.services.GardienService;

@Service
public class GardienServicesImpl implements GardienService{
	
	@Autowired
	private GardienRepository repository;

	@Override
	public List<Gardien> getAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Gardien getById(long id) {
		// TODO Auto-generated method stub
		return this.repository.getOne(id);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
	}

	@Override
	public Gardien save(Gardien gardien) {
		// TODO Auto-generated method stub
		return this.repository.save(gardien);
	}

	@Override
	public Gardien update(long id, Gardien gardien) {
		// TODO Auto-generated method stub
		gardien.setId(id);
		return this.repository.save(gardien);
	}

}
