package com.logicalprogram;

public class fibonaci {
	
	public static void main(String[] args) {
		int s1 = 0 , s2 =1 , s3;
		
		System.out.println(s1);
		System.out.println(s2);
		
		for(int i=2;i<=10;i++)
		{
			s3 = s1+s2;
			System.out.println(s3);
			s1 =s2;
			s2 = s3;
			
			
		}
		
		
	}

}
