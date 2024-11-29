package in.ComparableVsComparator.nitin;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
public static void main(String[] args) {
	
		
	
		ArrayList<String> names = new ArrayList();
		
		List<Integer> list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		Integer arr[] = list.stream().toArray(Integer[] :: new);
		
		for(Integer i:arr) {
			System.out.println(i);
		}
		
		
		
}
}
