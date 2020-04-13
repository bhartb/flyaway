package com.flyaway.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.flyaway.dao.FlightSearchDAO;
import com.flyaway.model.FlightSearch;
import com.flyaway.model.TripRegstnDetail;

public class FlightSearchDaoImpl implements FlightSearchDAO {
	
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());	
	
	

	@Override
	public FlightSearch createFlightSearch(FlightSearch FlightSearch) {
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(FlightSearch);
		transaction.commit();
		session.close();
		
		return FlightSearch;
	}

	@Override
	public List<FlightSearch> getFlightSearchID(String sourcePlace, String destnPlace) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
	Query q=session.createQuery("from FlightList  c where c.sourcePlace=:sourcePlace and c.destnPlace=:destnPlace");
	q.setParameter("sourcePlace", sourcePlace);
	q.setParameter("destnPlace", destnPlace);
	List<FlightSearch> FlightSearchList=q.list();
	
		
		transaction.commit();
		session.close();
		return FlightSearchList;

	
		//.get(FlightSearch.class, sourcePlace);
		
		
	}




	@Override
	public FlightSearch updateFlightSearch(FlightSearch FlightSearch) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.update(FlightSearch);
		transaction.commit();
		session.close();
		return FlightSearch;
	}
	
	@Override
	public TripRegstnDetail createTripRegstnDetail(TripRegstnDetail tripRegstnDetail) {
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(tripRegstnDetail);
		transaction.commit();
		session.close();
		
		return tripRegstnDetail;
	}
	


}
