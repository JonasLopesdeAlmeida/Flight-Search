package com.uk.flightsearch.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uk.flightsearch.entities.Flight;
import com.uk.flightsearch.entities.FlightConnections;
import com.uk.flightsearch.entities.Flightin;
import com.uk.flightsearch.entities.FlightOut;
import com.uk.flightsearch.enums.FlightStatus;
import com.uk.flightsearch.repositories.FlightConnectionsRepository;
import com.uk.flightsearch.repositories.FlightInRepository;
import com.uk.flightsearch.repositories.FlightOutRepository;
import com.uk.flightsearch.repositories.FlightRepository;

@Service
public class DBservice {

	@Autowired
	private FlightRepository flightrepo;

	@Autowired
	private FlightInRepository flightinrepo;

	@Autowired
	private FlightOutRepository flightoutrepo;

	@Autowired
	private FlightConnectionsRepository flightconnectionsrepo;

	public void instantiateTestDatabase() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Flightin fi1 = new Flightin(null, "London Heathrow LHR", "06:30", "Dubai DXB", "21:30", sdf.parse("28/01/2021"),
				FlightStatus.CONFIRMED);
		FlightOut fo1 = new FlightOut(null, "Dubai DXB", "07:30", "London Heathrow LHR", "23:10",
				sdf.parse("02/02/2021"), FlightStatus.CONFIRMED);
		Flightin fi2 = new Flightin(null, "Sweden ARN", "15:20", "London Heathrow LHR", "17:20",
				sdf.parse("04/02/2021"), FlightStatus.CONFIRMED);
		FlightOut fo2 = new FlightOut(null, "London Heathrow LHR", "07:30", "Sweden ARN", "09:30",
				sdf.parse("09/02/2021"), FlightStatus.CONFIRMED);

		
		Flightin fi3 = new Flightin(null, "Manchester MAN", "04:20", "London Heathrow LHR", "06:20",
				sdf.parse("06/02/2021"), FlightStatus.CONFIRMED);
		Flightin fi4 = new Flightin(null, "Manchester MAN", "06:30", "London Heathrow LHR", "08:30",
				sdf.parse("06/02/2021"), FlightStatus.CONFIRMED);
		Flightin fi5 = new Flightin(null, "Manchester MAN", "09:30", "London Heathrow LHR", "11:30",
				sdf.parse("05/02/2021"), FlightStatus.CONFIRMED);
		
		
		Flightin fi6 = new Flightin(null, "Manchester MAN", "03:20", "London Heathrow LHR", "05:20",
				sdf.parse("05/02/2021"), FlightStatus.CONFIRMED);
		Flightin fi7 = new Flightin(null, "Manchester MAN", "11:00", "London Heathrow LHR", "13:00",
				sdf.parse("05/02/2021"), FlightStatus.CONFIRMED);
		Flightin fi8 = new Flightin(null, "Manchester MAN", "16:50", "London Heathrow LHR", "18:50",
				sdf.parse("07/02/2021"), FlightStatus.CONFIRMED);
		
		
		
		FlightConnections fc1 = new FlightConnections(null, "Frankfurt FRA", "15:30", "16:30");
		FlightConnections fc2 = new FlightConnections(null, "exemplo EX1", "18:30", "19:30");
		FlightConnections fc3 = new FlightConnections(null, "Galeao GIG", "16:10", "16:20");
		FlightConnections fc4 = new FlightConnections(null, "exemplo EX2", "20:30", "20:40");

		Flight fl1 = new Flight(null, fi1, fo1);
		Flight fl2 = new Flight(null, fi2, fo2);

		fi1.getFlightconnectionsin().addAll(Arrays.asList(fc1));
		fo1.getFlightconnectionsout().addAll(Arrays.asList(fc2));
		fi2.getFlightconnectionsin().addAll(Arrays.asList(fc3));
		fo2.getFlightconnectionsout().addAll(Arrays.asList(fc4));

		fc1.getFlightin().addAll(Arrays.asList(fi1));
		fc2.getFlightout().addAll(Arrays.asList(fo1));
		fc3.getFlightin().addAll(Arrays.asList(fi2));
		fc4.getFlightout().addAll(Arrays.asList(fo2));

		flightinrepo.saveAll(Arrays.asList(fi1, fi2, fi3, fi4, fi5, fi6, fi7, fi8));
		flightoutrepo.saveAll(Arrays.asList(fo1, fo2));
		flightconnectionsrepo.saveAll(Arrays.asList(fc1, fc2, fc3, fc4));
		flightrepo.saveAll(Arrays.asList(fl1, fl2));

		//
//			Flight f3 = new Flight(null, "Glasgow GLA", "09:30", "Manchester MAN", "15:35", sdf.parse("05/02/2021") , "Dubai DXB", "07:30", "London Heathrow LHR", "23:10", sdf.parse("02/02/2021"), FlightStatus.CONFIRMED);
//			Flight f4 = new Flight(null, "Sweden ARN", "15:20", "London Heathrow LHR", "17:20", sdf.parse("04/02/2021") , "Sweden ARN", "07:30", "London Heathrow LHR", "09:30", sdf.parse("06/02/2021"), FlightStatus.CONFIRMED);
//			Flight f5 = new Flight(null, "London Heathrow LHR", "06:30", "Dubai DXB", "21:30", sdf.parse("28/01/2021") , "Dubai DXB", "07:30", "London Heathrow LHR", "23:10", sdf.parse("02/02/2021"), FlightStatus.CONFIRMED);
//			Flight f6 = new Flight(null, "Sweden ARN", "15:20", "London Heathrow LHR", "17:20", sdf.parse("04/02/2021") , "Sweden ARN", "07:30", "London Heathrow LHR", "09:30", sdf.parse("06/02/2021"), FlightStatus.CONFIRMED);
//			Flight f7 = new Flight(null, "London Heathrow LHR", "06:30", "Dubai DXB", "21:30", sdf.parse("28/01/2021") , "Dubai DXB", "07:30", "London Heathrow LHR", "23:10", sdf.parse("02/02/2021"), FlightStatus.CONFIRMED);
//			Flight f8 = new Flight(null, "Sweden ARN", "15:20", "London Heathrow LHR", "17:20", sdf.parse("04/02/2021") , "Sweden ARN", "07:30", "London Heathrow LHR", "09:30", sdf.parse("06/02/2021"), FlightStatus.CONFIRMED);

	}

}
