package de.nordakademie.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import de.nordakademie.model.Lending;


public class LendDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void create(Lending lend) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(lend);
		
		
	}
}
