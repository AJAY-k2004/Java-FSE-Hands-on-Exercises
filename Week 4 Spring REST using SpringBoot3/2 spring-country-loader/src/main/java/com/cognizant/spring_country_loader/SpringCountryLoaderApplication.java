package com.cognizant.spring_country_loader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCountryLoaderApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCountryLoaderApplication.class);

    public static void main(String[] args) {
        displayCountry();
    }

    public static void displayCountry() {
        LOGGER.debug("START: displayCountry");

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            Country country = context.getBean("country", Country.class);
            LOGGER.debug("Country: {}", country);
            System.out.println("Country loaded: " + country);
        }

        LOGGER.debug("END: displayCountry");
    }
}
