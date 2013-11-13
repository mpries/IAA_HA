package de.nordakademie.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import de.nordakademie.model.Customer;
import de.nordakademie.model.publication.Publication;


public class LendDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void create(Customer customer, Publication publication,
			Date currentDate, Date returnDate) {
		Session session = sessionFactory.getCurrentSession();
		
		
	}
}
