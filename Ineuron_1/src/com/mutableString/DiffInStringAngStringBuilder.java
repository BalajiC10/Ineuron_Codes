package com.mutableString;

public class DiffInStringAngStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String Case 1");
		//Case -1 (String)
		String str = "Tendulkar"; //object 1
		str.concat("Sachin");     //declaring but not storing in other object so it will not add
		System.out.println(str); //it will print just object 1 
		
		System.out.println("String Case 2");
		//Case-2  (String with reference)
		String st = "Sachin"; //object 1 is created
		
		st=st.concat("Tendulkar"); //another object is created in heap area
		System.out.println(st);    //above code will initilize at runtime 
		
		System.out.println("StringBuffer case 3");
		StringBuffer sb =new StringBuffer("iNeuron");//it will create 1 object
		sb.append("Telusko");	//it will modify in 1st object itself as its mutable string
		
		System.out.println(sb);
		
		
		
				
	}

}
