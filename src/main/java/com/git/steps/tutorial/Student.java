/**
 * 
 */
package com.git.steps.tutorial;

import java.io.Serializable;

/**
 * @author Arunangsu
 *
 */
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5200933403801521491L;
	private String studentId;
	private String studentName;

	/**
	 * 
	 */
	public Student() {
		// No Argument Constructor
	}
	

	/**
	 * @param studentId
	 * @param studentName
	 */
	public Student(String studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}


	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

}
