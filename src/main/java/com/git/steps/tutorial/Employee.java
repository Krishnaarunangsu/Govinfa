/**
 * 
 */
package com.git.steps.tutorial;

import java.io.Serializable;

/**
 * @author Arunangsu
 *
 */
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2561010854994653346L;
	private String employeeId;
	private String employeeName;
	private String employeeAge;
	private String employeeSalary;

	/**
	 * 
	 */
	public Employee() {
		// No Argument 
	}

	public Employee(String employeeId, String employeeName, String employeeAge, String employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
	}

	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the employeeAge
	 */
	public String getEmployeeAge() {
		return employeeAge;
	}

	/**
	 * @param employeeAge the employeeAge to set
	 */
	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}

	/**
	 * @return the employeeSalary
	 */
	public String getEmployeeSalary() {
		return employeeSalary;
	}

	/**
	 * @param employeeSalary the employeeSalary to set
	 */
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	

}
