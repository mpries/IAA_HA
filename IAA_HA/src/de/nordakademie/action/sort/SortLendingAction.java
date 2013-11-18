package de.nordakademie.action.sort;

import java.util.Collections;
import java.util.List;

import com.opensymphony.xwork2.Action;
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
import de.nordakademie.sort.lending.up.SortLendingUpByCustomerId;
import de.nordakademie.sort.lending.up.SortLendingUpByCustomerName;
import de.nordakademie.sort.lending.up.SortLendingUpById;
import de.nordakademie.sort.lending.up.SortLendingUpByLoanDate;
import de.nordakademie.sort.lending.up.SortLendingUpByPublicationId;
import de.nordakademie.sort.lending.up.SortLendingUpByPublicationTitle;
import de.nordakademie.sort.lending.up.SortLendingUpByReturnDate;

/**
 * @author Lukas Weikert 
 * Actionklasse sortiert die Übersichtstabelle der offenen
 * Ausleihvorgänge nach den gewählten Suchkriterien
 * 
 */
public class SortLendingAction extends ActionSupport implements Action {

	private static final long serialVersionUID = -1641859581800266719L;
	private ILendManager lendManager;
	private List<Lending> lendings;
	private String sort;
	private String sortBy;

	public void validate() {
		if (sort == null) {
			addFieldError("sort", getText("validationNoSearchcriteria"));
		}
		if (sortBy == null) {
			addFieldError("sortBy", getText("validationNoSearchcriteria"));
		}
	}

	@Override
	public String execute() {
		setLendings(lendManager.loadAll());
		if (sort.equals(getText("up"))) {
			if (sortBy.equals(getText("lendingId"))) {
				Collections.sort(lendings, new SortLendingUpById());
			} else if (sortBy.equals(getText("loanDate"))) {
				Collections.sort(lendings,
						new SortLendingUpByLoanDate());
			} else if (sortBy.equals(getText("returnDate"))) {
				Collections.sort(lendings,
						new SortLendingUpByReturnDate());
			} else if (sortBy.equals(getText("customerId"))) {
				Collections.sort(lendings,
						new SortLendingUpByCustomerId());
			} else if (sortBy.equals(getText("customerName"))) {
				Collections.sort(lendings,
						new SortLendingUpByCustomerName());
			} else if (sortBy.equals(getText("publicationId"))) {
				Collections.sort(lendings,
						new SortLendingUpByPublicationId());
			} else if (sortBy.equals(getText("publicationTitle"))) {
				Collections.sort(lendings,
						new SortLendingUpByPublicationTitle());
			}
		} else if (sort.equals(getText("down"))) {
			if (sortBy.equals(getText("lendingId"))) {
				Collections
						.sort(lendings, new SortLendingDownById());
			} else if (sortBy.equals(getText("loanDate"))) {
				Collections.sort(lendings,
						new SortLendingDownByLoanDate());
			} else if (sortBy.equals(getText("returnDate"))) {
				Collections.sort(lendings,
						new SortLendingDownByReturnDate());
			} else if (sortBy.equals(getText("customerId"))) {
				Collections.sort(lendings,
						new SortLendingDownByCustomerId());
			} else if (sortBy.equals(getText("customerName"))) {
				Collections.sort(lendings,
						new SortLendingDownByCustomerName());
			} else if (sortBy.equals(getText("publicationId"))) {
				Collections.sort(lendings,
						new SortLendingDownByPublicationId());
			} else if (sortBy.equals(getText("publicationTitle"))) {
				Collections.sort(lendings,
						new SortLendingDownByPublicationTitle());
			}
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
