package in.hashing;

public class Session_11A {
public static void main(String[] args) {
		
	int nums[] = {2,5,5,11}; 
	int target = 10;
			//Output: [0,1]
	
	/*
	 * Given an array of integers nums and an integer target, 
	 * return indices of the two numbers such that they add up to target.
	 */
	
	for(int i=0;i<nums.length;i++) {
		
		for(int j=1;j<nums.length;j++) {
			
			if(nums[i]+nums[j]==target) {
				
				System.out.println(i+"-->"+j);
			}
		}
	}
}
}
