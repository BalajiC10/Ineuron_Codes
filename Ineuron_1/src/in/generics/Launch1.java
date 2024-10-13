package in.generics;

import java.util.ArrayList;

public class Launch1 {
public static void main(String[] args) {
	/*
	 *Generics Deff: To ensure Type Safety - We ensure that only string data type will be taken as input ..if we try to give any other data type
	 * 				 it will throw exception of incompatible type data
	 * 
	 */
		
	String str[] = new String[10];
	//In this case Type safety is there as we cant give any data type input except string
	
	ArrayList al = new ArrayList();
	al.add("Balaji");
	al.add("Ram");
	
	//In this it is not type safety
	String f = (String) al.get(0); ///here it will give checked exception so we need to type cast it
	System.out.println(f);
	
	
	//To overcome above issue java introduces the generics to promote 
	//By default they are not type safety at runtime
	ArrayList<String> al2 = new ArrayList();
	al2.add("Balaji");
	al2.add("Ram");
//	al2.add(100); //cannot add any other data type value
	
	String f1 = al2.get(1); //Type casting not required as it s Typesafety
	System.out.println(f1);
}
}
