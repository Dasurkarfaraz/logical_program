package com.logicalprogram;

public class Convert_Frist_word_to_upperCase {
	
	
	public static void main(String[] args) {
		
		String words= "automation tester Faraz dasurkar";
		String[] arrwords = words.split(" ");
		
		
		//System.out.println(arrwords[0]);
		
		for(int i=0;i<arrwords.length;i++) {
			
			char[] charArray = arrwords[i].toCharArray();
			//System.out.println(charArray[0]);
		
			
			
			
			for(int j=0;j<charArray.length;j++) {
			
				charArray[0]=  Character.toUpperCase(charArray[0]);
				System.out.print(charArray[j]);
			
			
			
			
			}
			System.out.println("\n");
//			
//			String replace = arrwords[i].replace(charArray[0], upperCase);
//			System.out.println(replace);
//			
			
		
			
		}
		
	}

}
