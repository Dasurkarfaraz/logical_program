package com.logicalprogram;

public class Missing_Number_Array {
	 
	   public static void main(String args[])   
	   {
	      int arr[]= {1,2,4,5,6,7};   //Declare array
	      int sum1=0;
	      int sum2=0;
	      for(int i =0;i<arr.length;i++) {
	    	  sum1 = sum1+arr[i];  
	      }
	      for(int i = 1 ; i<=7;i++) {
	    	  sum2 = sum2+i;
	      }
	      System.out.println("Missing Number is " +(sum2 - sum1));
	   }
	   
}
