package com.flyaway.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")

public class HelloController {

	@GET
	public String sayHelloGet() {
		
		return"welcome to jax-rs GET";
		
	}
	
	@Path("/{name}")
	@GET
	public String sayHelloGet(@PathParam("name")String name) {
		
		return" welcome "+ name + "to jax-rs GET";
		
	}
	
	
	
	@POST
	public String sayHelloPost() {
		
		return"welcome to jax-rs POST";
		
	}
	
	
	@PUT
	public String sayHelloPut() {
		
		return"welcome to jax-rs PUT";
		
	}
	
	
	
	
}
