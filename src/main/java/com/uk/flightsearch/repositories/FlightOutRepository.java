package com.uk.flightsearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uk.flightsearch.entities.FlightOut;

@Repository
public interface FlightOutRepository extends JpaRepository<FlightOut, Long> {

}
