package com.logicalprogram;

import java.util.HashMap;

public class count_of_integer {

	public static void main(String[] args) {
		int number = 12345;
		HashMap< Integer, Integer> map = new HashMap<Integer,Integer>();
		do {
		int rem = number%10; // 4
		number = number/10; // 12345123
		int temp = rem *0 +rem;
		System.out.print("This is reverse number "+temp);
		if(map.containsKey(rem)) {
			map.put(rem, map.get(rem)+1);
		}else {	
			map.put(rem,1);
		}
		}while(number!=0);
		System.out.print(map);
	}

}
