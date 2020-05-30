package com.ITO.Assign2.four;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeMap;

import org.junit.jupiter.api.Test;

class Junittest {

	@Test
	void test1() {
		MainClass student = new MainClass();
		TreeMap<StudentId, StudentDetails> details = MainClass.studentdetails();
		assertEquals("StudentId [deptCode=CV5, year=1, id=11]", details.firstKey().toString());
	}
	@Test
	void test2() {
		MainClass student = new MainClass();
		TreeMap<StudentId, StudentDetails> details = MainClass.studentdetails();
		assertFalse(details.isEmpty());
	}
	@Test
	void test3() {
		MainClass student = new MainClass();
		TreeMap<StudentId, StudentDetails> details = MainClass.studentdetails();
		assertEquals("StudentId [deptCode=ME3, year=4, id=10]", details.lastKey().toString());
	}

}
