package de.nordakademie.sort.lending.down;

import java.util.Comparator;

import de.nordakademie.model.Lending;

public class SortLendingDownByCustomerName implements
		Comparator<Lending> {

	@Override
	public int compare(Lending lending1, Lending lending2) {
		return lending2.getCustomer().getFirstName()
				.compareTo(lending1.getCustomer().getFirstName());
	}

}