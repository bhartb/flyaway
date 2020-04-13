package com.flyaway.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")

public class WelcmFlyawayController {

	@GET
	public String sayHelloFlyaway() {
		
		return" ***************Welcome to Flyaway-Online flight booking portal*****************";
		
	}
	
	/*@Path("/{name}")
	@GET
	public String sayHelloGet(@PathParam("name")String name) {
		
		return" welcome "+ name + "to jax-rs GET";
		
	}
	*/
	
	
	
	
}
