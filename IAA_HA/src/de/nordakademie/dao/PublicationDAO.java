package de.nordakademie.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import de.nordakademie.model.publication.Publication;

public class PublicationDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save(Publication publication){
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(publication);
	}

}
