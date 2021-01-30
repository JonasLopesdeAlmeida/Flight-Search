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
@Table(name = "Flightin")
public class Flightin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departurein;
	private String timedeparturein;
	private String destinationin;
	private String timedestinationin;
	private Date datein;

	@Enumerated(value = EnumType.STRING)
	private FlightStatus flightstatus;

//	@JsonBackReference
	@ManyToMany(mappedBy = "flightin")
	private List<FlightConnections> flightconnectionsin = new ArrayList<>();

	public Flightin() {

	}

	public Flightin(String departurein) {
		this.departurein = departurein;
	}

	public Flightin(Long id, String departurein, String timedeparturein, String destinationin, String timedestinationin,
			Date datein, FlightStatus flightstatus) {
		super();
		this.id = id;
		this.departurein = departurein;
		this.timedeparturein = timedeparturein;
		this.destinationin = destinationin;
		this.timedestinationin = timedestinationin;
		this.datein = datein;
		this.flightstatus = flightstatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeparturein() {
		return departurein;
	}

	public void setDeparturein(String departurein) {
		this.departurein = departurein;
	}

	public String getTimedeparturein() {
		return timedeparturein;
	}

	public void setTimedeparturein(String timedeparturein) {
		this.timedeparturein = timedeparturein;
	}

	public String getDestinationin() {
		return destinationin;
	}

	public void setDestinationin(String destinationin) {
		this.destinationin = destinationin;
	}

	public String getTimedestinationin() {
		return timedestinationin;
	}

	public void setTimedestinationin(String timedestinationin) {
		this.timedestinationin = timedestinationin;
	}

	public Date getDatein() {
		return datein;
	}

	public void setDatein(Date datein) {
		this.datein = datein;
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
