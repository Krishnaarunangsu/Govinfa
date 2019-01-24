/**
 * 
 */
package com.git.steps.tutorial;

import java.io.Serializable;

/**
 * @author arunangsu.sahu
 *
 */
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3910873451054302594L;
	private String companyId;
	private String companyName;

	/**
	 * 
	 */
	public Company() {
		// No-argument Constructor
	}

	/**
	 * @param companyId
	 * @param companyName
	 */
	public Company(String companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}

	/**
	 * @return the companyId
	 */
	public String getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	

}
