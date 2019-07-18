package com.lti.banking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.lti.banking.exception.UserException;
import com.lti.banking.model.InitiatePayment;

@Repository
public class InitiatePaymentDao  implements IInitiatePaymentDao{
	@PersistenceContext
	private EntityManager enitityManager;

	@Override
	public InitiatePayment doNeft(InitiatePayment initiatePayment) throws UserException {
		// TODO Auto-generated method stub
		enitityManager.persist(initiatePayment);
		return(initiatePayment);
	}

	@Override
	public InitiatePayment doRtgs(InitiatePayment initiatePayment) throws UserException {
		// TODO Auto-generated method stub
		enitityManager.persist(initiatePayment);
		return(initiatePayment);
	}

	@Override
	public InitiatePayment doImps(InitiatePayment initiatePayment) throws UserException {
		// TODO Auto-generated method stub
		enitityManager.persist(initiatePayment);
		return(initiatePayment); 
	}
	
	public Boolean getMode(String mode) throws UserException {
		// TODO Auto-generated method stub
	CriteriaBuilder builder = enitityManager.getCriteriaBuilder();
	CriteriaQuery<String> criteria = builder.createQuery(String.class);
	Root<InitiatePayment> rootInitiatePayment = criteria.from(InitiatePayment.class);
	criteria.select(rootInitiatePayment.get("mode"));
	criteria.where(builder.equal(rootInitiatePayment.get("mode"), mode));
	try {
	String result = enitityManager.createQuery(criteria).getSingleResult();
	return true;
	}
	catch(NoResultException nre) {
		return false;
	}
	}

	@Override
	public List<InitiatePayment> getTransactionList() throws UserException {
			return enitityManager.createQuery("from InitiatePayment").getResultList();
	}
}
