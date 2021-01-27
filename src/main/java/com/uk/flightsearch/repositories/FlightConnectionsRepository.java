package com.uk.flightsearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uk.flightsearch.entities.FlightConnections;

public interface FlightConnectionsRepository extends JpaRepository<FlightConnections, Long> {

}
