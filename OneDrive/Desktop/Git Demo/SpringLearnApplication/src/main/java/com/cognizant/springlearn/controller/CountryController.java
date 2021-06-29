package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@RestController
@RequestMapping("/countries")
public class CountryController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	Country country = context.getBean("in", Country.class);
	
	ArrayList<Country>  countries =context.getBean("countryList",ArrayList.class);
	
	@Autowired
	private CountryService countryService;


	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public Country getCountryIndia() {
		return country;
	}
//--------------------------------------------------------------------------------------------------------------------------	
	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		return countries;
	}
	
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException  {
		return countryService.getCountry(code);
	}
	
	ArrayList<Country>  list =context.getBean("countryList",ArrayList.class);
	
	@PostMapping("/countries")
	public Country addCountry(@RequestBody  Country country) {
		LOGGER.info("Start:addCountry");
		   list.add(country);
		return country;
		}
		
}