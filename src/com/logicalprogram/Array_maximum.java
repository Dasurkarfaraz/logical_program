package com.logicalprogram;

import java.util.*;


public class Array_maximum {

	public static void main(String[] args) {
		
		int [] arr = {87,2,43,54,65,76}; //[0,] for 1 // 
		
		
		int max = arr[0]; 
        
     
        for (int i = 1; i < arr.length; i++) {
        	
            if (arr[i] > max) 
                max = arr[i]; 
	}
        System.out.println(max);
//		max = Arrays.stream(arr).max().getAsInt();
//		System.out.println(max);
	
		
	}

}
