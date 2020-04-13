package com.flyaway.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class FlightList  {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	 @PrimaryKeyJoinColumn  
	int id;
	String airlineName;
	String destnPlace;
	String sourcePlace;
	int  price;

	@OneToOne(targetEntity=TripRegstnDetail.class,cascade=CascadeType.ALL)
	TripRegstnDetail tripRegstnDetail;
	public TripRegstnDetail getTripRegstnDetail() {
		return tripRegstnDetail;
	}

	public void setTripRegstnDetail(TripRegstnDetail tripRegstnDetail) {
		this.tripRegstnDetail = tripRegstnDetail;
	}

	public FlightList() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getDestnPlace() {
		return destnPlace;
	}

	public void setDestnPlace(String destnPlace) {
		this.destnPlace = destnPlace;
	}

	public String getSourcePlace() {
		return sourcePlace;
	}

	public void setSourcePlace(String sourcePlace) {
		this.sourcePlace = sourcePlace;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	
	

}
