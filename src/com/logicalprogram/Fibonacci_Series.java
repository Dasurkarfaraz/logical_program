package com.logicalprogram;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		
		int n1 = 0,n2=1 , n3;
		System.out.print(n1);
		System.out.print(n2);
		for(int i =2;i<=10;i++) {
			//System.out.println(i);
			n3 = n1+n2;
			System.out.print(n3 +"\t");
			//0 1 1 2
			n1 = n2;
			n2 = n3;
			
		}

	}

}
