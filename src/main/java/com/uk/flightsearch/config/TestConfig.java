package com.uk.flightsearch.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.uk.flightsearch.services.DBservice;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBservice dbService;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbService.instantiateTestDatabase();
		return true;
	}

}
