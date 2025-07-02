
package com.cognizant.ormlearn;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@SpringBootApplication
public class OrmlearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmlearnApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CountryRepository countryRepository) {
        return args -> {

            // 1. Search with substring
            System.out.println("Search: contains 'ou'");
            List<Country> result1 = countryRepository.findByNameContaining("ou");
            result1.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));

            // 2. Search with substring + sort
            System.out.println("\nSearch: contains 'ou' with ascending order");
            List<Country> result2 = countryRepository.findByNameContainingOrderByNameAsc("ou");
            result2.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));

            // 3. Search countries starting with 'Z'
            System.out.println("\nSearch: starts with 'Z'");
            List<Country> result3 = countryRepository.findByNameStartingWith("Z");
            result3.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));
        };
    }
}
