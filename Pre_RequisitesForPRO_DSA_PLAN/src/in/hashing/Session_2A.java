package in.hashing;

public class Session_2A {
public static void main(String[] args) {
	
		/*
		 * Count all the (i,j) Pairs such that b[i] + b[j] == k (count of such pairs.) [i<j] 
		 */
		//Brute Force
		int[] arr = {1, 2, 3, 4, 5};
		int k = 6;
		int  count=0;
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==k) {
					
					System.out.println(arr[i]+","+arr[j]);
					count++;
				}
			}
		}
		System.out.println(count);
}
}
