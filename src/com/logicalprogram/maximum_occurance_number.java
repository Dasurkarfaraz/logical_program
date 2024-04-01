package com.logicalprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class maximum_occurance_number {

	
	public static void main(String[] args) {
		
		String str ="baaaaacyyyyyyyyyy";
		char[] charArray = str.toCharArray();
		int count = 0;
		HashMap<Character, Integer> m = new HashMap<Character,Integer>();
		
		for(char ch : charArray) {
			
			if(m.containsKey(ch)) {
				m.put(ch, m.get(ch)+1);
				
			}else {
				m.put(ch, 1);
			}
			for(int value : m.values()) {
				if(value>count) {
					count = value;
					
				}
			}
			
			
			
	}
		
		 
		
		System.out.println("maximum occurence " +count);
		
		
		
}
	
}

