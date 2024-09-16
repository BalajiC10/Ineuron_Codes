package in.hashing;

import java.util.HashMap;
import java.util.Map;

public class Session_1B {
	
	
	public static void Optimized(int[] arr,int k) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i]) && i-map.get(arr[i])<=k) {
				
				System.out.println("true");
			}
			map.put(arr[i], i);
		}
		
		
		
		
	}

	public static void main(String[] args) {
		
		
		
		int arr[] = {1,2,1,3,1,2};
		int k=2;
		
		
		Session_1B.Optimized(arr,k);
		
	}
}
