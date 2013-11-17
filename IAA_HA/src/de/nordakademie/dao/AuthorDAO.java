package de.nordakademie.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import de.nordakademie.model.publication.Author;

/**
 * 
 * @author Matthias Pries
 * @category DAO Class:
 * 
 *           Diese Klasse ist fuer das lesen und schreiben von Autoren aus bzw.
 *           in die DB verantwortlich
 * 
 */
public class AuthorDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Author load(String searchAuthor) {
		Session session = sessionFactory.getCurrentSession();
		return (Author) session.get(Author.class, searchAuthor);
	}

	public void delete(Author author) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(author);
		
	}

	public void save(Author author) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(author);
		
	}

	@SuppressWarnings("unchecked")
	public List<Author> loadAll() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Author>) session.createQuery("from Author").list();
	}

	@SuppressWarnings("unchecked")
	public List<Author> load(List<String> authors) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Author where name in (:authors)");
		query.setParameterList("authors", authors);
		return (List<Author>) query.list();
	}

}
