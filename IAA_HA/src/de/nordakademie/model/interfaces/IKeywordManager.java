package de.nordakademie.model.interfaces;
/**
 * 
 * @author Matthias Pries
 * @category Manager Interface:
 * 
 * Dieses Interface wird vom KeywordManager implementiert und stellt alle benoetigten Mehtoden bereit
 *
 */
import de.nordakademie.model.publication.Keyword;

public interface IKeywordManager {

	public Keyword search(String searchKeyword);

	public void save(String description);

	public void delete(String description);

	public boolean isKeywordReferenced(Keyword resultKeyword);

	public boolean isAlreadyAvailable(String addKeyword);

}
