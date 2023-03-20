package com.iset.tournois.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iset.tournois.entities.Entraineur;
import com.iset.tournois.services.EntraineurService;

@RestController
@RequestMapping("/api/entraineurs")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:8080"})
public class EntraineurController {

	@Autowired
	private EntraineurService service;

	@GetMapping
	public List<Entraineur> getAll() {
		// TODO Auto-generated method stub
		return this.service.getAll();
	}

	@GetMapping("/{id}")
	public Entraineur getById(@PathVariable("id") long id) {
		// TODO Auto-generated method stub
		return this.service.getById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id")  long id) {
		// TODO Auto-generated method stub
		this.service.deleteById(id);
	}

	@PostMapping
	public Entraineur save( @RequestBody Entraineur entraineur) {
		// TODO Auto-generated method stub
		return this.service.save(entraineur);
	}

	@PutMapping("/{id}")
	public Entraineur update(@PathVariable("id")  long id, @RequestBody Entraineur entraineur) {
		// TODO Auto-generated method stub
		return this.service.update(id, entraineur);
	}
}
