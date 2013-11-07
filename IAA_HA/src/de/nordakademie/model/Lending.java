package de.nordakademie.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import de.nordakademie.model.publication.Publication;

@Entity(name="LENDING")
public class Lending {

	@OneToMany
	protected List<Publication> publication;
	@OneToOne
	protected Customer customer;
	protected Date date;
	@OneToOne
	protected Warning warning;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Lending(List<Publication> publication, Customer customer, Date date,
			Warning warning) {
		this.publication = publication;
		this.customer = customer;
		this.date = date;
		this.warning = warning;
	}

	public List<Publication> getPublication() {
		return publication;
	}
	
	public void setPublication(List<Publication> publication) {
		this.publication = publication;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Warning getWarning() {
		return warning;
	}
	
	public void setWarning(Warning warning) {
		this.warning = warning;
	}
	
	
}
