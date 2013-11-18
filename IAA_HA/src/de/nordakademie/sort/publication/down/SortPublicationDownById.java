package de.nordakademie.sort.publication.down;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

/**
 * @author Lukas Weikert
 * Klasse zum absteigenden Sortieren von Publikationen nach der 
 * Publikations ID
 */
public class SortPublicationDownById implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication2.getId() - publication1.getId();
	}
}