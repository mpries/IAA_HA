package de.nordakademie.action.core;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.IAuthorManager;
import de.nordakademie.model.publication.Author;

/**
 * @author Lukas Weikert 
 * Actionklasse dient dem Verwalten der Autoren
 */
public class AuthorAction extends ActionSupport implements Action {

	private static final long serialVersionUID = -3935188184802035628L;
	private IAuthorManager authorManager;
	private String searchAuthor;
	private Author resultAuthor;
	private String editAuthor;
	private String addAuthor;

	public String add() {
		if (authorManager.isAlreadyAvailable(addAuthor)) {
			addFieldError("addAuthor", "Autor existiert bereits");
			return INPUT;
		}
		authorManager.save(addAuthor);
		return "addAuthor";
	}

	public String search() {
		resultAuthor = authorManager.search(searchAuthor);
		return "search";
	}

	public String save() {
		if (authorManager.isAuthorReferenced(resultAuthor)) {
			addFieldError("editAuthor", "Autor wird refernziert");
			return INPUT;
		}
		authorManager.save(editAuthor);
		authorManager.delete(resultAuthor.getName());
		return "save";
	}

	public String delete() {
		authorManager.delete(resultAuthor.getName());
		return "delete";
	}

	public String getAddAuthor() {
		return addAuthor;
	}

	public void setAddAuthor(String addAuthor) {
		this.addAuthor = addAuthor;
	}

	public IAuthorManager getAuthorManager() {
		return authorManager;
	}

	public void setAuthorManager(IAuthorManager authorManager) {
		this.authorManager = authorManager;
	}

	public String getSearchAuthor() {
		return searchAuthor;
	}

	public void setSearchAuthor(String searchAuthor) {
		this.searchAuthor = searchAuthor;
	}

	public Author getResultAuthor() {
		return resultAuthor;
	}

	public void setResultAuthor(Author resultAuthor) {
		this.resultAuthor = resultAuthor;
	}

	public String getEditAuthor() {
		return editAuthor;
	}

	public void setEditAuthor(String editAuthor) {
		this.editAuthor = editAuthor;
	}

}
