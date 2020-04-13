package com.flyaway.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class FlightSearch {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	int id;
	String sourcePlace;
	String destnPlace;

	String dateOfJourney;
	int  noOfPerson;
	public FlightSearch() {
		
	}
	
	public String getSourcePlace() {
		return sourcePlace;
	}

	public void setSourcePlace(String sourcePlace) {
		this.sourcePlace = sourcePlace;
	}

	public String getDestnPlace() {
		return destnPlace;
	}

	public void setDestnPlace(String destnPlace) {
		this.destnPlace = destnPlace;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String date) {
		this.dateOfJourney = date;
	}
	public int getNoOfPerson() {
		return noOfPerson;
	}
	public void setNoOfPerson(int noOfPerson) {
		this.noOfPerson = noOfPerson;
	}
	
	
	
}
