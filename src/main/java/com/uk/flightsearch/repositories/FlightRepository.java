package com.uk.flightsearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uk.flightsearch.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
