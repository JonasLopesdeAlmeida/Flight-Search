package com.uk.flightsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uk.flightsearch.DTO.FlightDTO;
import com.uk.flightsearch.entities.Flight;
import com.uk.flightsearch.services.FlightService;

@RestController
@RequestMapping(value = "/flights")
public class FlightController {
	
	@Autowired
	private FlightService flightservice;
	
    @GetMapping("/{id}")
	public ResponseEntity<Flight> find(@PathVariable Long id) {

		Flight flight = flightservice.find(id);
		return ResponseEntity.ok().body(flight);
	}
    
    
    @GetMapping("/search")
  	public ResponseEntity<Page<FlightDTO>> findPage(
  			
  			@RequestParam(value="page", defaultValue="0") Integer page,
  			
  			@RequestParam(value="linesPerPage", defaultValue="24")Integer linesPerPage, 

  			@RequestParam(value="orderBy", defaultValue="DepartureIn")String orderBy1, 
  			
  			@RequestParam(value="orderBy", defaultValue="DestinationIn")String orderBy2, 
  			
  			@RequestParam(value="direction", defaultValue="ASC")String direction) {
  		
  		Page<Flight> listflights = flightservice.findFlights(page, linesPerPage,orderBy1,orderBy2 ,direction);
  		
  		Page<FlightDTO> listflightsDTO = listflights.map(obj -> new FlightDTO(obj));
  		return ResponseEntity.ok().body(listflightsDTO);

  	}
    
    
    

}
