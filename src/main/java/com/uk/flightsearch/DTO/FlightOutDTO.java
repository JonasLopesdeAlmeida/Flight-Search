package com.uk.flightsearch.DTO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.uk.flightsearch.entities.FlightOut;
import com.uk.flightsearch.enums.FlightStatus;

public class FlightOutDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String departureout;
	private String timedepartureout;
	private String destinationout;
	private String timeDestinationout;
	private Date dateout;

	@Enumerated(value = EnumType.STRING)
	private FlightStatus flightstatus;

	public FlightOutDTO() {

	}

	public FlightOutDTO(FlightOut flightout) {

		id = flightout.getId();
		departureout = flightout.getDepartureout();
		timedepartureout = flightout.getTimedepartureout();
		destinationout = flightout.getDestinationout();
		timeDestinationout = flightout.getDestinationout();
		dateout = flightout.getDateout();
		flightstatus = flightout.getFlightstatus();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getDepartureout() {
		return departureout;
	}

	public void setDepartureout(String departureout) {
		this.departureout = departureout;
	}

	public String getTimedepartureout() {
		return timedepartureout;
	}

	public void setTimedepartureout(String timedepartureout) {
		this.timedepartureout = timedepartureout;
	}

	public String getDestinationout() {
		return destinationout;
	}

	public void setDestinationout(String destinationout) {
		this.destinationout = destinationout;
	}

	public String getTimeDestinationout() {
		return timeDestinationout;
	}

	public void setTimeDestinationout(String timeDestinationout) {
		this.timeDestinationout = timeDestinationout;
	}

	public Date getDateout() {
		return dateout;
	}

	public void setDateout(Date dateout) {
		this.dateout = dateout;
	}

	public FlightStatus getFlightstatus() {
		return flightstatus;
	}

	public void setFlightstatus(FlightStatus flightstatus) {
		this.flightstatus = flightstatus;
	}

}
