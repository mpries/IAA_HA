package de.nordakademie.sort.lending.up;

import java.util.Comparator;

import de.nordakademie.model.Lending;

/**
 * @author Lukas Weikert
 * Klasse zum aufsteigenden Sortieren von Ausleihvorgängen nach der
 * Publikations ID
 */
public class SortLendingUpByPublicationId implements Comparator<Lending> {

	@Override
	public int compare(Lending lending1, Lending lending2) {
		return lending1.getPublication().getId()
				- lending2.getPublication().getId();
	}
}
