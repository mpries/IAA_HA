package de.nordakademie.model.interfaces;

import de.nordakademie.model.publication.Keyword;

public interface IKeywordManager {

	public Keyword search(String searchKeyword);

	public void save(String description);

	public void delete(String description);

	public boolean isKeywordReferenced(Keyword resultKeyword);

	public boolean isAlreadyAvailable(Keyword resultKeyword);

}
