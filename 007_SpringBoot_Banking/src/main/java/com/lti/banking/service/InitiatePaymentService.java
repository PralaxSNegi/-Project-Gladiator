package com.lti.banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.dao.IInitiatePaymentDao;
import com.lti.banking.exception.UserException;
import com.lti.banking.model.InitiatePayment;

@Service
public class InitiatePaymentService implements IInitiatePaymentService {
	
	@Autowired
	private IInitiatePaymentDao  initiatePaymentDao;

	@Override
	@Transactional
	public InitiatePayment doNeft(InitiatePayment initiatePayment) throws UserException {
		// TODO Auto-generated method stub
		return initiatePaymentDao.doNeft(initiatePayment);
	}

	@Override
	@Transactional
	public InitiatePayment doRtgs(InitiatePayment initiatePayment) throws UserException {
		// TODO Auto-generated method stub
		return initiatePaymentDao.doRtgs(initiatePayment);
	}

	@Override
	@Transactional
	public InitiatePayment doImps(InitiatePayment initiatePayment) throws UserException {
		// TODO Auto-generated method stub
		return initiatePaymentDao.doImps(initiatePayment);
	}
	
	@Override
	@Transactional
	public Boolean getMode(String mode) throws UserException{
		return initiatePaymentDao.getMode(mode);
	}

	@Override
	@Transactional
	public List<InitiatePayment> getTransactionList() throws UserException {
		return initiatePaymentDao.getTransactionList();
		
	}

}
