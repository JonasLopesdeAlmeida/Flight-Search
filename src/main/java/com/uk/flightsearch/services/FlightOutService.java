package com.uk.flightsearch.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.uk.flightsearch.entities.FlightOut;
import com.uk.flightsearch.repositories.FlightOutRepository;
import com.uk.flightsearch.services.exceptions.ObjectNotFoundException;

@Service
public class FlightOutService {
	
    @Autowired
	private FlightOutRepository flightoutrepo;

    
    public FlightOut find(Long id) {
		Optional<FlightOut> obj = flightoutrepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Flight not found! Id: " + id + ", Type: " + FlightOut.class.getName()));
		}
    

  	public Page<FlightOut> findFlightsOut(Integer page, Integer linesPerPage, String orderBy1,String orderBy2,String orderBy3,String direction){
  		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction),
  				orderBy1,orderBy2,orderBy3);
  		return flightoutrepo.findAll(pageRequest);
  		
  	}
  	
  	public FlightOut fromDTO(FlightOut flightOutDto) {
  		return new FlightOut(
  				flightOutDto.getId(), 
  				flightOutDto.getDepartureout(), 
  				flightOutDto.getTimedepartureout(), 
  				flightOutDto.getDestinationout(), 
  				flightOutDto.getTimedestinationout(), 
  				flightOutDto.getDateout(),
  				flightOutDto.getFlightstatus());
  		}
  	
	
}
