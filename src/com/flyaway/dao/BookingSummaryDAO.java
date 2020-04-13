package com.flyaway.dao;

import java.util.List;

import com.flyaway.model.BookingSummary;

public interface BookingSummaryDAO {
	
	
	public List<BookingSummary> getBookingDetail(String airlineName,int id);

}
