package om.interfac;

import java.util.Scanner;

interface Calculator {

	void add();
	
	void sub();
}

class Employe1 implements Calculator{

	int a,b,c;
	
	@Override
	public void add() {
		
		a=10;
		b=20;
		c=a+b;
		System.out.println("Addition is "+c);
	}

	@Override
	public void sub() {
		
		a=30;
		b=20;
		c=a-b;
		System.out.println("Substraction is "+c);
	}
	
	
}
class Employe2 implements Calculator{

	int m,n,o;
	
	@Override
	public void add() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input1 for addition");
		m=scan.nextInt();
		System.out.println("Please input2 for addition");
		n=scan.nextInt();
		o=m+n;
		
		System.out.println("Total Addition is "+o);
		
		
	}

	@Override
	public void sub() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input1 for sub");
		m=scan.nextInt();
		System.out.println("Please input2 for sub");
		n=scan.nextInt();
		
		o=m-n;
		System.out.println("Substraction is "+o);
		
		
	}
	
	
}
class Cal{
	
	public void permit(Calculator c) {
		c.add();
		c.sub();
	}
}
public class Launch1 {

	public static void main(String[] args) {
		Employe1 c1 = new Employe1();
		Employe2 c2 = new Employe2();
		
		Cal c = new Cal();
		c.permit(c1);
		c.permit(c2);
		
	}
}
