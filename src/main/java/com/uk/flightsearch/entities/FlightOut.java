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
	private String departureOut;
	private String timeDepartureOut;
	private String destinationOut;
	private String timeDestinationOut;
	private Date dateOut;

	@Enumerated(value = EnumType.STRING)
	private FlightStatus flightstatus;

	@ManyToMany(mappedBy = "flightout")
	private List<FlightConnections> flightconnectionsout = new ArrayList<>();

	public FlightOut() {

	}

	public FlightOut(Long id, String departureOut, String timeDepartureOut, String destinationOut,
			String timeDestinationOut, Date dateOut, FlightStatus flightstatus) {
		super();
		this.id = id;
		this.departureOut = departureOut;
		this.timeDepartureOut = timeDepartureOut;
		this.destinationOut = destinationOut;
		this.timeDestinationOut = timeDestinationOut;
		this.dateOut = dateOut;
		this.flightstatus = flightstatus;
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

	public List<FlightConnections> getFlightconnectionsout() {
		return flightconnectionsout;
	}

	public void setFlightconnectionsout(List<FlightConnections> flightconnectionsout) {
		this.flightconnectionsout = flightconnectionsout;
	}

}
