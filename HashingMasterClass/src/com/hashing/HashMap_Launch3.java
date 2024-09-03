package com.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Launch3 {
public static void main(String[] args) {
		
		/* TC :- O(N+Q) :- Insertion operation in a Hashmap has average O(1) time complexity 
						   and printing hashmap[i] also takes O(1) time on average. 
			
			Final Solution:- Use HashMap instead of Hash array (Key,Value) Pair Mapping 

			Use HashMap Data structure!

			It is exactly the same as Hashing array but it saves space! 

			Hashmap only takes O(N) space in the worst case! Whereas Hashing array takes O(max element in array space)

		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = scan.nextInt();
		
		int arr[]= new int[n];
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
			int g =	map.getOrDefault(arr[i], 0);
			map.put(arr[i], g+1);
				
				
		}
		
		System.out.println("Enter queries");
		int q =scan.nextInt();
		for(int i=0;i<q;i++) {
			
			int query = scan.nextInt();
			int count = map.getOrDefault(query, 0);
			System.out.println(count);
		}
		
		
//		HashMap<Integer, Integer> hash = new HashMap();
//		int ar[] = {1,2,3,4,4,5,2,8,9};
//		
//		for(int k=0;k<ar.length;k++) {
//			
//			if(hash.containsValue(ar[k])) {
//				hash.put(ar[k], (hash.get(ar[k])+1));
//			}
//			else {
//				hash.put(ar[k], 1);
//			}
//		}
//		
//		for(int j=0;j<hash.size();j++) {
//			System.out.println(hash.keySet());
//		}
		
		
		
		
		
}
}
