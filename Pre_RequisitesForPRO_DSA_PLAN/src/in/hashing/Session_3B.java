package in.hashing;
import java.util.*;

public class Session_3B {
public static void main(String[] args) {
	
		//Bit confusing cross check with someone 
	
	/*
	 * Optimised Approach:- Instead of Running 2 Nested For loops, we will create a Hashmap to Store the 
	 * Occurences of the Elements which we have encountered in the past. 
	 * At each index i, we will calculate the Required Element, = (arr[i]+k), 
	 * we wil check if it is present in hashmap, 
	 * we will do cnt = cnt + freq[requiredElement]. We will update the frequency for current element in hashmap.
	 */
		int arr[] = {1,5,2,4,1};
		int k=3;
		int count=0;
		
		Map<Integer, Integer> map = new HashMap();
		//Not able to implement now
		
		for(int i=0;i<arr.length;i++) {
			
			
		}
		
		
}
}
