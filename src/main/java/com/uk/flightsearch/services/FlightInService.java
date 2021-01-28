package com.uk.flightsearch.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.uk.flightsearch.DTO.FlightInDTO;
import com.uk.flightsearch.DTO.FlightInNewDTO;
import com.uk.flightsearch.entities.FlightIn;
import com.uk.flightsearch.repositories.FlightInRepository;
import com.uk.flightsearch.services.exceptions.ObjectNotFoundException;

@Service
public class FlightInService {
	
    @Autowired
	private FlightInRepository flighintrepo;

    
    public FlightIn find(Long id) {
		Optional<FlightIn> obj = flighintrepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Flight not found! Id: " + id + ", Type: " + FlightIn.class.getName()));
		}
    
    
    
  	public Page<FlightIn> findFlightsIn(Integer page, Integer linesPerPage, String orderBy1,String orderBy2,String orderBy3, String direction){
  		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction),
  				orderBy1,orderBy2,orderBy3);
  		return flighintrepo.findAll(pageRequest);
  		
  	}
  	
  	public FlightIn fromDTO(FlightInDTO flightInDto) {
  		return new FlightIn(flightInDto.getId(), 
  				flightInDto.getDepartureIn(), 
  				flightInDto.getTimeDepartureIn(), 
  				flightInDto.getDestinationIn(), 
  				flightInDto.getTimeDestinationIn(), 
  				flightInDto.getDateIn(), 
  				flightInDto.getFlightstatus());
  				
  				
  		}
  	
  	
  	public Page<FlightIn> departuresAndDestinationsList(Integer page, Integer linesPerPage, String orderBy, String direction){
  		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction),
  				orderBy);
  		return flighintrepo.findAll(pageRequest);
  		
  	}
  	
  	public FlightIn fromDTO(FlightInNewDTO flightInOuTDto) {
  		return new FlightIn(flightInOuTDto.getDepartureIn());
  				
  				
  		}
  	
  	
	
}
