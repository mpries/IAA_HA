package de.nordakademie.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import de.nordakademie.model.Customer;
import de.nordakademie.model.Lending;
import de.nordakademie.model.Warning;
import de.nordakademie.model.publication.Publication;

/**
 * 
 * @author Matthias Pries
 * @category DAO Class:
 * 
 *           Diese Klasse ist fuer das lesen und schreiben von Ausleihvorgaengen aus bzw.
 *           in die DB verantwortlich
 * 
 */
public class LendDAO {

	private SessionFactory sessionFactory;

	public void create(Lending lend) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(lend);

	}

	@SuppressWarnings("unchecked")
	public List<Lending> loadLendingsWithWarning() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Lending>) session
				.createQuery(
						"select distinct l from Lending l, Warning w where warning_id = w.id and w.amount > 0")
				.list();
	}

	@SuppressWarnings("unchecked")
	public List<Lending> loadAll() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Lending>) session.createQuery("from Lending").list();
	}

	public Lending loadById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return (Lending) session.get(Lending.class, id);
	}

	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session
				.createQuery("delete from Lending where id = (:id)");
		query.setInteger("id", id);
		query.executeUpdate();

	}

	@SuppressWarnings("unchecked")
	public List<Lending> loadWithExpiredDate() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Lending.class);
		criteria.add(Restrictions.lt("returnDate", new Date()));
		return (List<Lending>) criteria.list();
	}

	public int loadWarningAmount(Lending lending) {
		Session session = sessionFactory.getCurrentSession();
		Warning warning = (Warning) session.get(Warning.class, lending
				.getWarning().getId());
		return warning.getAmount();
	}

	public void increaseWarningAmount(Lending lending, int i) {
		Session session = sessionFactory.getCurrentSession();
		Warning warning = (Warning) session.get(Warning.class, lending
				.getWarning().getId());
		warning.setAmount(i);
		session.saveOrUpdate(warning);

	}

	@SuppressWarnings("unchecked")
	public List<Lending> loadByCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session
				.createQuery("from Lending where customer_customerid = (:customer_id)");
		query.setInteger("customer_id", customer.getCustomerId());
		return (List<Lending>) query.list();
	}

	public void setWarningToZero(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session
				.createQuery("update Warning set amount = 0 where id = (:id)");
		query.setInteger("id", id);
		query.executeUpdate();

	}

	public Warning loadWarningById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return (Warning) session.get(Warning.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Lending> loadByPublication(Publication publication) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session
				.createQuery("from Lending where publication_id = (:id)");
		query.setInteger("id", publication.getId());
		return (List<Lending>) query.list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
