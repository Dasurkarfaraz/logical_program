package com.logicalprogram;

import java.util.ArrayList;

public class ArrayNegative_Positive_Split {

	public static void main(String[] args) {
		int a[] = {43, -67, 54,-20,-24,87, -43,98,-54,43 , -62,94, -56,34, -5}; // 10  - 11  21/2 10.5   

		ArrayList<Object> list = new ArrayList<Object>(); // Array list 
		
		ArrayList<Object> positive_List = new ArrayList<Object>(); // positive 5
		ArrayList<Object> negative_List = new ArrayList<Object>(); // 5
		
		for(int b:a) {
			
			if(b<=0) {
				
				negative_List.add(b);
				
			}else if(b>0) {
				
				positive_List.add(b);
				
			}else {
				System.out.println("Array Does not Exist");
			}
			
			
		}
//		for(int i=0 ; i < positive_List.size(); i++) { // a.length/2 
//			list.add(positive_List.get(i));
//			list.add(negative_List.get(i));
//		}
	//	System.out.println(a.length/2);
		
		for(int i=0 ; i < a.length/2; i++) { // a.length/2 
			
			list.add(positive_List.get(i));
			list.add(negative_List.get(i));
		}
		
		
		System.out.println(list);
		
		
		
		
		
		
		
		
	}

}
