package com.logicalprogram;

public class Decending_number {
	
	public static void main(String[] args) {
		int[] arr = {32,5,7,35,2,9,8,0}; 
		int temp ;
		for(int i =0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp =arr[i];
					arr[i] = arr[j];
					arr[j]= temp;	
				}		
			}
		}
		System.out.println("Accending number are ");
		for(int i =0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
		
		
		
	
}


