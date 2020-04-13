package com.flyaway.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Places {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	int pid;
	
	String destnPlace;
	String sourcePlace;
	public Places() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	
	
}
