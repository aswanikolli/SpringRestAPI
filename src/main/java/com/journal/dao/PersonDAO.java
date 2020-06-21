package com.journal.dao;

import com.journal.model.Person;

public interface PersonDAO {
	
 public void savePerson(Person p);
	
	public void updatePerson();
	
	public void deletePerson(int id);

}
