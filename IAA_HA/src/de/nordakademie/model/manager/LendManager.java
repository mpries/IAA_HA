package de.nordakademie.model.manager;

import de.nordakademie.dao.LendDAO;
import de.nordakademie.model.interfaces.ILendManager;

public class LendManager implements ILendManager {
	
	private LendDAO lendDAO;


	
	@Override
	public Object view() {

		return null;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object edit() {
		// TODO Auto-generated method stub
		return null;
	}

	public LendDAO getLendDAO() {
		return lendDAO;
	}

	public void setLendDAO(LendDAO lendDAO) {
		this.lendDAO = lendDAO;
	}

}
