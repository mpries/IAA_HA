package de.nordakademie.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import de.nordakademie.model.publication.Publication;
import de.nordakademie.model.publication.PublishedPublication;

public class PublicationDAO {

	private SessionFactory sessionFactory;
	private static Query query;
	private List<Publication> publications = new ArrayList<Publication>();

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Publication publication) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("SAVE");
		session.saveOrUpdate(publication);
	}

	public List<Publication> load(String title, String author, String keyword) {

		Session session = sessionFactory.getCurrentSession();
		publications.clear();

		// ERSTE Query
		runQuery("select distinct p from Publication p " + "join p.authors a "
				+ "where a.name in (:author)", "author", session, author);

		// ZWEITE QUERY
		runQuery("select distinct p from Publication p " + "join p.keywords k "
				+ "where k.description in (:keyword)", "keyword", session,
				keyword);

		// DRITTE QUERY
		runQuery("from Publication where title = (:title)", "title", session,
				title);

		return publications;

	}
	
	@SuppressWarnings("unchecked")
	private void runQuery(String statement, String arg, Session session,
			String param) {

		query = session.createQuery(statement);
		query.setString(arg, param);
		for (Publication p : (List<Publication>) query.list()) {
			if (!publications.contains(p)) {
//				p.getAuthors().get(0);
//				p.getKeywords().get(0);
				publications.add(p);
			}
			query = null;

		}

	}

	public Publication load(int id) {
		Session session = sessionFactory.getCurrentSession();
		Publication publication = (Publication) session.get(Publication.class, id);
		return publication;
	}

	public void delete(Publication publication) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("DELETE");
		session.delete(publication);
		
	}

	@SuppressWarnings("unchecked")
	public List<Publication> loadAll() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Publication>)session.createQuery("from Publication").list();
	}

	@SuppressWarnings("unchecked")
	public List<Publication> loadByISBN(PublishedPublication publication) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from PublishedPublication where isbn = (:isbn)");
		query.setString("isbn", publication.getISBN());
		return (List<Publication>)query.list();
	}

	public void addCopy(int id, int amount) {
		Publication p = this.load(id);
		p.setStored(p.getStored()+amount);
		this.save(p);	
		
	}
}
