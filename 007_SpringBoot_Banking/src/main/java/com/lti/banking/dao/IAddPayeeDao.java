package com.lti.banking.dao;

import com.lti.banking.exception.UserException;
import com.lti.banking.model.AddPayee;

public interface IAddPayeeDao {

	public AddPayee addPayee(AddPayee addPayee) throws UserException;
}
