package com.tutorial.jpa.jpatutorial.repositories;

import com.tutorial.jpa.jpatutorial.entities.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {
}
