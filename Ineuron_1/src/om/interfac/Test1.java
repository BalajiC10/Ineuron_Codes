package om.interfac;

interface Left{
	
	default void m1() {
		System.out.println("Left");
	};
}
interface Right{
	
	default void m1() {
		System.out.println("Right");
	};
}
public class Test1 implements Left, Right{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
		Right.super.m1();
		System.out.println("Test1");
	}
	
	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.m1();
	}
}
