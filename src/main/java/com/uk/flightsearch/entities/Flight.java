package com.uk.flightsearch.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Flights")
public class Flight implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="flightin_id")
	private Flightin flightin;
	
	@ManyToOne
	@JoinColumn(name="flightout_id")
	private FlightOut flightout;
	
	
	public Flight() {
		
		
	}


	public Flight(Long id, Flightin flightin, FlightOut flightout) {
		super();
		this.id = id;
		this.flightin = flightin;
		this.flightout = flightout;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Flightin getFlightin() {
		return flightin;
	}


	public void setFlightin(Flightin flightin) {
		this.flightin = flightin;
	}


	public FlightOut getFlightout() {
		return flightout;
	}


	public void setFlightout(FlightOut flightout) {
		this.flightout = flightout;
	}
	
	

}