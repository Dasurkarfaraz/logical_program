package com.logicalprogram;

public class First_second_gretest_number {
	
	public static void main(String[] args) {
		int[] arr= {34,0,54,100,2,44,76};
		int temp ;
		
		
		for(int i =0;i< arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}	
			}	
		}
		System.out.println("Dessending Order are bellow" );
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
			
		}
		
		System.out.println("Gretest Number of Array are " +arr[0]);
		
		System.out.println("Gretest Number of Array are " +arr[arr.length-1]);
		
	}
	
	
	
	

}
