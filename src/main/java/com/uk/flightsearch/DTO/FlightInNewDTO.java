package com.uk.flightsearch.DTO;

import java.io.Serializable;

import com.uk.flightsearch.entities.Flightin;

public class FlightInNewDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String departurein;
	
	

	public FlightInNewDTO() {

	}

	public FlightInNewDTO(Flightin flightin) {
		
		departurein = flightin.getDeparturein();
		
	}


	public String getDeparturein() {
		return departurein;
	}

	public void setDeparturein(String departurein) {
		this.departurein = departurein;
	}

	

}
