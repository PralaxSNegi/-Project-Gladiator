package com.lti.banking.service;

import java.util.List;

import com.lti.banking.exception.UserException;
import com.lti.banking.model.InitiatePayment;

public interface IInitiatePaymentService {
	public InitiatePayment doNeft(InitiatePayment initiatePayment) throws UserException;
	public InitiatePayment doRtgs(InitiatePayment initiatePayment) throws UserException;
	public InitiatePayment doImps(InitiatePayment initiatePayment) throws UserException;
	public Boolean getMode(String mode) throws UserException;
	public List<InitiatePayment> getTransactionList() throws UserException;
}
