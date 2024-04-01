package com.logicalprogram;

public class Factorial_Number {

	public static void main(String[] args) {
		
		int n =5;
		int temp = 1;
		if(n==0) {
			System.out.println(temp);
		}else {
		for(int i=1;i<=n;i++) {
			//System.out.println(i);
			temp *=i;
		//	temp = temp*i;
		}
		System.out.println(temp);
		}

	}

}
