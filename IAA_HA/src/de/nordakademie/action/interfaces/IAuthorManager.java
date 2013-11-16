package de.nordakademie.action.interfaces;

import de.nordakademie.model.publication.Author;

public interface IAuthorManager {

	Author search(String searchAuthor);

	void delete(String name);

	void save(String name);

	boolean isAlreadyAvailable(String addAuthor);

	boolean isAuthorReferenced(Author resultAuthor);

}
