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
	private String departureOut;
	private String timeDepartureOut;
	private String destinationOut;
	private String timeDestinationOut;
	private Date dateOut;

	@Enumerated(value = EnumType.STRING)
	private FlightStatus flightstatus;

	public FlightOutDTO() {

	}

	public FlightOutDTO(FlightOut flightout) {

		id = flightout.getId();
		departureOut = flightout.getDepartureOut();
		timeDepartureOut = flightout.getTimeDepartureOut();
		destinationOut = flightout.getDestinationOut();
		timeDestinationOut = flightout.getDestinationOut();
		dateOut = flightout.getDateOut();
		flightstatus = flightout.getFlightstatus();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public FlightStatus getFlightstatus() {
		return flightstatus;
	}

	public void setFlightstatus(FlightStatus flightstatus) {
		this.flightstatus = flightstatus;
	}

}
