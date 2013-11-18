package de.nordakademie.sort.publication.down;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

/**
 * @author Lukas Weikert
 * Klasse zum absteigenden Sortieren von Publikationen nach dem 
 * Erscheinungsdatum
 */
public class SortPublicationDownByDate implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication2.getReleaseDate().compareTo(
				publication1.getReleaseDate());
	}
}
