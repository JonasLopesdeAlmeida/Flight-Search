package com.uk.flightsearch.DTO;

import java.io.Serializable;

import com.uk.flightsearch.entities.FlightIn;

public class FlightInNewDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String departureIn;
	
	

	public FlightInNewDTO() {

	}

	public FlightInNewDTO(FlightIn flightin) {
		
		departureIn = flightin.getDepartureIn();
		
	}


	public String getDepartureIn() {
		return departureIn;
	}

	public void setDepartureIn(String departureIn) {
		this.departureIn = departureIn;
	}

	

}
