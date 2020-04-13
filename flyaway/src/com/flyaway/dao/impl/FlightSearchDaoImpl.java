package com.flyaway.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.flyaway.dao.FlightSearchDAO;
import com.flyaway.model.FlightSearch;

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
	public FlightSearch getFlightSearchID(String sourcePlace) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		FlightSearch FlightSearch=(FlightSearch) session.get(FlightSearch.class, sourcePlace);
		
		transaction.commit();
		session.close();
		return FlightSearch;
	}

	@Override
	public List<FlightSearch> getAllFlightSearch() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
      List<FlightSearch> FlightSearchList=session.createQuery("from com.FlightSearch.model.FlightSearch").list();
		transaction.commit();
		session.close();
		return FlightSearchList;
	}

	@Override
	public void removeFlightSearch(String sourcePlace) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		FlightSearch p=new FlightSearch();
		p.setId(sourcePlace);
		session.delete(p);
		transaction.commit();
		session.close();
		
		
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
	
	

}
