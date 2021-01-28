package com.uk.flightsearch.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uk.flightsearch.entities.Flight;
import com.uk.flightsearch.repositories.FlightRepository;
import com.uk.flightsearch.services.exceptions.ObjectNotFoundException;

@Service
public class FlightService {
	
    @Autowired
	private FlightRepository flightrepo;

    
    public Flight find(Long id) {
		Optional<Flight> obj = flightrepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Flight not found! Id: " + id + ", Type: " + Flight.class.getName()));
		}
    

  
  	
	
}