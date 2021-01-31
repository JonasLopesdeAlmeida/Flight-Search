package com.uk.flightsearch.entities;

import java.io.Serializable;
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

import com.uk.flightsearch.enums.FlightStatus;

@Entity
@Table(name = "FlightOut")
public class FlightOut implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departureout;
	private String timedepartureout;
	private String destinationout;
	private String timedestinationout;
	private Date dateout;

	@Enumerated(value = EnumType.STRING)
	private FlightStatus flightstatus;

	@ManyToMany(mappedBy = "flightout")
	private List<FlightConnections> flightconnectionsout = new ArrayList<>();

	public FlightOut() {

	}

	

	public Long getId() {
		return id;
	}

	public FlightOut(Long id, String departureout, String timedepartureout, String destinationout,
			String timedestinationout, Date dateout, FlightStatus flightstatus) {
		super();
		this.id = id;
		this.departureout = departureout;
		this.timedepartureout = timedepartureout;
		this.destinationout = destinationout;
		this.timedestinationout = timedestinationout;
		this.dateout = dateout;
		this.flightstatus = flightstatus;
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



	public String getTimedestinationout() {
		return timedestinationout;
	}



	public void setTimedestinationout(String timedestinationout) {
		this.timedestinationout = timedestinationout;
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

	public List<FlightConnections> getFlightconnectionsout() {
		return flightconnectionsout;
	}

	public void setFlightconnectionsout(List<FlightConnections> flightconnectionsout) {
		this.flightconnectionsout = flightconnectionsout;
	}

}
