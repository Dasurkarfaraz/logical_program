package com.logicalprogram;

public class AdditionIfIddAndEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		int evenadd = 0; 
		int oddadd = 0;
		for(int number : arr) {
			
			
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
