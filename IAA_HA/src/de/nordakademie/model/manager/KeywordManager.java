package de.nordakademie.model.manager;

import de.nordakademie.dao.KeywordDAO;
import de.nordakademie.model.interfaces.IKeywordManager;
import de.nordakademie.model.publication.Keyword;

public class KeywordManager implements IKeywordManager {

	private KeywordDAO keywordDAO;

	public KeywordDAO getKeywordDAO() {
		return keywordDAO;
	}

	public void setKeywordDAO(KeywordDAO keywordDAO) {
		this.keywordDAO = keywordDAO;
	}

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
}