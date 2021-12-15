package br.com.projectspring.services;

import java.util.ArrayList;
import java.util.List;
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
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
		}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name" + i);
		person.setLasttName("Last name" + i);
		person.setAnddress("Some address in Brasil" + i);
		person.setGender("Male");
		return person ;
	
	}

}
