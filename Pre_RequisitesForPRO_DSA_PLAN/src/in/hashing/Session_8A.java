package in.hashing;

public class Session_8A {
public static void main(String[] args) {
		
	/*
	 * Find count of shortest/largest subarrays with sum k in given array
	 */
	
		int arr[] = {3,2,3,3,2,8};
		
		int k=8;
		int count=0;
		int maxlength=0;
		
		for(int i=0;i<arr.length;i++) { //3,2,3,3,2,8
			int mlength=0;
			int sum=0;
			for(int j=i;j<arr.length;j++) { //3,2,3,3,8 //2,3,3,2,8 //3,3,2,8 //3,2,8 //2,8, //8
				sum+=arr[j]; //3+2+3+3 //2+3+3 //3+3+2 //8
				mlength++;
				if(sum==k) { //8,8,8,8
					count++; //4
					if(count>0) { 
						        
						
						if(maxlength<=mlength) { 
							maxlength=mlength; //3,3
						}
					}
				
				}
			}
		}
		
		System.out.println(count);
		System.out.println(maxlength);
		
		
}
}
