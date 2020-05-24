package com.ITO;

import java.util.Set;
import java.util.TreeMap;

public class Assign6 {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "A");
		map.put(10, "B");
		map.put(200, "C");
		map.put(57, "D");
		map.put(100, "E");
		
		System.out.println(map);
		
		
		Set<Integer> key=map.keySet();
	    System.out.println(key);
	    
	    System.out.println("first key: "+map.firstKey());
	    System.out.println("last key: "+map.lastKey());
	    
	    
	    System.out.println("reverse order: "+ map.descendingKeySet());
	    
	    map.clear(); 
	    System.out.println(map);

	}

}
