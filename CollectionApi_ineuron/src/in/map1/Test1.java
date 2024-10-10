package in.map1;

public class Test1 {
	
	public static int size(int arr[]) {
		
		int cnt =0;
	
		for(int i: arr) {
			cnt++;
			
		}
		return cnt;
		
	}
public static void main(String[] args) {
		
	int arr[]= {1,2,3,4,5,6};
	System.out.println(arr.length);
	System.out.println(size(arr));
}
}
