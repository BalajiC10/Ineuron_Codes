package in.hashing;
import java.util.*;

public class Session_2B {
public static void main(String[] args) {
	
		
	//Optimized Code
	/*
	 * Optimised Approach:- At each Index i, we will find the Complementary Element We need. 
	 * Now, we will check if this Complementary Element is present in Map Already, 
	 * we will do countt++. We will now update entry of our current index element in map.
	 */
	
	int[] arr = {1, 2, 3, 4, 5};
	int k = 6;
	int  count=0;
	
	Map<Integer, Integer> map = new HashMap();
	for(int i=0;i<arr.length;i++) {
		
		int compli = k - arr[i];  //6-1=5,6-2=4,6-3=3,6-4=2,6-5=1
		
		if(map.containsKey(compli)) { //5,4,3,2,1
			count++; //1,2
		}
		map.put(arr[i], i); //(1-0,2-1,3-2,4-3,5-4
	}
	
	System.out.println(map);
	System.out.println(count);
}
}
