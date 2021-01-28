package com.uk.flightsearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uk.flightsearch.entities.FlightIn;

@Repository
public interface FlightInRepository extends JpaRepository<FlightIn, Long> {

}
