package in.binary_search;

public class Session_1 {
public static void main(String[] args) {
				//   0 1 2 3 4 5 6	
		int arr[] = {1,2,3,4,5,6,7};
				//  s        se 
		
		int target =7;
		
		int start=0;
		int end =arr.length-1;
		
		while(start<=end) {
			
			int mid = (start+end)/2; //3
			
			if(arr[mid]==target) {
				System.out.println("index "+mid);
				break;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			
			
			
		}
		
				
		
}
}
