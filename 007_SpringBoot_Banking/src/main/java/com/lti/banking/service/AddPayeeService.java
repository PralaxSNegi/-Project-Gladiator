package com.lti.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.dao.IAddPayeeDao;
import com.lti.banking.exception.UserException;
import com.lti.banking.model.AddPayee;

@Service
public class AddPayeeService implements IAddPayeeService {

	@Autowired
	private IAddPayeeDao addPayeeDao;

	@Override
	@Transactional
	public AddPayee addPayee(AddPayee addPayee) throws UserException {
		addPayeeDao.addPayee(addPayee);
		return addPayee;
	}

}
