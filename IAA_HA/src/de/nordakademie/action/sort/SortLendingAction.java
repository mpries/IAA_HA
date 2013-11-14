package de.nordakademie.action.sort;

import java.util.Collections;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.model.Lending;
import de.nordakademie.model.interfaces.ILendManager;
import de.nordakademie.sort.lending.down.SortLendingDownByCustomerId;
import de.nordakademie.sort.lending.down.SortLendingDownByCustomerName;
import de.nordakademie.sort.lending.down.SortLendingDownById;
import de.nordakademie.sort.lending.down.SortLendingDownByLoanDate;
import de.nordakademie.sort.lending.down.SortLendingDownByPublicationId;
import de.nordakademie.sort.lending.down.SortLendingDownByPublicationTitle;
import de.nordakademie.sort.lending.down.SortLendingDownByReturnDate;
import de.nordakademie.sort.lending.down.SortLendingDownByWarningId;
import de.nordakademie.sort.lending.up.SortLendingUpByCustomerId;
import de.nordakademie.sort.lending.up.SortLendingUpByCustomerName;
import de.nordakademie.sort.lending.up.SortLendingUpById;
import de.nordakademie.sort.lending.up.SortLendingUpByLoanDate;
import de.nordakademie.sort.lending.up.SortLendingUpByPublicationId;
import de.nordakademie.sort.lending.up.SortLendingUpByPublicationTitle;
import de.nordakademie.sort.lending.up.SortLendingUpByReturnDate;
import de.nordakademie.sort.lending.up.SortLendingUpByWarningId;

public class SortLendingAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1641859581800266719L;
	private ILendManager lendManager;
	private List<Lending> lendings;
	private String sort = new String();
	private String sortBy = new String();

	@Override
	public String execute() {
		setLendings(lendManager.loadAll());
		switch (sort) {
		case "up":
			switch (sortBy) {
			case "Id":
				Collections.sort(lendings, new SortLendingUpById());
				break;
			case "loanDate":
				Collections.sort(lendings, new SortLendingUpByLoanDate());
				break;
			case "returnDate":
				Collections.sort(lendings, new SortLendingUpByReturnDate());
				break;
			case "Customer Id":
				Collections.sort(lendings, new SortLendingUpByCustomerId());
				break;
			case "Customer Name":
				Collections.sort(lendings, new SortLendingUpByCustomerName());
				break;
			case "Publication Id":
				Collections.sort(lendings, new SortLendingUpByPublicationId());
				break;
			case "Publication Title":
				Collections.sort(lendings,
						new SortLendingUpByPublicationTitle());
				break;
			default:
				break;
			}
			break;
		case "down":
			switch (sortBy) {
			case "Id":
				Collections.sort(lendings, new SortLendingDownById());
				break;
			case "loanDate":
				Collections.sort(lendings, new SortLendingDownByLoanDate());
				break;
			case "returnDate":
				Collections.sort(lendings, new SortLendingDownByReturnDate());
				break;
			case "Customer Id":
				Collections.sort(lendings, new SortLendingDownByCustomerId());
				break;
			case "Customer Name":
				Collections.sort(lendings, new SortLendingDownByCustomerName());
				break;
			case "Publication Id":
				Collections
						.sort(lendings, new SortLendingDownByPublicationId());
				break;
			case "Publication Title":
				Collections.sort(lendings,
						new SortLendingDownByPublicationTitle());
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
		return SUCCESS;

	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public ILendManager getLendManager() {
		return lendManager;
	}

	public void setLendManager(ILendManager lendManager) {
		this.lendManager = lendManager;
	}

	public List<Lending> getLendings() {
		return lendings;
	}

	public void setLendings(List<Lending> lendings) {
		this.lendings = lendings;
	}

}
