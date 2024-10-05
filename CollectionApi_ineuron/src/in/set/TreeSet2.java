package in.set;

import java.util.TreeSet;

public class TreeSet2 {
public static void main(String[] args) {
	
	/* implements set indirectly and directly implements sorted set
	 * order of insertion not maintaned
	 * sorted during insetion order
	 * null value not allowed
	 * duplicate not allowed
	 * follows in order traverse (BalancedBinarySearchTree)
	 */
	
	TreeSet t1 = new TreeSet();
	
	t1.add(20);
	t1.add(50);
	t1.add(35);
	t1.add(40);
	t1.add(30);
	t1.add(10);
	
	System.out.println(t1);
	
	System.out.println(t1.higher(20));//even if 20 is present it will give above value than that
	System.out.println(t1.ceiling(21)); //if 20 is there it will print that value/ if not it will give above value
	
	System.out.println(t1.floor(30));//if 30 is there it will print / if not it will print lower of that
	System.out.println(t1.lower(40));//even if element is present it will print lower value of that
}
}
