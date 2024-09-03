package com.practice;
import java.util.*;

public class StoreIntInMap {
public static void main(String[] args) {
	
			int arr[]= {10,20,40,38,54,28,40,50,36,20};
			
			Map<Integer,Integer> map = new HashMap();
			
			for(int i=0;i<arr.length;i++) {
				
				if(map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i])+1);
				}
				else {
					map.put(arr[i], 1);
				}
			}
			
			System.out.println(map);
			
			
}
}
