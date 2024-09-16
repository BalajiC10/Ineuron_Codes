package in.hashing;

public class Session_5A {
public static void main(String[] args) {
	
		/*
		 *  Find Sum of Range  [l……….r] where(l<=r) using Prefix sum. 
		 */
	
		int arr[] = {3,4,1,2,1,4};
		//               l   r   
		//prefix ={3,7,8,10,11,15};
		      //   0 1 2 3   4  5 
		//7-1
		//p[r] - p[l-1] =8
		int l=2,r=5;
		
		int sum=0;
		
		for(int i=l;i<=r;i++) {
			
			sum+=arr[i];
		}
		System.out.println(sum);
}
}
