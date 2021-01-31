package com.uk.flightsearch.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uk.flightsearch.DTO.FlightInDTO;
import com.uk.flightsearch.DTO.FlightInNewDTO;
import com.uk.flightsearch.controller.util.URL;
import com.uk.flightsearch.entities.Flightin;
import com.uk.flightsearch.services.FlightInService;

@RestController
@RequestMapping(value = "/flightsin")
public class FlightInController {

	@Autowired
	private FlightInService flightinservice;

	@GetMapping("/{id}")
	public ResponseEntity<Flightin> find(@PathVariable Long id) {
		Flightin flightin = flightinservice.find(id);
		return ResponseEntity.ok().body(flightin);
		}
	
	@GetMapping(value="/date")
	public ResponseEntity<Date>findDate() {

		Date flightin = flightinservice.getDateWithGreatestNumberOfDeparturesFromManchester();
		
		return ResponseEntity.ok().body(flightin);
	}
	
	
	@GetMapping(value="/percentage")
	public ResponseEntity<String> findPercentage(){
		Double flightin = flightinservice.getPercentageFromFlightsWithDeparturesForSweden();
		return ResponseEntity.ok().body(flightin+"%");
	}
	
	
	@GetMapping(value="/time")
	public ResponseEntity<String> findTime() throws ParseException{
		
		String flightin = flightinservice.getTimeDiference();
		
	
		return ResponseEntity.ok().body(flightin + "");
	}

	@GetMapping("/page")
	public ResponseEntity<Page<FlightInDTO>> findPage(

			@RequestParam(value = "page", defaultValue = "0") Integer page,

			@RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,

			@RequestParam(value = "orderBy", defaultValue = "departureIn") String orderBy1,

			@RequestParam(value = "orderBy", defaultValue = "destinationIn") String orderBy2,

			@RequestParam(value = "orderBy", defaultValue = "dateIn") String orderBy3,

			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {

		Page<Flightin> listflightsin = flightinservice.findFlightsIn(page, linesPerPage, orderBy1, orderBy2, orderBy3,
				direction);

		Page<FlightInDTO> listflightsinDTO = listflightsin.map(obj -> new FlightInDTO(obj));
		return ResponseEntity.ok().body(listflightsinDTO);

	}

	@GetMapping("/airports")
	public ResponseEntity<Page<FlightInNewDTO>>findDeparture(

			@RequestParam(value="departurein", defaultValue="") String departurein,
			
			@RequestParam(value = "page", defaultValue = "0") Integer page,

			@RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,

			@RequestParam(value = "orderBy", defaultValue = "departurein") String orderBy,

			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {

		String departureDecoded = URL.decodeParam(departurein);
		Page<Flightin> listdeparturesin = flightinservice.departuresAndDestinationsList(departureDecoded, page,
				linesPerPage, orderBy, direction);

		Page<FlightInNewDTO> listdeparturesinDTO = listdeparturesin.map(obj -> new FlightInNewDTO(obj));
		return ResponseEntity.ok().body(listdeparturesinDTO);

	}
	
	
	

}
