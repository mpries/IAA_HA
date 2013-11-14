package de.nordakademie.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import de.nordakademie.model.KindOfPublication;

public class KindOfPublicationDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(KindOfPublication kindOfPublication) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(kindOfPublication);

	}

	public KindOfPublication load(String searchKind) {
		Session session = sessionFactory.getCurrentSession();
		return (KindOfPublication) session.get(KindOfPublication.class,
				searchKind);
	}

	public void delete(KindOfPublication kindOfPublication) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(kindOfPublication);

	}

	@SuppressWarnings("unchecked")
	public List<KindOfPublication> loadAll() {
		Session session = sessionFactory.getCurrentSession();
		return (List<KindOfPublication>) session.createQuery("from KindOfPublication").list();
	}

}
