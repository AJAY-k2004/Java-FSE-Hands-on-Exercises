package com.cognizant.spring_country_loader;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class SpringCountryLoaderApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testCountryBean() {
        Country country = context.getBean("country", Country.class);
        assertEquals("IN", country.getCode());
        assertEquals("India", country.getName());
        System.out.println("✅ Test passed: " + country);
    }
}
