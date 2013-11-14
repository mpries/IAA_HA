package de.nordakademie.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

import de.nordakademie.model.publication.Publication;

@Entity
public class Lending {

	@ManyToOne
	protected Publication publication;
	@OneToOne
	protected Customer customer;
	protected Date loanDate;
	protected Date returnDate;
	@OneToOne(cascade=CascadeType.ALL)
	protected Warning warning;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public Lending(){
		this.warning = new Warning();
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public Customer getCustomer() {
		return customer;
	}

	
	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Warning getWarning() {
		return warning;
	}
	
	public void setWarning(Warning warning) {
		this.warning = warning;
	}
	
	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}
	
	
}
