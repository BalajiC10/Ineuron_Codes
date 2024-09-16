package in.hashing;

public class Session_1A {
public static void main(String[] args) {
	
		/*
		 * Check if there are any two Equal numbers in an array at a distance less than or equal to k
		 * Brute Force :- Just Use 2 For loops and check if distance between any 2 Equal elements is less than or equal to k, 
		 * print(yes), otherwise, we will print (no)
		 */
	
		int[] nums = {1, 1, 3, 1, 2, 3};
		int k = 2;
		
		for(int i=0;i<nums.length-1;i++) { 
			
			for(int j=i+1;j<nums.length;j++) {
				
				if(nums[i]==nums[j]) {
					
					if(i+j<=k)
					System.out.println(nums[i]+" "+nums[j]);
				}
			}
		}
}
}
