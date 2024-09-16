package in.hashing;

public class Session_7A {
public static void main(String[] args) {
	
		/*
		 * Find largest/smallest subarray with sum k in Given Array
		 */
		int arr[] = {1,2,3,1,2,1,1,1};
		
		int k=3;
		int max=0;
		int min= Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) { //1,2,3,4
		
			int sum=0;
			int length=0;
			for(int j=i;j<arr.length;j++) { //1,2,3,1,2 //2,3,1,2 //3,1,2 //1,2
				
				sum+=arr[j]; //1+2 //3 //1+2
				length++;
				if(sum==k) { 
					
					if(max<length) { //0<2
						
						max=length; //2,
					}
					
					if(min>=length) {
						min=length;
					}
					
					
				}
				
				
			}
			
			}
		System.out.println(max);
		System.out.println(min);
		
		
}
}
