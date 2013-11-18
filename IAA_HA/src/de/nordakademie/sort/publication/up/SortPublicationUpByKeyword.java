package de.nordakademie.sort.publication.up;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

/**
 * @author Lukas Weikert
 * Klasse zum aufsteigenden Sortieren von Publikationen nach dem ersten
 * Schlagwort der Liste
 */
public class SortPublicationUpByKeyword implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication1.getKeywords().get(0).getDescription()
				.compareTo(publication2.getKeywords().get(0).getDescription());
	}

}
