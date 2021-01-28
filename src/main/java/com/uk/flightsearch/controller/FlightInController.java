package com.uk.flightsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uk.flightsearch.DTO.FlightInDTO;
import com.uk.flightsearch.entities.FlightIn;
import com.uk.flightsearch.services.FlightInService;

@RestController
@RequestMapping(value = "/flightsin")
public class FlightInController {
	
	@Autowired
	private FlightInService flightinservice;
	
    @GetMapping("/{id}")
	public ResponseEntity<FlightIn> find(@PathVariable Long id) {

    	FlightIn flightin = flightinservice.find(id);
		return ResponseEntity.ok().body(flightin);
	}
    
    
    @GetMapping("/page")
  	public ResponseEntity<Page<FlightInDTO>> findPage(
  			
  			@RequestParam(value="page", defaultValue="0") Integer page,
  			
  			@RequestParam(value="linesPerPage", defaultValue="24")Integer linesPerPage, 

  			@RequestParam(value="orderBy", defaultValue="departureIn")String orderBy1, 
  			
  			@RequestParam(value="orderBy", defaultValue="destinationIn")String orderBy2,
  			
  			@RequestParam(value="orderBy", defaultValue="dateIn")String orderBy3, 
  			
  			@RequestParam(value="direction", defaultValue="ASC")String direction) {
  		
  		Page<FlightIn> listflightsin = flightinservice.findFlightsIn(page, linesPerPage,orderBy1,orderBy2,orderBy3,direction);
  		
  		Page<FlightInDTO> listflightsinDTO = listflightsin.map(obj -> new FlightInDTO(obj));
  		return ResponseEntity.ok().body(listflightsinDTO);

  	}
    
    
    

}
