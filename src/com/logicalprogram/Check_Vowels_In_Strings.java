package com.logicalprogram;

public class Check_Vowels_In_Strings {
	
	public static void main(String[] args) {
		
	 char[] vowels = {'a','e','i','o','u'}; //a
	 String CheckVowels= "aMy Name is FAraz Dasurkar oO"; // String
	 int count =0;
	//System.out.println(CheckVowels.length());
	
	for(int i =0;i<vowels.length;i++) { // M
	
		
		for(int j=i;j<CheckVowels.length();j++) { /// a
			//System.out.println(vowels[j]);
			char charAt = CheckVowels.toLowerCase().charAt(j);
			if(vowels[i]==charAt) { // a 
				count ++;
				//System.out.println( vowels[i] + "  this is vowels  " + charAt);
			}else {
				//System.out.println( vowels[i] + "  this is not vowels   " + charAt);
			}
			
			
			
		}
		
		System.out.println(vowels[i]+ " Count is " + count);
		count = 0;
		
	}
	
	 
		
		
	}

}
