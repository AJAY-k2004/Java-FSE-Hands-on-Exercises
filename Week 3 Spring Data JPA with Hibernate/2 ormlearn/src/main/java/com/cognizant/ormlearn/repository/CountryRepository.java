
package com.cognizant.ormlearn.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.ormlearn.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    // 1. Search countries by partial name
    List<Country> findByNameContaining(String keyword);

    // 2. Search and return in ascending order
    List<Country> findByNameContainingOrderByNameAsc(String keyword);

    // 3. Find countries starting with a given letter
    List<Country> findByNameStartingWith(String prefix);
}
