
package in.hashing;

public class Session_3A {
public static void main(String[] args) {
		/*
		 * Count All ((i,j) pairs such that b[i] - b[j] == k (count of such pairs.) [i<j] 
		 */
	
		int arr[] = {1,5,2,4,1};
		int k=3;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if((arr[i]-arr[j])==k) {
					System.out.println(arr[i]+"-"+arr[j]);
					count++;
				}
				
			}
		}
		System.out.println("count: "+count);
		
		
}
}
