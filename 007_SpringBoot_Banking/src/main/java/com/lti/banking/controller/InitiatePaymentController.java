package com.lti.banking.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.banking.exception.UserException;
import com.lti.banking.model.AddPayee;
import com.lti.banking.model.InitiatePayment;
import com.lti.banking.service.IAddPayeeService;
import com.lti.banking.service.IInitiatePaymentService;

@Controller
@RequestMapping(value = "/initiatePayment")
public class InitiatePaymentController {

	@Autowired
	private IInitiatePaymentService initiatePaymentService;
	
	@Autowired
	private IAddPayeeService addPayeeService;
	
	@RequestMapping(value = "/showTransactionList", method = RequestMethod.POST)
	public String saveCustomerPage(Model model) throws UserException {
		List<InitiatePayment> transactionList= initiatePaymentService.getTransactionList();
		transactionList.forEach((data)->System.out.println(data)); 
		model.addAttribute("transactionList",transactionList);
		return "transactionSuccessPage";
	}

	@RequestMapping(value = "/initiatePaymentForm")
	public String saveTransactionPage(Model model) throws UserException {
		model.addAttribute("initiatePayment", new InitiatePayment());
		return "initiatePaymentFormPage";
	}

	@RequestMapping(value = "/saveTransaction", method = RequestMethod.POST)
	public String saveTransactionAction(@ModelAttribute("initiatePayment") @Valid InitiatePayment initiatePayment,
			BindingResult bindingResult, Model model) throws UserException {
		System.err.println("Hello");
		/*
		 * if (bindingResult.hasErrors()) { System.out.println("inside error page");
		 * return "redirect:initiatePaymentFormPage"; }
		 */
		System.err.println(initiatePayment.getMode());
		System.err.println(initiatePaymentService.getMode(initiatePayment.getMode()).equals("NEFT"));
		System.err.println(initiatePayment.getMode().equals("NEFT"));

		if (initiatePayment.getMode().equals("NEFT")) {
			System.err.println("inside neft");
			initiatePayment = this.initiatePaymentService.doNeft(initiatePayment);
			return "beneficiaryAddedSuccessfully";
		}

		else if (initiatePayment.getMode().equals("RTGS")) {
			// new customer, add it
			System.err.println("inside rtgs");
			initiatePayment = this.initiatePaymentService.doRtgs(initiatePayment);
			return "transactionSuccessPage";
		}

		else if (initiatePayment.getMode().equals("IMPS")) {
			// new customer, add it
			System.err.println("inside imps");
			initiatePayment = this.initiatePaymentService.doImps(initiatePayment);
			return "transactionSuccessPage";
		}
		model.addAttribute("initiatePayment", initiatePayment);
		// return "redirect:/initPayment/initiatePaymentFormPage";
		return "/home";
	}
	/*
	@RequestMapping(value = "/addPayeeForm", method=RequestMethod.POST)
	public String savePayee(@ModelAttribute("addPayee") @Valid AddPayee addPayee, 
			BindingResult bindingResult, Model model)throws UserException {
		model.addAttribute("addPayee", new AddPayee());
		return "beneficiaryAddedSuccessfully";
	}*/
	

	@RequestMapping(value = "/addPayeeForm")
	public String getAddPayeePage(Model model) throws UserException {
		model.addAttribute("addPayee", new AddPayee());
		return "addPayeeFormPage";
	}
	
	
	@RequestMapping(value = "/savePayee", method=RequestMethod.POST)
	public String savePayee(@ModelAttribute("addPayee") @Valid AddPayee addPayee, 
			BindingResult bindingResult, Model model)throws UserException {
		System.err.println("Inside Add Payee");
		addPayee =this.addPayeeService.addPayee(addPayee);
		return "beneficiaryAddedSuccessfully";
	}

}
