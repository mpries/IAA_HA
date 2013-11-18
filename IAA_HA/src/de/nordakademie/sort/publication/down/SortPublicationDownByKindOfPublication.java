package de.nordakademie.sort.publication.down;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

/**
 * @author Lukas Weikert
 * Klasse zum absteigenden Sortieren von Publikationen nach der Art der
 * Publikation
 */
public class SortPublicationDownByKindOfPublication implements
		Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication2.getKindOfPublication().getKind()
				.compareTo(publication1.getKindOfPublication().getKind());
	}
}