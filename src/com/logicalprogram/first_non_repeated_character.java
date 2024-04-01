package com.logicalprogram;

public class first_non_repeated_character {

	public static void main(String[] args) {
		String s = "bvaaaib";
		char[] ch = s.toCharArray();
		for(char c:ch) {
//			System.out.println(s.indexOf(c));
//			System.out.println(s.lastIndexOf(c));
			if(s.indexOf(c)== s.lastIndexOf(c)) {
				System.out.println(c +" Charcter is Non Repeated");
				break;
			}else {
				System.out.println(c +" Character is Repeated");
			}
		}
		

	}

}
