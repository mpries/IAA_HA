package de.nordakademie.sort.publication.up;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

public class SortPublicationUpByTitle implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication1.getTitle().compareTo(publication2.getTitle());
	}
}
