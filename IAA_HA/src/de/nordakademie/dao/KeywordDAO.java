package de.nordakademie.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import de.nordakademie.model.publication.Keyword;

/**
 * 
 * @author Matthias Pries
 * @category DAO Class:
 * 
 *           Diese Klasse ist fuer das lesen und schreiben von Keywords aus bzw.
 *           in die DB verantwortlich
 * 
 */
public class KeywordDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Keyword load(String searchKeyword) {
		Session session = sessionFactory.getCurrentSession();
		return (Keyword) session.get(Keyword.class, searchKeyword);
	}

	public void save(Keyword keyword) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(keyword);
		
	}

	public void delete(Keyword keyword) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(keyword);
		
	}

	@SuppressWarnings("unchecked")
	public List<Keyword> loadAll() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Keyword>) session.createQuery("from Keyword").list();
	}

	@SuppressWarnings("unchecked")
	public List<Keyword> load(List<String> description) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Keyword where description in (:descriptions)");
		query.setParameterList("descriptions", description);
		return (List<Keyword>) query.list();
	}

}
