package de.nordakademie.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import de.nordakademie.model.Customer;

public class CustomerDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	public Customer load(int id) {
		Session session = sessionFactory.getCurrentSession();
		return (Customer) session.get(Customer.class, id);
	}
	
	public void edit(Customer customer){
		Session session = sessionFactory.getCurrentSession();
		session.update(customer);
		
	}

	public void delete(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(customer);
		
	}

	@SuppressWarnings("unchecked")
	public List<Customer> loadAll() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Customer>)session.createQuery("from Customer").list();
	}

}
