package in.hashing;

public class Session_5B {
	
	static int[] getPrefixSum(int nums[]) {
		
		
	    
	 	int n = nums.length;
	 	int[] prefix = new int[n];
	 	prefix[0]=nums[0];
     for (int i = 1; i < n; ++i) {
         prefix[i] = prefix[i - 1] + nums[i];
     }
		     
     return prefix;
	}
	
	static int OptimizedSum(int prefix[], int l, int r) {
		
		return prefix[r]-prefix[l-1];
	}
	
public static void main(String[] args) {
	
	int[] nums = {1,5,5,5,5};
				//0,1,2,3,4
	int prefix[] = Session_5B.getPrefixSum(nums);
	
	for(int k:prefix) {
   	 System.out.println(k);
    }
	
	int l=2;
	int r=4;
	System.out.println("======================");
	System.out.println(OptimizedSum(prefix,l,r));
	
	/*
	 * Time Complexity - O(N+Q) 
	O(n) for creating Prefix Array
	O(q) for Traversing Queries 

	 Space Complexity - O(N) Because of Prefix Array

	 */
	
    
}
}
