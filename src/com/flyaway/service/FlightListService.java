package com.flyaway.service;

import com.flyaway.model.FlightList;

public interface FlightListService {
	
	public FlightList createFlightList(FlightList flightList) ;

	public FlightList fetchFlight(int id);

}
