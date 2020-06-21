package com.journal.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.journal.model.Person;

public class PersonDAOImpl implements PersonDAO {
	
	
	private SessionFactory sessionfactory;
	

	@Override
	public void savePerson(Person p) {
		// TODO Auto-generated method stub
		
       Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
       
		
	}

	@Override
	public void updatePerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePerson(int id) {
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(id);
		tx.commit();
		session.close();
       
		
	}

}
