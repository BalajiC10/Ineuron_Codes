package in.hashing;

public class Session_10B {
public static void main(String[] args) {
	
		/*
		 * Optimization code
		 */
	
		int arr[] = {6, -3, -5, 15,6};
		int n = arr.length;
		int t=0;
		int prv=0;
		
		for(int i=0;i<n;i++) { //6
			System.out.println(arr[i]);
			
			int current = Math.max(prv+arr[i], arr[i]); //6,
			
			current  = Math.max(current, 0);//
			
			prv =current; //6
			t = Math.max(t, current); //6
			
		}
		
		System.out.println("Max sub array: "+t);
				
}
}
