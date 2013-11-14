package de.nordakademie.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import de.nordakademie.model.Lending;
import de.nordakademie.model.Warning;


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

	@SuppressWarnings("unchecked")
	public List<Lending> loadLendingsWithWarning() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Lending>) session.createQuery("select distinct l from Lending l, Warning w where warning_id = w.id and w.amount > 0").list();
	}

	@SuppressWarnings("unchecked")
	public List<Lending> loadAll() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Lending>)session.createQuery("from Lending").list();
	}

	public void registerReturn(int id) {
		Session session = sessionFactory.getCurrentSession();
		
	}

	public void extendLending(int id) {
		Session session = sessionFactory.getCurrentSession();
		
	}

	public Lending loadById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return (Lending) session.get(Lending.class, id);
	}

	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Lending where id = (:id)");
		query.setInteger("id", id);
		query.executeUpdate();		
		
	}
}
