package com.hashing;

import java.util.Scanner;

public class Launch2 {
public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		
		int hash[] = new int[10];
		
		
		for(int k=0;k<arr.length;k++) { //O(n)
				
			hash[arr[k]]=hash[arr[k]]+1; //or hash[arr[k]]++;
		}
		
		for(int j=0;j<hash.length;j++) { //O(q)
			System.out.println(j+"-->"+hash[j]);
		}
		
		//Time Complexity is O(N+Q) which is  much lesser than and better than O(N*Q)
		//Space Complexity :- O(maximum number in the original array) = O(50) = size of the hash array 
		
		
}
}
