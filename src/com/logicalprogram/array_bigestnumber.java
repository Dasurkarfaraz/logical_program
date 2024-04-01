package com.logicalprogram;

import java.util.Arrays;

public class array_bigestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,65,76,5,4,33,4,34,232,3,2323 , -5};
		
		int max = arr[0]; // 1
		
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i] > max)
				max = arr[i];
		}
		
		
		System.out.println(max);
		
//		int asInt = Arrays.stream(arr).max().getAsInt();
//		System.out.println(asInt);
	}

}

// jenkins 
// Open Project  // 1 2 3 
// Pipeline  20 testcase 20 testcase -- pine line linitlaise env --> Maven >> MVN command 1-2-3 

//