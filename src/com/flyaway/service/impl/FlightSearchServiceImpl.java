package com.flyaway.service.impl;

import java.util.List;

import com.flyaway.dao.FlightSearchDAO;
import com.flyaway.dao.impl.FlightSearchDaoImpl;
import com.flyaway.model.FlightSearch;
import com.flyaway.model.TripRegstnDetail;
import com.flyaway.service.FlightSearchService;

public class FlightSearchServiceImpl implements FlightSearchService {
	
	FlightSearchDAO dao=new FlightSearchDaoImpl();

	@Override
	public FlightSearch createFlightSearch(FlightSearch FlightSearch) {
		// TODO Auto-generated method stub
		return dao.createFlightSearch(FlightSearch);
	}

	@Override
	public List<FlightSearch> getFlightSearchID(String sourcePlace,String destnPlace) {
		// TODO Auto-generated method stub
		return dao.getFlightSearchID(sourcePlace,destnPlace);
		
	}

	

	@Override
	public FlightSearch updateFlightSearch(FlightSearch FlightSearch) {
		// TODO Auto-generated method stub
		return dao.updateFlightSearch(FlightSearch);
	}

	@Override
	public TripRegstnDetail createTripRegstnDetail(TripRegstnDetail tripRegstnDetail) {
		return dao.createTripRegstnDetail(tripRegstnDetail);
		
	}
	
	

}
