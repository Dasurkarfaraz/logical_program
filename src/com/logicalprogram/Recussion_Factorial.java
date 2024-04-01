package com.logicalprogram;

public class Recussion_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = factorial(5);
		System.out.println(factorial);
	}
	// recussion
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n * factorial(n-1); // 5 *4 = 20// 20 *19 =  
		
		
		
	}

}
