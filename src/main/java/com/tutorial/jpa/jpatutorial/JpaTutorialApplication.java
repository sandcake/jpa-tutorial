package com.tutorial.jpa.jpatutorial;

import com.tutorial.jpa.jpatutorial.entities.Country;
import com.tutorial.jpa.jpatutorial.repositories.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class JpaTutorialApplication {

//    @Autowired
//    CountryRepository countries;

//    JpaTutorialApplication(String[] args) {
//        Country country = new Country(Long.valueOf("1"), "Cameroon");
//        countries.save(country);
//    }

    private static final Logger log = LoggerFactory.getLogger(JpaTutorialApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(JpaTutorialApplication.class, args);
	}

    @Bean
	public CommandLineRunner demo(CountryRepository countries) {
        return (args) -> {
            Country cameroon = new Country(Long.valueOf("1"), "Cameroon");
            countries.save(cameroon);

            // fetch all customers
            log.info("Countries found with findAll():");
            log.info("-------------------------------");
            for (Country country : countries.findAll()) {
                log.info(country.getId() + "- " + country.getName());
            }
            log.info("");
        };
    }
}
