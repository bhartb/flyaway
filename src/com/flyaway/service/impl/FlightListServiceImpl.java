package com.flyaway.service.impl;

import com.flyaway.dao.FlightListDAO;
import com.flyaway.dao.FlightSearchDAO;
import com.flyaway.dao.impl.FlightListDAOImpl;
import com.flyaway.dao.impl.FlightSearchDaoImpl;
import com.flyaway.model.FlightList;
import com.flyaway.model.FlightSearch;
import com.flyaway.service.FlightListService;

public class FlightListServiceImpl implements FlightListService {
	
	
	FlightListDAO dao=new FlightListDAOImpl();

	@Override
	public FlightList createFlightList(FlightList flightList) {
		// TODO Auto-generated method stub
		return dao.createFlightList(flightList);
	}
	
	@Override
	public FlightList fetchFlight(int id) {
		// TODO Auto-generated method stub
		return dao.fetchFlight(id);
		
	}

}
