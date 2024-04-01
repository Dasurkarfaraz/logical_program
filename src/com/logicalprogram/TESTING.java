package com.logicalprogram;

public class TESTING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 12345; 
		int reverse =0; 
	
		while(number !=0) {
			//reverse = reverse*10; 
			reverse = (reverse *10)+ number%10; 
			number =number/10;
	
		}
		System.out.println("Number is Reverse " +reverse);

	}

	
	

}
