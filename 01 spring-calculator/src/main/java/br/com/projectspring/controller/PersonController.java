package br.com.projectspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectspring.model.Person;
import br.com.projectspring.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonServices services;
	
	
	@GetMapping
	public List<Person> findAll() {
		return services.findAll();
	}
	
	
	@GetMapping("/{id}")
	public Person findById(@PathVariable("id") Long id) {
		return services.findById(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Person create(@RequestBody Person person) {
		return services.create(person);
		
	}
		
	@PutMapping
	public Person update(@RequestBody Person person) {
		return services.update(person);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		services.delete(id);
		return ResponseEntity.ok().build();
	}
	
	
}
