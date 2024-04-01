package com.logicalprogram;

public class count_Single_Character_into_String {

	
	
	public static void main(String[] args) {
		
		String str1 = "Java is the programing Language";
		singleCharacter("m", str1);
				
		
		
	}
	
	
	public static void singleCharacter(String a , String str1) {
		
		String s1 = str1.replace(a,"");
		int count = str1.length();
		int Count2 = s1.length();
		int finalcount = count - Count2;
		System.out.println("Count For "+a+" is " +finalcount);
		
		
		
	}
}
