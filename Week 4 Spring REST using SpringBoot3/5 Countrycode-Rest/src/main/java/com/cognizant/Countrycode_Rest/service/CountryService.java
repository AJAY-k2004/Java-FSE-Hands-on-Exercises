package com.cognizant.Countrycode_Rest.service;


import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cognizant.Countrycode_Rest.model.Country;
import com.cognizant.Countrycode_Rest.model.CountryList;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

@Service
public class CountryService {

    public Country getCountry(String code) throws Exception {
        // Load country.xml
        InputStream is = getClass().getResourceAsStream("/country.xml");

        // Parse XML
        JAXBContext context = JAXBContext.newInstance(CountryList.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        CountryList countryList = (CountryList) unmarshaller.unmarshal(is);

        // Case-insensitive match
        Optional<Country> country = countryList.getCountryList().stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst();

        return country.orElseThrow(() -> new Exception("Country not found"));
    }
}
