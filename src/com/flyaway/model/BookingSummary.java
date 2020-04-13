package com.flyaway.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class BookingSummary {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	int id;

	public BookingSummary() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
