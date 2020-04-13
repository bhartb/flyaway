package com.flyaway.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.flyaway.dao.FlightListDAO;
import com.flyaway.model.FlightList;
import com.flyaway.model.TripRegstnDetail;

public class FlightListDAOImpl implements FlightListDAO {
	
	
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());	
	
	

	@Override
	public FlightList createFlightList(FlightList flightList) {
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		
		
		session.save(flightList);
		transaction.commit();
		session.close();
		
		return flightList;
	}
	

	@Override
	public FlightList fetchFlight(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		FlightList flightList=new FlightList();
		TripRegstnDetail tripRegstnDetail=new TripRegstnDetail();
		flightList.setTripRegstnDetail(tripRegstnDetail);
		tripRegstnDetail.setFlightList(flightList);
		session.persist(flightList);
		
		//FlightList flightList2=(FlightList) session.get(TripRegstnDetail.class, id);
		FlightList flightList1=(FlightList) session.get(FlightList.class,id);
		
		
		
		transaction.commit();
		session.close();
		return flightList1;
	}
	
	
	
}
