package com.flyaway.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flyaway.model.FlightList;
import com.flyaway.service.FlightListService;
import com.flyaway.service.impl.FlightListServiceImpl;

@Path("/flightlist")
public class FlightListController {
	
	private FlightListService service=new FlightListServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public FlightList createFlightList(FlightList flightList) {
		return service.createFlightList(flightList);
	}

	// fetch flight details
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
	public FlightList fetchFlight(@PathParam("id")int id) {
		return service.fetchFlight(id);
		
	}
	
	
}
