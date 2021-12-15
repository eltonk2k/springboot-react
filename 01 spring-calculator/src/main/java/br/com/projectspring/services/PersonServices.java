package br.com.projectspring.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.projectspring.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Elielton");
		person.setLasttName("Silva");
		person.setAnddress("Rua Jovita Alves - Paraiba - Brasil");
		person.setGender("Male");
		return person ;
	}

}
