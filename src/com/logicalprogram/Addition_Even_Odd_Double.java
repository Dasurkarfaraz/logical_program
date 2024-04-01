package com.logicalprogram;

public class Addition_Even_Odd_Double {
	public static void main(String[] args) {
		
		
		double[] arr = {1.8,2.7,3.5,4.3,5.9,6.3,7.6,8.9,9.3,10,11,12,13,14,15,16,17,18.6};
		double evenadd = 0; 
		double oddadd = 0;
		for(double number : arr) {
			
			
		if(number%2 ==0) {
			evenadd=number + evenadd;  // 2 +0 // 2 //4 +2 // 6 
			
			
		}else {
			oddadd=number + oddadd; 
			//System.out.println(number + oddadd);
		}
		
		}
		System.out.println("Even number is "+evenadd);
		System.out.println("Odd number is "+oddadd);
	}
	}


