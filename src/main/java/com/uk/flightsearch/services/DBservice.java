package com.uk.flightsearch.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uk.flightsearch.entities.Flight;
import com.uk.flightsearch.entities.FlightConnections;
import com.uk.flightsearch.repositories.FlightConnectionsRepository;
import com.uk.flightsearch.repositories.FlightRepository;

@Service
public class DBservice {
	
	@Autowired
	private FlightRepository flightrepo;
	
	@Autowired
	private FlightConnectionsRepository flightconnectionsrepo;
	
	
	
	public void instantiateTestDatabase() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy" );
		Flight f1 = new Flight(null, "London Heathrow LHR", "06:30", "Dubai DXB", "21:30", sdf.parse("28/01/2021") , "Dubai DXB", "07:30", "London Heathrow LHR", "23:10", sdf.parse("02/02/2021"));
		Flight f2 = new Flight(null, "Sweden ARN", "15:20", "London Heathrow LHR", "17:20", sdf.parse("04/02/2021") , "Sweden ARN", "07:30", "London Heathrow LHR", "09:30", sdf.parse("06/02/2021"));
	    
		FlightConnections fc1 = new FlightConnections(null, "Frankfurt FRA", "15:30", "16:30");
		FlightConnections fc2 = new FlightConnections(null, "Galeao GIG", "18:30", "19:00");
		
		f1.getFlightconnections().addAll(Arrays.asList(fc1,fc2));
		fc1.getFlights().addAll(Arrays.asList(f1));
		fc2.getFlights().addAll(Arrays.asList(f1));
		
		flightrepo.saveAll(Arrays.asList(f1,f2));
		flightconnectionsrepo.saveAll(Arrays.asList(fc1,fc2));
		
	
	
	}

}
