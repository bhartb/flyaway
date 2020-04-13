package com.flyaway.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flyaway.model.BookingSummary;
import com.flyaway.model.FlightSearch;
import com.flyaway.service.BookingSummaryService;
import com.flyaway.service.impl.BookingSummaryServiceImpl;

@Path("/bookingsummary")
public class BookingSummaryController {
	
	BookingSummaryService service=new BookingSummaryServiceImpl();

	@GET
	@Path("/{airlineName}/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BookingSummary> getBookingDetail(@PathParam("airlineName")String airlineName,@PathParam("id")int id) {
		// TODO Auto-generated method stub
		return service.getBookingDetail(airlineName,id);
	}

}
