package com.journal.service;

import com.journal.dao.PersonDAO;
import com.journal.model.Person;

public class PersonServiceImpl implements PersonService  {
	
	private PersonDAO personDAO;

	@Override
	public void PersonSave(Person p) {
		// TODO Auto-generated method stub
		
		personDAO.savePerson(p);
		
		
	}

	@Override
	public void UpdatedPerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		
	}

}
