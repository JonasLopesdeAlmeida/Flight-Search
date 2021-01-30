package com.uk.flightsearch.repositories;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.uk.flightsearch.entities.Flightin;

@Repository
public interface FlightInRepository extends JpaRepository<Flightin, Long> {


	
	@Query(value = 
	" SELECT DISTINCT datein, count(datein) AS quantity FROM Flightin WHERE departurein = 'Manchester MAN' group by datein order by quantity desc limit 1", nativeQuery=true)
	Date date();
	
	//Page<Flightin>DateWithGreatestNumberOfDeparturesFromManchester(@Param("departurein") String departurein, Pageable pageRequest);
   	
	//@Query(value = "SELECT DISTINCT departurein FROM Flightin WHERE departurein LIKE %:departurein%")
	Page<Flightin>findDistinctByDeparturein(@Param("departurein") String departurein, Pageable pageRequest);

	

}
