package com.uk.flightsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uk.flightsearch.DTO.FlightOutDTO;
import com.uk.flightsearch.entities.FlightOut;
import com.uk.flightsearch.services.FlightOutService;

@RestController
@RequestMapping(value = "/flightsout")
public class FlightOutController {
	
	@Autowired
	private FlightOutService flightoutservice;
	
    @GetMapping("/{id}")
	public ResponseEntity<FlightOut> find(@PathVariable Long id) {

		FlightOut flightout = flightoutservice.find(id);
		return ResponseEntity.ok().body(flightout);
	}
    
    
    @GetMapping("/flightout")
  	public ResponseEntity<Page<FlightOutDTO>> findPage(
  			
  			@RequestParam(value="page", defaultValue="0") Integer page,
  			
  			@RequestParam(value="linesPerPage", defaultValue="24")Integer linesPerPage, 

  			@RequestParam(value="orderBy", defaultValue="departureIn")String orderBy1, 
  			
  			@RequestParam(value="orderBy", defaultValue="destinationIn")String orderBy2, 
  			
  			@RequestParam(value="orderBy", defaultValue="dateOut")String orderBy3, 
  			
  			@RequestParam(value="direction", defaultValue="ASC")String direction) {
  		
  		Page<FlightOut> listflightsout = flightoutservice.findFlightsOut(page, linesPerPage,orderBy1,orderBy2,orderBy3,direction);
  		
  		Page<FlightOutDTO> listflightsoutDTO = listflightsout.map(obj -> new FlightOutDTO(obj));
  		return ResponseEntity.ok().body(listflightsoutDTO);

  	}
    
    
    

}
