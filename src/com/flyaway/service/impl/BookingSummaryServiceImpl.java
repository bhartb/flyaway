package com.flyaway.service.impl;

import java.util.List;

import com.flyaway.dao.BookingSummaryDAO;
import com.flyaway.dao.impl.BookingSummaryDAOImpl;
import com.flyaway.model.BookingSummary;
import com.flyaway.service.BookingSummaryService;

public class BookingSummaryServiceImpl implements BookingSummaryService{

	BookingSummaryDAO dao=new BookingSummaryDAOImpl();
	
	
	@Override
	public List<BookingSummary> getBookingDetail(String airlineName,int id) {
		// TODO Auto-generated method stub
		return dao.getBookingDetail(airlineName,id);
	}

}
