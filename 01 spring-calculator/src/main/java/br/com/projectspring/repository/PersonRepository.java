package br.com.projectspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projectspring.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	
	

}
