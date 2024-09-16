package in.hashing;

import java.util.*;

public class Session_4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,5,3,4,2}; // t =2+1; => t = 1+2 => t= arr[i]+k;
		int k=2;
		int count=0;
		
		
		Map<Integer, Integer> map = new HashMap();
		
		for(int i=0;i<arr.length;i++) { //1+2 , 5+2 , 3+2=5 ,4+2 =6 ,2+2=4,3+2=5
			
			int target = arr[i]+k; //3,7,5,6,4,5
			
			if(map.containsKey(target)) {
				System.out.println(arr[i]+"=="+target);
				count++; //1,2,3
			}
			map.put(arr[i], (map.get(arr[i]+1))); //(1,1) (5,1) (3,2) (4,1) (2,1) (3,1)
		}
		
		System.out.println("Count is "+count);
		
		
	}

}
