package com.cognizant.springlearn;


import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	static Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		
		displayCountry();
		displayCountries();

			
	}
	
	public static void displayCountry() {
		LOGGER.info("Start:display countries");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("in", Country.class);
		Country anotherCountry = context.getBean("us", Country.class);

	
		LOGGER.info("Country : {}", country.toString());
		LOGGER.info("anotherCountry : {}", anotherCountry.toString());

		LOGGER.info("End:display countries");

	}
	
	
	public static void displayCountries() {
		LOGGER.info("Start:display countries list");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country>  list =context.getBean("countryList",ArrayList.class);
	
		LOGGER.info("Country List: {}", list);
		LOGGER.info("End:display countries list");

	}
}
