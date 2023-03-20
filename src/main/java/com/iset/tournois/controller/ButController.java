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
import com.iset.tournois.entities.But;
import com.iset.tournois.services.ButService;

@RestController
@RequestMapping("/api/buts")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:8080"})
public class ButController {

	@Autowired
	private ButService service;

	@GetMapping
	public List<But> getAll() {
		// TODO Auto-generated method stub
		return this.service.getAll();
	}

	@GetMapping("/{id}")
	public But getById(@PathVariable("id") long id) {
		// TODO Auto-generated method stub
		return this.service.getById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id")  long id) {
		// TODO Auto-generated method stub
		this.service.deleteById(id);
	}

	@PostMapping
	public But save( @RequestBody But but) {
		// TODO Auto-generated method stub
		return this.service.save(but);
	}

	@PutMapping("/{id}")
	public But update(@PathVariable("id")  long id, @RequestBody But but) {
		// TODO Auto-generated method stub
		return this.service.update(id, but);
	}
}
