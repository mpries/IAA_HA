package de.nordakademie.action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import de.nordakademie.model.Customer;
import de.nordakademie.model.interfaces.ILendManager;
import de.nordakademie.model.publication.Publication;

public class LendAction extends ActionSupport implements Action, Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8577228181964209162L;
	private ILendManager lendManager;
	private List<Publication> publications;
	private List<Customer> customers;
	private Date currentDate;
	private Date returnDate;
	private int customerId;
	private int id;

	public String execute() {

		return SUCCESS;
	}

	public String create() {
		if (!lendManager.isCopyAvailable(id)) {
			addFieldError("id", "Kein Examplar mehr im Bestand");
			return INPUT;
		}
		lendManager.create(customerId, id, currentDate, returnDate);
		return "create";
	}

	private void createLoanDate() {
		this.setCurrentDate(new Date());
		this.setReturnDate(lendManager.createReturnDate());
	}

	public ILendManager getLendManager() {
		return lendManager;
	}

	public void setLendManager(ILendManager lendManager) {
		this.lendManager = lendManager;
	}

	public List<Publication> getPublications() {
		return publications;
	}

	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public void prepare() throws Exception {
		createLoanDate();
		publications = lendManager.loadPublications();
		customers = lendManager.loadCustomer();

	}

}
