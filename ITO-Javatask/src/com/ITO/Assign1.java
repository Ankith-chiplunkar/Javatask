package com.ITO;

import java.util.ArrayList;

public class Assign1 {

	public static void main(String[] args) {
		ArrayList<String> student= new ArrayList<String>();
		student.add("bat");
		student.add("sat");
		student.add("ant");
		student.add("mat");
		System.out.println(student);
		
		for(String str:student)
		{
			System.out.println(str);
		}
       student.remove(3);
       System.out.println(student);
       
       student.set(1, "cat");
       System.out.println(student);
       
       student.clear();
       System.out.println(student);

	}

}
