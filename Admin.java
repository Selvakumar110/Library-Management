package com.lms;

class Admin {
	
	private String studentName;
	private int studentId;
	private String className;
	
	public Admin(String studentName , int studentId, String className) {
		this.studentName = studentName;
		
		this.studentId = studentId;
		
		this.className = className;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}

