package in.hashing;

public class Session_6B {
public static void main(String[] args) {
	
	
	int arr[] = {4,1,2,3,2,6}; //2
	int k=5;
	
	int sum=0;
	int count=0;
	for(int i=0;i<arr.length;i++) { //4 
		
		sum+=arr[i]; //1
		
		if(sum==k) {
			count++; //2
			sum=0;
		}
		
	}
	System.out.println(count);
	
}
}
