package com.uk.flightsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uk.flightsearch.entities.Flight;
import com.uk.flightsearch.services.FlightService;

@RestController
@RequestMapping(value = "/flights")
public class FlightController {
	
	@Autowired
	private FlightService flightservice;
	
    @GetMapping("/{id}")
	public ResponseEntity<Flight> find(@PathVariable Long id) {

		Flight flight = flightservice.find(id);
		return ResponseEntity.ok().body(flight);
	}
    
    
    
  
    
    
    

}
