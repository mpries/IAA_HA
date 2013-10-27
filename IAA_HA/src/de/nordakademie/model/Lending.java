package de.nordakademie.model;

import java.util.Date;
import java.util.List;

import de.nordakademie.model.publication.Publication;

public class Lending {

	List<Publication> publication;
	Customer customer;
	Date date;
	Warning warning;
	
	public List<Publication> getPublication() {
		return publication;
	}
	public void setPublication(List<Publication> publication) {
		this.publication = publication;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
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
