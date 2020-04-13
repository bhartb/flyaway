package com.flyaway.service;

import java.util.List;

import com.flyaway.model.BookingSummary;

public interface BookingSummaryService {
	
	List<BookingSummary> getBookingDetail(String airlineName,int id);

}
