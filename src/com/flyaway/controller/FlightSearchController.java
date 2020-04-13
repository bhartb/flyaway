package com.flyaway.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flyaway.model.FlightSearch;
import com.flyaway.model.TripRegstnDetail;
import com.flyaway.service.FlightSearchService;
import com.flyaway.service.impl.FlightSearchServiceImpl;

@Path("/bookurflight")
public class FlightSearchController {

	private FlightSearchService service=new FlightSearchServiceImpl();
	
	/*@GET
	public String  helloFlightSearch() {
		
		return "hello FlightSearch";
	}*/
	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public FlightSearch createFlightSearch(FlightSearch FlightSearch) {
		return service.createFlightSearch(FlightSearch);
	}
	
	
	@GET
    @Path("/{sourcePlace}/{destnPlace}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FlightSearch> getFlightSearchID(@PathParam("sourcePlace")String sourcePlace,@PathParam("destnPlace") String destnPlace) {
		
		return service.getFlightSearchID(sourcePlace,destnPlace);
		
	}

	

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    @Path("/{TripRegstnDetail}")
	public TripRegstnDetail createTripRegstnDetail(TripRegstnDetail tripRegstnDetail) {
		
		return service.createTripRegstnDetail(tripRegstnDetail);
		
		
	}

	@PUT
	
	@Consumes(MediaType.APPLICATION_JSON)
	public FlightSearch updateFlightSearch(FlightSearch FlightSearch) {
		// TODO Auto-generated method stub
		return service.updateFlightSearch(FlightSearch);
	}

	
	
	
}
