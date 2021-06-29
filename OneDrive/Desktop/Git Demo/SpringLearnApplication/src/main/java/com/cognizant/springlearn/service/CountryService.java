package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	ArrayList<Country> countries = (ArrayList<Country>) context.getBean("countryList");

	public Country getCountry(String code) throws CountryNotFoundException {
		String status = "";
		Country country = null;
		for(Country countryy : countries) {
			String code1 = countryy.getCode(); 
			if(code1.equalsIgnoreCase(code)) 
			   {
				status = "Found";
				country = countryy;
				break;
			 }else {
			     status = null;
			 }
		}
		if(status==null)
			throw new CountryNotFoundException();
		else
			return country;   
	}
}
//Country country = countries.stream().filter(c -> c.getCode().equalsIgnoreCase(code)).findAny().orElse(null);
//if (country == null) {
//	throw new CountryNotFoundException();
//}
//return country;