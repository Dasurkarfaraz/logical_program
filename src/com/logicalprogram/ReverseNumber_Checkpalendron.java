package com.logicalprogram;

import java.util.ArrayList;

public class ReverseNumber_Checkpalendron {

	
	public static void main(String[] args) {
		
		int number = 16461;
		int temp = number;
		int remnumber =0;
		do {
			
			int rem = number%10; // 4 // 3 // 2 
			
			number = number/10; // 123 // 12 //1 // 123 //
			remnumber = remnumber *10 +	rem		;// 0 +4  // 40 +3 = 43 // 430 + 2 45
			
		}while(number!=0);
		
		System.out.println(remnumber);
		System.out.println(temp);
		if(remnumber==temp) {
			System.out.println("palendrone");
		}else {
			System.out.println("This is not Palendrone");
		}
	}
}
