package de.nordakademie.sort.lending.up;

import java.util.Comparator;

import de.nordakademie.model.Lending;

/**
 * @author Lukas Weikert
 * Klasse zum aufsteigenden Sortieren von Ausleihvorgängen nach dem
 * Namen des Ausleihers
 */
public class SortLendingUpByCustomerName implements Comparator<Lending> {

	@Override
	public int compare(Lending lending1, Lending lending2) {
		return lending1.getCustomer().getFirstName()
				.compareTo(lending2.getCustomer().getFirstName());
	}

}