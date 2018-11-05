package com.tutorial.jpa.jpatutorial.repositories;

import com.tutorial.jpa.jpatutorial.entities.Country;
import com.tutorial.jpa.jpatutorial.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

    Iterable<Person> findByCountry(Country country);
}
