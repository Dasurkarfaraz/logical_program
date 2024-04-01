package com.logicalprogram;

import java.util.HashMap;

public class Find_Duplicate_number_Array {

	public static void main(String[] args) {
		
		int arr[] = {23,45,23,56,76,54,87,23};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}else {
				map.put(arr[i], 1);
			}
		}

//		map.entrySet().stream().forEach(entry -> 
//		{
//            int value = entry.getValue();
//            int key = entry.getKey();
//            if (value > 1) {
//                System.out.println( key + " Duplicate number in Array   " + value);
//            } else {
//                System.out.println(key + " Duplicate number is not in Array  " + value);
//            }
//        });
		
		for(int value : map.values()) {
			if(value>1) {
				System.out.println(   "Dulicate value Present in array is  " +value );
			}
		}
		

	}

}
