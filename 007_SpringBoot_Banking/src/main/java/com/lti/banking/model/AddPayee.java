package com.lti.banking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADD_PAYEE")
public class AddPayee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAYEE_GEN")
	@SequenceGenerator(name = "PAYEE_GEN", sequenceName = "Add_payee_Seq", allocationSize = 1)
	@Column(name = "BENEFICIARY_ID")
	private Integer beneficiaryId;

	@Column(name = "BENEFICIARY_NAME")
	private String beneficiaryName;

	@Column(name = "BENEFICIARY_ACCOUNT_NUMBER")
	private Integer beneficiaryAccountNumber;

	@Column(name = "IFSC_CODE")
	private String beneficiaryIfscCode;

	@Column(name = "NAME_OF_BANK")
	private String beneficiaryNameOfBank;

	@Column(name = "NICK_NAME")
	private String beneficiaryNickName;

	public AddPayee() {
		// TODO Auto-generated constructor stub
	}

	public AddPayee(String beneficiaryName, Integer beneficiaryAccountNumber, String beneficiaryIfscCode,
			String beneficiaryNameOfBank, String beneficiaryNickName) {
		super();
		this.beneficiaryName = beneficiaryName;
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
		this.beneficiaryIfscCode = beneficiaryIfscCode;
		this.beneficiaryNameOfBank = beneficiaryNameOfBank;
		this.beneficiaryNickName = beneficiaryNickName;
	}

	/**
	 * @return the beneficiaryId
	 */
	public Integer getBeneficiaryId() {
		return beneficiaryId;
	}

	/**
	 * @param beneficiaryId
	 *            the beneficiaryId to set
	 */
	public void setBeneficiaryId(Integer beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	/**
	 * @return the beneficiaryName
	 */
	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	/**
	 * @param beneficiaryName
	 *            the beneficiaryName to set
	 */
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	/**
	 * @return the beneficiaryAccountNumber
	 */
	public Integer getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}

	/**
	 * @param beneficiaryAccountNumber
	 *            the beneficiaryAccountNumber to set
	 */
	public void setBeneficiaryAccountNumber(Integer beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	/**
	 * @return the beneficiaryIfscCode
	 */
	public String getBeneficiaryIfscCode() {
		return beneficiaryIfscCode;
	}

	/**
	 * @param beneficiaryIfscCode
	 *            the beneficiaryIfscCode to set
	 */
	public void setBeneficiaryIfscCode(String beneficiaryIfscCode) {
		this.beneficiaryIfscCode = beneficiaryIfscCode;
	}

	/**
	 * @return the beneficiaryNameOfBank
	 */
	public String getBeneficiaryNameOfBank() {
		return beneficiaryNameOfBank;
	}

	/**
	 * @param beneficiaryNameOfBank
	 *            the beneficiaryNameOfBank to set
	 */
	public void setBeneficiaryNameOfBank(String beneficiaryNameOfBank) {
		this.beneficiaryNameOfBank = beneficiaryNameOfBank;
	}

	/**
	 * @return the beneficiaryNickName
	 */
	public String getBeneficiaryNickName() {
		return beneficiaryNickName;
	}

	/**
	 * @param beneficiaryNickName
	 *            the beneficiaryNickName to set
	 */
	public void setBeneficiaryNickName(String beneficiaryNickName) {
		this.beneficiaryNickName = beneficiaryNickName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AddPayee [beneficiaryId=" + beneficiaryId + ", beneficiaryName=" + beneficiaryName
				+ ", beneficiaryAccountNumber=" + beneficiaryAccountNumber + ", beneficiaryIfscCode="
				+ beneficiaryIfscCode + ", beneficiaryNameOfBank=" + beneficiaryNameOfBank + ", beneficiaryNickName="
				+ beneficiaryNickName + "]";
	}

}
