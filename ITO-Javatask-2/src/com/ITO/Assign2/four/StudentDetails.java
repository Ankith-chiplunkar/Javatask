package com.ITO.Assign2.four;

public class StudentDetails {

	public StudentId studentId;
	public String firstName;
	public String lastName;
	public int age;
	public String deptName;
	public String courseName;
	
	public StudentDetails(StudentId studentId, String firstName, String lastName, int age, String deptName,
			String courseName) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.deptName = deptName;
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", deptName=" + deptName + ", courseName=" + courseName + "]";
	}
}
