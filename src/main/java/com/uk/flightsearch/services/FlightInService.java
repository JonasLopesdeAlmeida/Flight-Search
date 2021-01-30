package com.uk.flightsearch.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.uk.flightsearch.DTO.FlightInDTO;
import com.uk.flightsearch.DTO.FlightInNewDTO;
import com.uk.flightsearch.entities.Flightin;
import com.uk.flightsearch.repositories.FlightInRepository;
import com.uk.flightsearch.services.exceptions.ObjectNotFoundException;

@Service
public class FlightInService {

	@Autowired
	private FlightInRepository flighintrepo;

	public Flightin find(Long id) {
		Optional<Flightin> obj = flighintrepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Flight not found! Id: " + id + ", Type: " + Flightin.class.getName()));
	}

	public Page<Flightin> findFlightsIn(Integer page, Integer linesPerPage, String orderBy1, String orderBy2,
			String orderBy3, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy1, orderBy2,
				orderBy3);
		return flighintrepo.findAll(pageRequest);

	}

	public Flightin fromDTO(FlightInDTO flightInDto) {
		return new Flightin(flightInDto.getId(), flightInDto.getDeparturein(), flightInDto.getTimedeparturein(),
				flightInDto.getDestinationin(), flightInDto.getTimedestinationin(), flightInDto.getDatein(),
				flightInDto.getFlightstatus());

	}

	public Page<Flightin> departuresAndDestinationsList(String departurein, Integer page, Integer linesPerPage,
			String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);

		return flighintrepo.findDistinctByDeparturein(departurein, pageRequest);

	}

	public Flightin fromDTO(FlightInNewDTO flightInNewDto) {
		return new Flightin(flightInNewDto.getDeparturein());

	}

	public Date getDateWithGreatestNumberOfDeparturesFromManchester() {
		Date obj = flighintrepo.date();
		return obj;
	}

}
