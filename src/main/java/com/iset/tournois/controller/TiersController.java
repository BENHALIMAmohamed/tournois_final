package com.iset.tournois.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iset.tournois.entities.Tiers;
import com.iset.tournois.services.TiersService;

@RestController
@RequestMapping("/api/tiers")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:8080"})
public class TiersController {

	@Autowired
	private TiersService service;

	@GetMapping
	public List<Tiers> getAll() {
		// TODO Auto-generated method stub
		return this.service.getAll();
	}

	@GetMapping("/{id}")
	public Tiers getById(@PathVariable("id") long id) {
		// TODO Auto-generated method stub
		return this.service.getById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id")  long id) {
		// TODO Auto-generated method stub
		this.service.deleteById(id);
	}

	@PostMapping
	public Tiers save( @RequestBody Tiers tiers) {
		// TODO Auto-generated method stub
		return this.service.save(tiers);
	}

	@PutMapping("/{id}")
	public Tiers update(@PathVariable("id")  long id, @RequestBody Tiers tiers) {
		// TODO Auto-generated method stub
		return this.service.update(id, tiers);
	}
}
