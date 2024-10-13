package in.generics;

import java.util.ArrayList;
import java.util.Collections;

public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(30);
		al.add(40);
		
		
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add(20);
		al2.add(30);
		al2.add(40);
		
		al2.add(null); //throws class cast exception (need of generics here)
		Collections.sort(al2);
		System.out.println(al2);
		
		
		
	}

}
