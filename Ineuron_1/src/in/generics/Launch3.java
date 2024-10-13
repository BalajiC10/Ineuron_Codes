package in.generics;

import java.util.ArrayList;
import java.util.List;

public class Launch3 {
	/*
	 * 
	 */
	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("balaji");
		//list.add(10);//will not accept so  providing TYPE SAFETY Here
		
		System.out.println(list);
		
		List list1 = new ArrayList(); //will not provide TYPE SAFETY
		list1.add(100);
		list1.add("String");
		
		System.out.println(list1);

	}

}
