package com.uk.flightsearch.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="FlightConnectios")
public class FlightConnections implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String airportDeparture;
    private String timeIn;
    private String timeOut;
       
    @ManyToMany
	@JoinTable(name = "FlightConnections_to_Flights", joinColumns = @JoinColumn(name = "id_flightConnections"), inverseJoinColumns = @JoinColumn(name = "id_flight"))

	private List<Flight> flights = new ArrayList<>();
    
    public FlightConnections() {
    	
    }

	public FlightConnections(Long id, String airportDeparture, String timeIn, String timeOut) {
		super();
		this.id = id;
		this.airportDeparture = airportDeparture;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAirportDeparture() {
		return airportDeparture;
	}

	public void setAirportDeparture(String airportDeparture) {
		this.airportDeparture = airportDeparture;
	}

	public String getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}

	public String getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}


	
    
    
    
}
