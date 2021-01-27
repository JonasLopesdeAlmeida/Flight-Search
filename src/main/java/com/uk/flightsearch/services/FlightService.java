package com.uk.flightsearch.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.uk.flightsearch.DTO.FlightDTO;
import com.uk.flightsearch.entities.Flight;
import com.uk.flightsearch.repositories.FlightRepository;
import com.uk.flightsearch.services.exceptions.ObjectNotFoundException;

@Service
public class FlightService {
	
    @Autowired
	private FlightRepository flightrepo;

    
    public Flight find(Long id) {
		Optional<Flight> obj = flightrepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Flight not found! Id: " + id + ", Type: " + Flight.class.getName()));
		}
    

  	public Page<Flight> findFlights(Integer page, Integer linesPerPage, String orderBy1,String orderBy2, String direction){
  	    //PAGEREQUEST PREPARA AS REQUISICOES PARA FAZER A CONSULTA NO BANCO DE DADOS.
  		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction),
  				orderBy1,orderBy2 );
  		//AQUI RETONA A PAGINA A PARTIR DO pageRequest.
  		return flightrepo.findAll(pageRequest);
  		
  	}
  	
  	//METODO AUXILIAR QUE INSTANCIA UMA CATEGORIA A APARTIR DE UM DTO.
  	public Flight fromDTO(FlightDTO flightDto) {
  		return new Flight(flightDto.getId(), 
  				flightDto.getDepartureIn(), 
  				flightDto.getTimeDepartureIn(), 
  				flightDto.getDestinationIn(), 
  				flightDto.getTimeDestinationIn(), 
  				flightDto.getDateIn(), 
  				flightDto.getDepartureOut(), 
  				flightDto.getTimeDepartureOut(), 
  				flightDto.getDestinationOut(), 
  				flightDto.getTimeDestinationOut(), 
  				flightDto.getDateOut());
  		
  	}
  	
	
}
