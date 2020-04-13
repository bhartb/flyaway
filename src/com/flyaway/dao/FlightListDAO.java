package com.flyaway.dao;

import com.flyaway.model.FlightList;

public interface FlightListDAO {
	
	public FlightList createFlightList(FlightList flightList) ;

	FlightList fetchFlight(int id);

}
