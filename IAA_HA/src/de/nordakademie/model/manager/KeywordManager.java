package de.nordakademie.model.manager;

import de.nordakademie.dao.KeywordDAO;
import de.nordakademie.dao.PublicationDAO;
import de.nordakademie.model.interfaces.IKeywordManager;
import de.nordakademie.model.publication.Keyword;

/**
 * 
 * @author Matthias Pries
 * @category Manager Class:
 * 
 *           Diese Klasse implementiert die Logik fuer das Model Keyword
 * 
 */
public class KeywordManager implements IKeywordManager {

	private KeywordDAO keywordDAO;
	private PublicationDAO publicationDAO;

	@Override
	public Keyword search(String searchKeyword) {
		return keywordDAO.load(searchKeyword);
	}

	@Override
	public void save(String description) {
		keywordDAO.save(new Keyword(description));

	}

	@Override
	public void delete(String description) {
		keywordDAO.delete(new Keyword(description));

	}

	@Override
	public boolean isKeywordReferenced(Keyword resultKeyword) {
		if (publicationDAO.loadByKeyword(resultKeyword).isEmpty()) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isAlreadyAvailable(String resultKeyword) {
		if (keywordDAO.load(resultKeyword) == null) {
			return false;
		}
		return true;
	}

	public KeywordDAO getKeywordDAO() {
		return keywordDAO;
	}

	public void setKeywordDAO(KeywordDAO keywordDAO) {
		this.keywordDAO = keywordDAO;
	}

	public PublicationDAO getPublicationDAO() {
		return publicationDAO;
	}

	public void setPublicationDAO(PublicationDAO publicationDAO) {
		this.publicationDAO = publicationDAO;
	}
}
