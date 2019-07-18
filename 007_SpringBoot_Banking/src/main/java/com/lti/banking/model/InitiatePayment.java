package com.lti.banking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="INITIATE_PAYMENT")
public class InitiatePayment {		
	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRANSACTION_GEN")
	@SequenceGenerator(name = "TRANSACTION_GEN", sequenceName = "Transaction_Seq", allocationSize = 1)
	@Column(name="TRANSACTION_ID")
	private Long transactionId;
	
	@Column(name="ACCOUNT_NUMBER")
	private Integer fromAccount;
	
	@Column(name="BALANCE")
	private Integer balance;
	
	@Column(name="PAYEE_ACCOUNT_NUMBER")
	private Integer toAccount;
	
	@Column(name="AMOUNT")
	private Integer amount;
	
	@Column(name="TRANSACTION_DATE")
	private Date tansactionDate;
	
	@Column(name="REMARK")
	private String remark;
	
	@Column(name="IFSC_CODE")
	private String ifscCode;
	
	@Column(name="NAME_OF_BANK")
	private String nameOfBank;

	@Column(name="MODE_OF_PAYMENT")
	private String mode;
	
	public InitiatePayment() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the fromAccount
	 */
	public Integer getFromAccount() {
		return fromAccount;
	}

	/**
	 * @param fromAccount the fromAccount to set
	 */
	public void setFromAccount(Integer fromAccount) {
		this.fromAccount = fromAccount;
	}

	/**
	 * @return the balance
	 */
	public Integer getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	/**
	 * @return the toAccount
	 */
	public Integer getToAccount() {
		return toAccount;
	}

	/**
	 * @param toAccount the toAccount to set
	 */
	public void setToAccount(Integer toAccount) {
		this.toAccount = toAccount;
	}

	/**
	 * @return the amount
	 */
	public Integer getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	/**
	 * @return the tansactionDate
	 */
	public Date getTansactionDate() {
		return tansactionDate;
	}

	/**
	 * @param tansactionDate the tansactionDate to set
	 */
	public void setTansactionDate(Date tansactionDate) {
		this.tansactionDate = tansactionDate;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the ifscCode
	 */
	public String getIfscCode() {
		return ifscCode;
	}

	/**
	 * @param ifscCode the ifscCode to set
	 */
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	/**
	 * @return the nameOfBank
	 */
	public String getNameOfBank() {
		return nameOfBank;
	}

	/**
	 * @param nameOfBank the nameOfBank to set
	 */
	public void setNameOfBank(String nameOfBank) {
		this.nameOfBank = nameOfBank;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InitiatePayment [transactionId=" + transactionId + ", fromAccount=" + fromAccount + ", balance="
				+ balance + ", toAccount=" + toAccount + ", amount=" + amount + ", tansactionDate=" + tansactionDate
				+ ", remark=" + remark + ", ifscCode=" + ifscCode + ", nameOfBank=" + nameOfBank + ", mode=" + mode
				+ "]";
	}

	public InitiatePayment(Integer fromAccount, Integer balance, Integer toAccount, Integer amount, Date tansactionDate,
			String remark, String ifscCode, String nameOfBank, String mode) {
		super();
		this.fromAccount = fromAccount;
		this.balance = balance;
		this.toAccount = toAccount;
		this.amount = amount;
		this.tansactionDate = tansactionDate;
		this.remark = remark;
		this.ifscCode = ifscCode;
		this.nameOfBank = nameOfBank;
		this.mode = mode;
	}

	

    
	
	
}
