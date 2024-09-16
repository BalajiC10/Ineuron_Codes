package in.hashing;

public class Session_4A {
public static void main(String[] args) {
	
	/*
	 * Count all i,j pairs where i<j and abs(b[i]-b[j]) = k [k>=0] 
	 */

	int arr[] = {1,5,3,4,2};
	int k=2;
	int count=0;
	
	for(int i=0;i<arr.length;i++) {
		
		for(int j=i+1;j<arr.length;j++) {
			
			if((Math.abs(arr[i]-arr[j]))==k) {
				System.out.println(arr[i]+"-"+arr[j]);
				count++;
			}
			
		}
	}
	System.out.println("count: "+count);
}
}
