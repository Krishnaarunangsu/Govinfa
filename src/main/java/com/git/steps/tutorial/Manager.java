/**
 * 
 */
package com.git.steps.tutorial;

import java.io.Serializable;

/**
 * @author Arunangsu
 *
 */
public class Manager implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3368352655096111509L;
	/**
	 * 
	 */
	private String managerID;
	private String managerName;
	private String managerAge;
	private String managerDepartment;
	
	public Manager() {
		// No Argument Constructor
	}
	
	

	/**
	 * @param managerID
	 * @param managerName
	 * @param managerAge
	 */
	public Manager(String managerID, String managerName, String managerAge, String managerDepartment) {
		super();
		this.managerID = managerID;
		this.managerName = managerName;
		this.managerAge = managerAge;
		this.managerDepartment = managerDepartment;
	}



	/**
	 * @return the managerID
	 */
	public String getManagerID() {
		return managerID;
	}

	/**
	 * @param managerID the managerID to set
	 */
	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}

	/**
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}

	/**
	 * @param managerName the managerName to set
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	/**
	 * @return the managerAge
	 */
	public String getManagerAge() {
		return managerAge;
	}

	/**
	 * @param managerAge the managerAge to set
	 */
	public void setManagerAge(String managerAge) {
		this.managerAge = managerAge;
	}



	/**
	 * @return the managerDepartment
	 */
	public String getManagerDepartment() {
		return managerDepartment;
	}



	/**
	 * @param managerDepartment the managerDepartment to set
	 */
	public void setManagerDepartment(String managerDepartment) {
		this.managerDepartment = managerDepartment;
	}
	
	
}
