package com.flyaway.dao;

import java.util.List;

import com.flyaway.model.FlightSearch;
import com.flyaway.model.TripRegstnDetail;

public interface FlightSearchDAO {

	public FlightSearch createFlightSearch(FlightSearch FlightSearch) ;
	
	public List<FlightSearch> getFlightSearchID(String sourcePlace,String destnPlace);
	
	
	
	public TripRegstnDetail createTripRegstnDetail(TripRegstnDetail tripRegstnDetail);
	
	public FlightSearch updateFlightSearch(FlightSearch FlightSearch);
	
}
