package in.hashing;

public class PascalsTriangle {
public static void main(String[] args) {
	
	int r=2;
	int ans=1;
	
	System.out.println(ans);
	for(int col=0;col<r;col++) {
		ans = ans*(r-col);
		ans= ans/(col+1);
		System.out.println(ans);
	}
}
}
