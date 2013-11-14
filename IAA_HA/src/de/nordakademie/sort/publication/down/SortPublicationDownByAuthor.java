package de.nordakademie.sort.publication.down;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

public class SortPublicationDownByAuthor implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication2.getAuthors().get(0).getName()
				.compareTo(publication1.getAuthors().get(0).getName());
	}

}
