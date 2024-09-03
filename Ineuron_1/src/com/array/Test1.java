package com.array;
import java.util.*;

public class Test1 {
public static void main(String[] args) {
		
		int arr[] = {73,67,38,33};
		
		int a = 33;
		List<Integer> list= new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i]>=38 && arr[i]%5==3) {
				
				
			}
			else {
				list.add(arr[i]);
			}
			
		}
		
		for(Integer i:list) {
			System.err.println(i);
		}
}
}

