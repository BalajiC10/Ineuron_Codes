package in.hashing;

public class Session_6A {
public static void main(String[] args) {
	
		/*
		 * Find count of number of subarrays with sum ==  k 
		 */
	
		int arr[] = {3,1,2,1,5}; //2
		int k=4;
		// k = arr[i] + t
		//pref = {3,4,6,7,12};
		 
		
		//sum = 3+1 =4 ,
		//c-1,
		
		
		int count=0;
		for(int i=0;i<arr.length;i++) {//3
			
			int sum=0;
			for(int j=i;j<arr.length;j++) {//3,1,2,1
				sum+=arr[j];//3+1=4,4+2=6,
				if(sum==k) {
				
					System.out.println(sum);
					count++;
				}
				
			}
		}
		
		System.out.println("Count is "+count);
		
}
}
