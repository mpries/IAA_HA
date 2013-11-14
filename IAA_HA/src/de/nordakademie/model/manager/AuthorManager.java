package de.nordakademie.model.manager;

import de.nordakademie.action.interfaces.IAuthorManager;
import de.nordakademie.dao.AuthorDAO;
import de.nordakademie.model.publication.Author;

public class AuthorManager implements IAuthorManager {

	private AuthorDAO authorDAO;

	@Override
	public Author search(String searchAuthor) {
		return authorDAO.load(searchAuthor);
	}

	@Override
	public void delete(String name) {
		authorDAO.delete(new Author(name));

	}

	@Override
	public void save(String name) {
		authorDAO.save(new Author(name));

	}

	public AuthorDAO getAuthorDAO() {
		return authorDAO;
	}

	public void setAuthorDAO(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}

}
