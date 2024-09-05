package in.hashing;

public class Session_5A {
public static void main(String[] args) {
	
		/*
		 *  Find Sum of Range  [l……….r] where(l<=r) using Prefix sum. 
		 */
	
		int arr[] = {3,4,1,2,1,4};
		int l=2,r=5;
		
		int sum=0;
		
		for(int i=l;i<=r;i++) {
			
			sum+=arr[i];
		}
		System.out.println(sum);
}
}
