/**
 * 
 */
package com.git.steps.tutorial;

import java.io.Serializable;

/**
 * @author Arunangsu
 *
 */
public class Intern implements Serializable {

	/**
	 * 
	 */
	private String internId;
	private String internName;
	private static final long serialVersionUID = 8027649216019007308L;

	/**
	 * 
	 */
	public Intern() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param internId
	 * @param internName
	 */
	public Intern(String internId, String internName) {
		super();
		this.internId = internId;
		this.internName = internName;
	}

	/**
	 * @return the internId
	 */
	public String getInternId() {
		return internId;
	}

	/**
	 * @param internId the internId to set
	 */
	public void setInternId(String internId) {
		this.internId = internId;
	}

	/**
	 * @return the internName
	 */
	public String getInternName() {
		return internName;
	}

	/**
	 * @param internName the internName to set
	 */
	public void setInternName(String internName) {
		this.internName = internName;
	}
	

}
