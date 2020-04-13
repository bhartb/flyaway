package com.flyaway.service;

import java.util.List;

import com.flyaway.model.FlightSearch;
import com.flyaway.model.TripRegstnDetail;

public interface FlightSearchService {
	
	public FlightSearch createFlightSearch(FlightSearch FlightSearch);

	List<FlightSearch> getFlightSearchID(String sourcePlace, String destnPlace);

	

	FlightSearch updateFlightSearch(FlightSearch FlightSearch);

	public TripRegstnDetail createTripRegstnDetail(TripRegstnDetail tripRegstnDetail);



}
