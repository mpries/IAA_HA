package de.nordakademie.sort.publication.down;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

public class SortPublicationDownByStored implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication2.getStored() - publication1.getStored();
	}
}