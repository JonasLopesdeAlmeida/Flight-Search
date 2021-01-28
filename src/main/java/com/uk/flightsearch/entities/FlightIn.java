package com.uk.flightsearch.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.uk.flightsearch.enums.FlightStatus;

@Entity
@Table(name= "FlightIn")
public class FlightIn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departureIn;
	private String timeDepartureIn;
	private String destinationIn;
	private String timeDestinationIn;
	private Date dateIn;

	@Enumerated(value = EnumType.STRING)
	private FlightStatus flightstatus;
	
//	@JsonBackReference
	@ManyToMany(mappedBy ="flightin")
	private List<FlightConnections> flightconnectionsin = new ArrayList<>();
	
	
	
    public FlightIn() {
		
	}
	
	

	public FlightIn(Long id, String departureIn, String timeDepartureIn, String destinationIn, String timeDestinationIn,
			Date dateIn, FlightStatus flightstatus) {
		super();
		this.id = id;
		this.departureIn = departureIn;
		this.timeDepartureIn = timeDepartureIn;
		this.destinationIn = destinationIn;
		this.timeDestinationIn = timeDestinationIn;
		this.dateIn = dateIn;
		this.flightstatus = flightstatus;
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



	public List<FlightConnections> getFlightconnectionsin() {
		return flightconnectionsin;
	}



	public void setFlightconnectionsin(List<FlightConnections> flightconnectionsin) {
		this.flightconnectionsin = flightconnectionsin;
	}


	
	

}
