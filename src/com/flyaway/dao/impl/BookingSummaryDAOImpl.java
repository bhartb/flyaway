package com.flyaway.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.flyaway.dao.BookingSummaryDAO;
import com.flyaway.model.BookingSummary;

public class BookingSummaryDAOImpl implements BookingSummaryDAO{
	
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());	
	
	
	@Override
	public List<BookingSummary> getBookingDetail(String airlineName,int id) {
		
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			
		
			
			
	    Query q=session.createQuery("from TripRegstnDetail  c where c.airlineName=:airlineName");
	    Query q1=session.createQuery("from FlightList  c where c.id=:id");
			q.setParameter("airlineName", airlineName);
			q1.setParameter("id", id);
			List<BookingSummary> bookingSummary=new ArrayList<BookingSummary>();
			bookingSummary.addAll(q.list());
			bookingSummary.addAll(q1.list());
				
	     transaction.commit();
			session.close();
			return bookingSummary;
		}

	}


