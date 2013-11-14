package de.nordakademie.sort.lending.down;

import java.util.Comparator;

import de.nordakademie.model.Lending;

public class SortLendingDownByCustomerId implements
		Comparator<Lending> {

	@Override
	public int compare(Lending lending1, Lending lending2) {
		return lending2.getCustomer().getCustomerId()
				- lending1.getCustomer().getCustomerId();
	}
}
