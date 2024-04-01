package com.logicalprogram;

public class Common_Element_in_Array {

	public static void main(String[] args) {
		
		int []  array1= {19,20,21,22,34,76};
		
		int []  array2= {19,20,65,87,34,76};
	
		
		
		for(int i=0;i<array1.length;i++) {
			//19 array 1
			for(int j=0; j<array2.length;j++) {
				if(array1[i]==array2[j])
				{
					System.out.println("Common Element are " + array1[i]);
				}
			}
			
			
		}
		
	}
	
	
}
