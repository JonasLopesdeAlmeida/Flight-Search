package com.uk.flightsearch.DTO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.uk.flightsearch.entities.Flightin;
import com.uk.flightsearch.enums.FlightStatus;

public class FlightInDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String departurein;
	private String timedeparturein;
	private String destinationin;
	private String timedestinationin;
	private Date datein;
	
	@Enumerated(value = EnumType.STRING)
	private FlightStatus flightstatus;
    
	
	

	public FlightInDTO() {

	}

	public FlightInDTO(Flightin flightin) {
		
		id = flightin.getId();
		departurein = flightin.getDeparturein();
	    timedeparturein = flightin.getTimedeparturein();
	    destinationin = flightin.getDestinationin();
		timedestinationin = flightin.getTimedestinationin();
        datein = flightin.getDatein();
        flightstatus =  flightin.getFlightstatus();
        

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

	

}
