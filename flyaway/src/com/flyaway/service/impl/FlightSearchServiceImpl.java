package com.flyaway.service.impl;

import java.util.List;

import com.flyaway.dao.FlightSearchDAO;
import com.flyaway.dao.impl.FlightSearchDaoImpl;
import com.flyaway.model.FlightSearch;
import com.flyaway.service.FlightSearchService;

public class FlightSearchServiceImpl implements FlightSearchService {
	
	FlightSearchDAO dao=new FlightSearchDaoImpl();

	@Override
	public FlightSearch createFlightSearch(FlightSearch FlightSearch) {
		// TODO Auto-generated method stub
		return dao.createFlightSearch(FlightSearch);
	}

	@Override
	public FlightSearch getFlightSearchID(String sourcePlace) {
		// TODO Auto-generated method stub
		return dao.getFlightSearchID(sourcePlace);
		
	}

	@Override
	public List<FlightSearch> getAllFlightSearch() {
		// TODO Auto-generated method stub
		return dao.getAllFlightSearch();
	}

	@Override
	public void removeFlightSearch(String sourcePlace) {
		dao.removeFlightSearch(sourcePlace);
		
	}

	@Override
	public FlightSearch updateFlightSearch(FlightSearch FlightSearch) {
		// TODO Auto-generated method stub
		return dao.updateFlightSearch(FlightSearch);
	}

}
