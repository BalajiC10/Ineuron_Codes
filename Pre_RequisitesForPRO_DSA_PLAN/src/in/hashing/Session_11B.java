package in.hashing;
import java.util.*;

public class Session_11B {
public static void main(String[] args) {
	
		
	int nums[] = {2,7,11,15}; 
	int target = 9;
	
	/*
	 * Optimized code using HashMap
	 */
	
	Map<Integer,Integer> map = new HashMap<>();
	
	for(int i=0;i<nums.length;i++) {
		
		int rem = target - nums[i]; //9-2 =7
		
		
			
		map.put(nums[i], i);
		
		
	}
}
}
