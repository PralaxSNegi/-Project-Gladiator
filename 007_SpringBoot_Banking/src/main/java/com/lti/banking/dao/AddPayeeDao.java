package com.lti.banking.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.banking.exception.UserException;
import com.lti.banking.model.AddPayee;

@Repository
public class AddPayeeDao implements IAddPayeeDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public AddPayee addPayee(AddPayee addPayee) throws UserException {
		
		entityManager.persist(addPayee);
		return addPayee;
	}
}
