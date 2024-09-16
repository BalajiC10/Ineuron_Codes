package in.hashing;

public class Session_10A {
public static void main(String[] args) {
	
		
		/*
		 * P1[i] = maximum sum of subarray ending at index “i”
		   Can be calculated in O(N^2) using brute force. 

		 */
	
		int arr[] = {1,-2,1,2,3,4};  //P[4] --> 1,2,1,2 Find max sub array in this 
				//    
		
		//Brute Force: Start from j to i (Reverse and find the max sub array)
		
		int maxsub=0;
		int index=3;
		for(int i=0;i<arr.length;i++) {
			
			int sum=0;
			int t=0;
			for(int j=index;j>=0;j--) { //2,1,-2
				
				sum+=arr[j]; //3-2 =1
				
				t = Math.max(sum,t); //3 
			}
			maxsub = t; //
			 
		}
		
		System.out.println(maxsub);
		
		
			
			
}
}
