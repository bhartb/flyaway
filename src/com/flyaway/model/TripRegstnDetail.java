package com.flyaway.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class TripRegstnDetail {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	int tid;
	String airlineName;
	String PassngrName;
	String email;
	int PassngrId;
	@OneToOne(targetEntity=FlightList.class)
	FlightList flightList;
	
	public TripRegstnDetail() {
		
	}
	
	
	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getPassngrName() {
		return PassngrName;
	}
	public void setPassngrName(String passngrName) {
		PassngrName = passngrName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassngrId() {
		return PassngrId;
	}
	public void setPassngrId(int passngrId) {
		PassngrId = passngrId;
	}
	public FlightList getFlightList() {
		return flightList;
	}
	public void setFlightList(FlightList flightList) {
		this.flightList = flightList;
	}
	
	

}
