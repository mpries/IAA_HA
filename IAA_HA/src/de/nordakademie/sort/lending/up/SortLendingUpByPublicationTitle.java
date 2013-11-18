package de.nordakademie.sort.lending.up;

import java.util.Comparator;

import de.nordakademie.model.Lending;

/**
 * @author Lukas Weikert
 * Klasse zum aufsteigenden Sortieren von Ausleihvorgängen nach dem
 * Titel der Publikation
 */
public class SortLendingUpByPublicationTitle implements Comparator<Lending> {

	@Override
	public int compare(Lending lending1, Lending lending2) {
		return lending1.getPublication().getTitle()
				.compareTo(lending2.getPublication().getTitle());
	}

}