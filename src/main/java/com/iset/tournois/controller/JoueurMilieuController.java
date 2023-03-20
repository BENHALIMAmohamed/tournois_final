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
import com.iset.tournois.entities.JoueurMilieu;
import com.iset.tournois.services.JoueurMilieuService;

@RestController
@RequestMapping("/api/joueurMilieus")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:8080"})
public class JoueurMilieuController {

	@Autowired
	private JoueurMilieuService service;

	@GetMapping
	public List<JoueurMilieu> getAll() {
		// TODO Auto-generated method stub
		return this.service.getAll();
	}

	@GetMapping("/{id}")
	public JoueurMilieu getById(@PathVariable("id") long id) {
		// TODO Auto-generated method stub
		return this.service.getById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id")  long id) {
		// TODO Auto-generated method stub
		this.service.deleteById(id);
	}

	@PostMapping
	public JoueurMilieu save( @RequestBody JoueurMilieu joueurMilieu) {
		// TODO Auto-generated method stub
		return this.service.save(joueurMilieu);
	}

	@PutMapping("/{id}")
	public JoueurMilieu update(@PathVariable("id")  long id, @RequestBody JoueurMilieu joueurMilieu) {
		// TODO Auto-generated method stub
		return this.service.update(id, joueurMilieu);
	}
}
