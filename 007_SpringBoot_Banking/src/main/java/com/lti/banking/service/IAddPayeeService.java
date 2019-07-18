package com.lti.banking.service;

import com.lti.banking.exception.UserException;
import com.lti.banking.model.AddPayee;

public interface IAddPayeeService {

	public AddPayee addPayee(AddPayee addPayee) throws UserException;
}
