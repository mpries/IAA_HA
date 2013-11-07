package de.nordakademie.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import de.nordakademie.model.Customer;
import de.nordakademie.model.Student;

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
		System.out.println(id);
		Session session = sessionFactory.getCurrentSession();
		return (Customer) session.get(Student.class, id);
	}

}
