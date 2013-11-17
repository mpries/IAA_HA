package de.nordakademie.action.interfaces;

import de.nordakademie.model.publication.Author;

/**
 * @author Lukas Weikert 
 * Interface muss von dem entsprechenden Manager
 * implementiert werden
 */
public interface IAuthorManager {

	Author search(String searchAuthor);

	void delete(String name);

	void save(String name);

	boolean isAlreadyAvailable(String addAuthor);

	boolean isAuthorReferenced(Author resultAuthor);

}
