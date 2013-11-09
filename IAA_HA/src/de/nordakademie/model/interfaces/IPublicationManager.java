package de.nordakademie.model.interfaces;

import de.nordakademie.model.publication.Publication;

public interface IPublicationManager {

	public Publication view(int id);

	public void delete(Publication publication);

	public void create(Publication publication);

	public void edit(Publication publication);

}
