package com.uk.flightsearch.DTO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.uk.flightsearch.entities.FlightIn;
import com.uk.flightsearch.enums.FlightStatus;

public class FlightInDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String departureIn;
	private String timeDepartureIn;
	private String destinationIn;
	private String timeDestinationIn;
	private Date dateIn;
	
	@Enumerated(value = EnumType.STRING)
	private FlightStatus flightstatus;
    
	
	

	public FlightInDTO() {

	}

	public FlightInDTO(FlightIn flightin) {
		
		id = flightin.getId();
		departureIn = flightin.getDepartureIn();
	    timeDepartureIn = flightin.getTimeDepartureIn();
	    destinationIn = flightin.getDestinationIn();
		timeDestinationIn = flightin.getTimeDestinationIn();
        dateIn = flightin.getDateIn();
        flightstatus =  flightin.getFlightstatus();
        
//        departureOut = flight.getDepartureOut();
//        timeDepartureOut = flight.getTimeDepartureOut();
//		destinationOut = flight.getDestinationOut();
//		timeDestinationOut = flight.getDestinationOut();
//		dateOut = flight.getDateOut();
		
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

	public String getTimeDepartureIn() {
		return timeDepartureIn;
	}

	public void setTimeDepartureIn(String timeDepartureIn) {
		this.timeDepartureIn = timeDepartureIn;
	}

	public String getDestinationIn() {
		return destinationIn;
	}

	public void setDestinationIn(String destinationIn) {
		this.destinationIn = destinationIn;
	}

	public String getTimeDestinationIn() {
		return timeDestinationIn;
	}

	public void setTimeDestinationIn(String timeDestinationIn) {
		this.timeDestinationIn = timeDestinationIn;
	}

	public Date getDateIn() {
		return dateIn;
	}

	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}

	public FlightStatus getFlightstatus() {
		return flightstatus;
	}

	public void setFlightstatus(FlightStatus flightstatus) {
		this.flightstatus = flightstatus;
	}

	

}
