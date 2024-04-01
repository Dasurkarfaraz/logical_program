package com.logicalprogram;

import java.util.HashMap;

public class count_chracter_count_into_String {
	
	public static void main(String[] args) {
		
		String str1 = "Polymorphishm means object behave diffrently";
		String str2 = str1.replaceAll(" ", "");
		
		char[] charArray = str2.toCharArray();
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();  // duplicate  // 1 null values 
		for(char ch : charArray) {
			
			if(m.containsKey(ch)) {
				
				m.put(ch, m.get(ch)+1); // keys +1 a  // a  1 +1 // a , 2 
				
				
			}else {
				m.put(ch,1); // a 1 
				
			}
			
			
			
		}
		
		System.out.println(m);
		
		
		
		
		
		
	}

}
