package com.uk.flightsearch.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name= "Flights")
public class Flight implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departureIn;
	private String timeDepartureIn;
	private String destinationIn;
	private String timeDestinationIn;
	private Date dateIn;
	private String departureOut;
	private String timeDepartureOut;
	private String destinationOut;
	private String timeDestinationOut;
	private Date dateOut;
	
	@ManyToMany(mappedBy = "flights")
	private List<FlightConnections> flightconnections = new ArrayList<>();
	
	public Flight() {
		
	}

	public Flight(Long id, String departureIn, String timeDepartureIn, String destinationIn, String timeDestinationIn,
			Date dateIn, String departureOut, String timeDepartureOut, String destinationOut, String timeDestinationOut,
			Date dateOut) {
		super();
		this.id = id;
		this.departureIn = departureIn;
		this.timeDepartureIn = timeDepartureIn;
		this.destinationIn = destinationIn;
		this.timeDestinationIn = timeDestinationIn;
		this.dateIn = dateIn;
		this.departureOut = departureOut;
		this.timeDepartureOut = timeDepartureOut;
		this.destinationOut = destinationOut;
		this.timeDestinationOut = timeDestinationOut;
		this.dateOut = dateOut;
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
	
	public List<FlightConnections> getFlightconnections() {
		return flightconnections;
	}

	public void setFlightconnections(List<FlightConnections> flightconnections) {
		this.flightconnections = flightconnections;
	}
	
	
	
	
}
