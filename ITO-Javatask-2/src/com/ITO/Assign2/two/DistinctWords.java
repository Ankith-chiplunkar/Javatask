package com.ITO.Assign2.two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class DistinctWords {
	static LinkedHashMap<String, Integer> m= new LinkedHashMap<String, Integer>();
	
	public Map<String,Integer> distinctword() throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("D:\\ITO\\java\\Assign.txt"));
		String st = br.readLine();
		if(st!=null) {
			st = st.toUpperCase();   
			String[] words = st.split(" ");
			
			for (int i = 0; i < words.length; i++) {
				if(m.containsKey(words[i])) {
					m.put(words[i], m.get(words[i])+1);
				} else {
					m.put(words[i], 1);
				}
				
			}
		}
	
		return m;
	}	
	
	
	
	public static void main(String[] args) throws Exception {
		DistinctWords file=new DistinctWords();
		file.distinctword();
		for (Map.Entry<String, Integer> string : m.entrySet()) {
			System.out.println(string.getKey()+"\t"+string.getValue());
		

	}

}
	
}
