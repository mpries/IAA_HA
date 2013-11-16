package de.nordakademie.action.core;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.model.interfaces.IKeywordManager;
import de.nordakademie.model.publication.Keyword;

public class KeywordAction extends ActionSupport implements Action{

	/**
	 * 
	 */
	private static final long serialVersionUID = 187620308795145733L;
	private String searchKeyword;
	private Keyword resultKeyword;
	private IKeywordManager keywordManager;
	private String editKeyword;
	private String addKeyword;
	
	
	public String add(){
		if(!keywordManager.isAlreadyAvailable(addKeyword)){
			keywordManager.save(addKeyword);
			return "addKeyword";
		}
		addFieldError("addKeyword", "Keyword gibt es schon");
		return "input";
	}
	
	
	public String search(){
		resultKeyword = keywordManager.search(searchKeyword);
		return "search";
	}
	
	public String save(){
		if(!keywordManager.isKeywordReferenced(resultKeyword)){
			keywordManager.save(editKeyword); 
			keywordManager.delete(resultKeyword.getDescription());
			return "save";
		}
		addFieldError("resultKeyword.description", "Keyword wird refernziert");
		return "input";
	}
	
	public String delete(){
		if(!keywordManager.isKeywordReferenced(resultKeyword)){
			keywordManager.delete(resultKeyword.getDescription());
			return "delete";
		}
		addFieldError("resultKeyword.description", "Keyword wird refernziert");
		return "input";
	}
	

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public IKeywordManager getKeywordManager() {
		return keywordManager;
	}

	public void setKeywordManager(IKeywordManager keywordManager) {
		this.keywordManager = keywordManager;
	}

	public Keyword getResultKeyword() {
		return resultKeyword;
	}

	public void setResultKeyword(Keyword resultKeyword) {
		this.resultKeyword = resultKeyword;
	}

	public String getEditKeyword() {
		return editKeyword;
	}

	public void setEditKeyword(String editKeyword) {
		this.editKeyword = editKeyword;
	}

	public String getAddKeyword() {
		return addKeyword;
	}

	public void setAddKeyword(String addKeyword) {
		this.addKeyword = addKeyword;
	}

}
