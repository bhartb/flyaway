package com.flyaway.service;

import java.util.List;

import com.flyaway.model.FlightSearch;

public interface FlightSearchService {
	
    public FlightSearch createFlightSearch(FlightSearch FlightSearch) ;
	
	public FlightSearch getFlightSearchID(String sourcePlace);
	
	public List<FlightSearch> getAllFlightSearch();
	
	public void removeFlightSearch(String sourcePlace);
	
	public FlightSearch updateFlightSearch(FlightSearch FlightSearch);
	
}
