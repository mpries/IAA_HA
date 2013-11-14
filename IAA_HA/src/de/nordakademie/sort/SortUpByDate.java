package de.nordakademie.sort;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

public class SortUpByDate implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication1.getReleaseDate().compareTo(
				publication2.getReleaseDate());
	}
}
