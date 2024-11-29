package com.hashing.basics;

import java.util.HashMap;

public class Lecture5 {
public static void main(String[] args) {
	/*
	 * Count all i,j pairs where i<j and abs(b[i]-b[j]) = k [k>=0] 
	 */
	
		HashMap<Integer, Integer> map = new HashMap<>(); //(arr[i], freq)
		
		int arr[] = {1,5,3,4,2};  //i=1
				//           i          //
		int cnt=0; //3
		int k=2;
		
		for(int i=0;i<arr.length;i++) { //1-2 =1 or 1+2 =3

			
			if(map.containsKey(arr[i]-k)) {   
				cnt+=map.get(arr[i]-k); //1
			}
			else if(map.containsKey(arr[i]+k)) {  
				cnt+=map.get(arr[i]+k);
			}
			
				map.put(arr[i], map.getOrDefault(arr[i],0)+1); //1,
			
			
			}
	}
}


