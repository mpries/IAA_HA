package de.nordakademie.model.manager;

import de.nordakademie.model.Student;
import de.nordakademie.model.interfaces.IManager;

public class LendManager implements IManager {

	Student student = new Student("peter", "meier", 123);
	
	@Override
	public Object view() {
		System.out.println(student.getFirstName());
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

}
