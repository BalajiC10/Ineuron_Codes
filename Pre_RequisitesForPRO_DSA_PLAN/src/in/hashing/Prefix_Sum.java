package in.hashing;

public class Prefix_Sum {

	public static void main(String[] args) {
		
		int arr[] = {5,8,10,2,5,5};
		int n=arr.length-1; //adjust for 1 based index ->5
		
		/*
		 * For any integer “y” you can output p[y] in O(1) because all p have been pre-calculated from 1 to N.
		 */
		//System.out.println(n);
		int prefix[] = new int[arr.length+1]; //6
		prefix[0]=arr[0];
		for(int i=1;i<=n;i++) {
			
			prefix[i] = prefix[i-1]+arr[i];
		}
		
		for(int k:prefix) {
			System.out.println(k);
		}
		
		System.out.println(prefix[3-1]);
	}
}
