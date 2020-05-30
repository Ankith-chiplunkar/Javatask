package com.ITO.Assign2.four;

import java.util.Map;
import java.util.TreeMap;

public class MainClass {
	
	static TreeMap<StudentId, StudentDetails> m= new TreeMap<StudentId, StudentDetails>(new SortByYear());
	public static TreeMap<StudentId, StudentDetails> studentdetails(){
		
		StudentId student1 = new StudentId("ME1", 2, 8);
		StudentId student2 = new StudentId("CS1", 2, 2);
		StudentId student3 = new StudentId("ME3", 4, 10);
		StudentId student4 = new StudentId("EC5", 1, 5);
		StudentId student5 = new StudentId("EE2", 3, 6);
		StudentId student6 = new StudentId("CS1", 4, 7);
		StudentId student7 = new StudentId("ME3", 2, 18);
		StudentId student8 = new StudentId("EC4", 4, 1);
		StudentId student9 = new StudentId("CV5", 1, 11);
		StudentId student10 = new StudentId("CS1",3, 21);
		StudentId student11= new StudentId("ME3", 2, 3);
		
		StudentDetails details1 = new StudentDetails(student1, "Ankith", "Chiplunkar", 20, "MECH", "BE");
		StudentDetails details2 = new StudentDetails(student2, "Manoj", "S", 20, "CSE", "BE");
		StudentDetails details3 = new StudentDetails(student3, "Ashwath", "Bidappa", 22, "MECH", "BE");
		StudentDetails details4 = new StudentDetails(student4, "Prajwal", "S", 19, "ECE", "BE");
		StudentDetails details5 = new StudentDetails(student5, "Ranjitha", "G", 21, "EEE", "BE");
		StudentDetails details6 = new StudentDetails(student6, "Premsagar", "KS", 22, "CSE", "BE");
		StudentDetails details7 = new StudentDetails(student7, "Keerthan", "YB", 20, "MECH", "BE");
		StudentDetails details8 = new StudentDetails(student8, "Sachin", "G", 22, "ECE", "BE");
		StudentDetails details9 = new StudentDetails(student9, "Santhosh", "G", 19, "CV", "BE");
		StudentDetails details10 = new StudentDetails(student10, "Krishna", "Sham", 21, "CSE", "BE");
		StudentDetails details11 = new StudentDetails(student11, "Guru", "Prasad", 20, "MECH", "BE");
		
		m.put(student1, details1);
		m.put(student2, details2);
		m.put(student3, details3);
		m.put(student4, details4);
		m.put(student5, details5);
		m.put(student6, details6);
		m.put(student7, details7);
		m.put(student8, details8);
		m.put(student9, details9);
		m.put(student10, details10);
		m.put(student11, details11);
		
		return m;

	}
	public static void main(String[] args) {
		MainClass.studentdetails();
		for (Map.Entry<StudentId, StudentDetails> lm : m.entrySet()) {
			System.out.println(lm.getKey()+" : "+lm.getValue());
			System.out.println();
		}
	}

}
