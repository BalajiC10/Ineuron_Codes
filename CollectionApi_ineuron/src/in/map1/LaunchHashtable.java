package in.map1;

import java.util.Hashtable;

public class LaunchHashtable {
public static void main(String[] args) {
	
			Hashtable ht = new Hashtable<>();
			
			ht.put(10, "balaji");
			ht.put(20, "rohit");
			
			ht.put(30, null);//Nullpointer
			ht.put(null , "hdio"); //Nullpointer
			
			System.out.println(ht);
}
}
