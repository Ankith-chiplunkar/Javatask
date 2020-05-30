package com.ITO.Assign2.four;

public class StudentId {

	public String deptCode;
	public int year;
	public int id;

	public StudentId(String deptCode, int year, int id) {
		super();
		this.deptCode = deptCode;
		this.year = year;
		this.id = id;
	}

	@Override
	public String toString() {
		return "StudentId [deptCode=" + deptCode + ", year=" + year + ", id=" + id + "]";
	}
}
