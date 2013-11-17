package de.nordakademie.model.manager;

import de.nordakademie.action.interfaces.IAuthorManager;
import de.nordakademie.dao.AuthorDAO;
import de.nordakademie.dao.PublicationDAO;
import de.nordakademie.model.publication.Author;
/**
 * 
 * @author Matthias Pries
 * @category Manager Class:
 * 
 * Diese Klasse implementiert die Logik fuer das Model Author
 *
 */
public class AuthorManager implements IAuthorManager {

	private AuthorDAO authorDAO;
	private PublicationDAO publicationDAO;

	@Override
	public boolean isAlreadyAvailable(String resultAuthor) {
		if (authorDAO.load(resultAuthor) == null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isAuthorReferenced(Author resultAuthor) {
		if (publicationDAO.loadByAuthor(resultAuthor).isEmpty()) {
			return false;
		}
		return true;
	}

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

	public PublicationDAO getPublicationDAO() {
		return publicationDAO;
	}

	public void setPublicationDAO(PublicationDAO publicationDAO) {
		this.publicationDAO = publicationDAO;
	}

}
