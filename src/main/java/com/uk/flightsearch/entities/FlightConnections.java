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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="FlightConnections")
public class FlightConnections implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String airportdeparture;
    private String timein;
    private String timeout;
    
    @JsonIgnore
    @ManyToMany
	@JoinTable(name = "FlightConnectionsin_to_FlightsIn", joinColumns = @JoinColumn(name = "id_flightConnectionsin"), inverseJoinColumns = @JoinColumn(name = "id_flightin"))
	private List<Flightin> flightin = new ArrayList<>();
    
    
    @JsonIgnore
    @ManyToMany
	@JoinTable(name = "FlightConnectionsout_to_FlightsOut", joinColumns = @JoinColumn(name = "id_flightConnectionsout"), inverseJoinColumns = @JoinColumn(name = "id_flightout"))
    private List<FlightOut> flightout = new ArrayList<>();
    
    public FlightConnections() {
    	
    }

	

	public FlightConnections(Long id, String airportdeparture, String timein, String timeout) {
		super();
		this.id = id;
		this.airportdeparture = airportdeparture;
		this.timein = timein;
		this.timeout = timeout;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getAirportdeparture() {
		return airportdeparture;
	}



	public void setAirportdeparture(String airportdeparture) {
		this.airportdeparture = airportdeparture;
	}



	public String getTimein() {
		return timein;
	}



	public void setTimein(String timein) {
		this.timein = timein;
	}



	public String getTimeout() {
		return timeout;
	}



	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}



	public List<Flightin> getFlightin() {
		return flightin;
	}

	public void setFlightin(List<Flightin> flightin) {
		this.flightin= flightin;
	}

	public List<FlightOut> getFlightout() {
		return flightout;
	}

	public void setFlightout(List<FlightOut> flightout) {
		this.flightout = flightout;
	}




	
    
    
    
}
