package com.logicalprogram;

public class character_Count_Array {

	public static void main(String[] args) {

		String  s = "FarazDasurkar";
		int count =0;
		char Charcter ;
		//char[] charArray = s.toCharArray();
		
		for(int i = 0 ; i< s.length();i++) {
//		System.out.println(s.charAt(i));
		Charcter = s.charAt(i); 
		
		//System.out.println();
//		char S1 = charArray[i];
		
		for(int j=0 ; j<s.length();j++) {
//			check the single character in the Arrray list and increase the count of it
			if((boolean) (s.charAt(j) == Charcter) ) {
				count ++; // Faraz Chater a
				
			}	
			
		}
		
		System.out.println(Charcter +"  Count is " +count);
		count = 0;
		}
	}

}
