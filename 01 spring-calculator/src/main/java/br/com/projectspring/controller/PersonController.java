package br.com.projectspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectspring.data.vo.PersonVO;
import br.com.projectspring.data.vo.v2.PersonVOV2;
import br.com.projectspring.services.PersonServices;

@RestController
@RequestMapping("/api/person/v1")
public class PersonController {
	
	@Autowired
	private PersonServices service;
	
	
	@GetMapping(produces = { "application/json", "application/xml"})
	public List<PersonVO> findAll() {
		return service.findAll();
	}
	
	
	@GetMapping(value = "/{id}", produces = { "application/json", "application/xml"})
	public PersonVO findById(@PathVariable("id") Long id) {
		return service.findById(id);
		
	}
	
	@PostMapping(produces = { "application/json", "application/xml" }, consumes = { "application/json", "application/xml"})
	public PersonVO create(@RequestBody PersonVO person) {
		return service.create(person);
		
	}
	
	@PostMapping("/v2")
	public PersonVOV2 createV2(@RequestBody PersonVOV2 person) {
		return service.createV2(person);
	}
		
	@PutMapping(produces = { "application/json", "application/xml" }, consumes = { "application/json", "application/xml"})
	public PersonVO update(@RequestBody PersonVO person) {
		return service.update(person);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}
	
	
}
