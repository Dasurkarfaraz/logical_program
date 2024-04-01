package com.logicalprogram;

public class Firstnon_repeacted_number {

	public static void main(String[] args) {
	
		int [] arr = {12,3,45,67,78,34,34,65,12};
		for(int i =0;i<arr.length;i++) {
			int count =0;
			for(int j =0;j<arr.length;j++) {
				
				if(arr[i]== arr[j]) {
				//	System.out.println("this is number " +arr[i]);
					count ++;
				}
				if(count >1) {
					System.out.println("Number is Repeacted " +arr[i] + " "+count);
					break;
				}
				
			}
			
			
		}
		

	}

}
