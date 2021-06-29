package com.cognizant.springlearn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.springlearn.controller.CountryController;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@SpringBootTest
class SpringLearnApplicationTests {

	@Autowired
	private CountryController countryController;

	@Test
	public void contextLoads() {
		assertNotNull(countryController);
	}
	
	@Autowired
	private CountryService countryService;
	
	@Test
	public void testGetCountry() throws CountryNotFoundException {
		String Actual = countryService.getCountry("in").getName();
        assertEquals("India",Actual);
	}
}
