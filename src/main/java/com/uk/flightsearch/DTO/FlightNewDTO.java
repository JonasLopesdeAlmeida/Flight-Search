package com.uk.flightsearch.DTO;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.uk.flightsearch.entities.Flight;

public class FlightNewDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String departureIn;
	private String destinationIn;


	public FlightNewDTO() {

	}

	public FlightNewDTO(Flight flight) {
		
		id = flight.getId();
		departureIn = flight.getDepartureIn();
	    destinationIn = flight.getDestinationIn();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartureIn() {
		return departureIn;
	}

	public void setDepartureIn(String departureIn) {
		this.departureIn = departureIn;
	}


	public String getDestinationIn() {
		return destinationIn;
	}

	public void setDestinationIn(String destinationIn) {
		this.destinationIn = destinationIn;
	}

	

}
