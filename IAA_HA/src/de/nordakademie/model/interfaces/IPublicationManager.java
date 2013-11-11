package de.nordakademie.model.interfaces;

import java.util.List;

import de.nordakademie.model.publication.Publication;

public interface IPublicationManager {

	public List<Publication> view(String title, String author, String keyword);

	public void delete(Publication publication);

	public void create(Publication publication);

	public void edit(Publication publication);

}
