package com.ITO;

import java.util.Iterator;
import java.util.TreeSet;

public class Assign4 {
	
	public static void main(String[] args) {
TreeSet<Integer> set=new TreeSet<Integer>();
		
		set.add(5);
		set.add(3);
		set.add(2);
		set.add(6);
		set.add(5);
		System.out.println(set);
		 
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		TreeSet<Integer> set1=new TreeSet<Integer>();
		
		set1.addAll(set);
		
		System.out.println(set1);
		
		
		System.out.println(set1.descendingSet());
		
		System.out.println(set1.pollFirst());
		
		System.out.println(set1.pollLast());
	}

}
