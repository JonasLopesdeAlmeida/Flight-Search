package com.uk.flightsearch.DTO;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.uk.flightsearch.entities.Flight;

public class FlightDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String departureIn;
	private String timeDepartureIn;
	private String destinationIn;
	private String timeDestinationIn;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateIn;

	private String departureOut;
	private String timeDepartureOut;
	private String destinationOut;
	private String timeDestinationOut;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateOut;

	public FlightDTO() {

	}

	public FlightDTO(Flight flight) {
		
		id = flight.getId();
		departureIn = flight.getDepartureIn();
	    timeDepartureIn = flight.getTimeDepartureIn();
	    destinationIn = flight.getDestinationIn();
		timeDestinationIn = flight.getTimeDestinationIn();
        dateIn = flight.getDateIn();
        departureOut = flight.getDepartureOut();
        timeDepartureOut = flight.getTimeDepartureOut();
		destinationOut = flight.getDestinationOut();
		timeDestinationOut = flight.getDestinationOut();
		dateOut = flight.getDateOut();
		
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

	public String getDepartureOut() {
		return departureOut;
	}

	public void setDepartureOut(String departureOut) {
		this.departureOut = departureOut;
	}

	public String getTimeDepartureOut() {
		return timeDepartureOut;
	}

	public void setTimeDepartureOut(String timeDepartureOut) {
		this.timeDepartureOut = timeDepartureOut;
	}

	public String getDestinationOut() {
		return destinationOut;
	}

	public void setDestinationOut(String destinationOut) {
		this.destinationOut = destinationOut;
	}

	public String getTimeDestinationOut() {
		return timeDestinationOut;
	}

	public void setTimeDestinationOut(String timeDestinationOut) {
		this.timeDestinationOut = timeDestinationOut;
	}

	public Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}
	
	

}
