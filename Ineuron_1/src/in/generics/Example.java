package in.generics;

public class Example {

		public static void main(String[] args) {
			
			Box<Integer> box = new Box<Integer>(100);
			
			System.out.println(box.getValue());
			
			System.out.println(box.container.getClass().getName()); //Type of data will print
			
			
			Box<String> box1 = new Box<String>("Balaji");
			
			System.err.println(box1.getValue());
			
			System.out.println(box1.container.getClass().getName());
			
			
			Box<Double> box2 = new Box(12.3);
			
			System.out.println(box2.getValue());
			
			System.out.println(box2.container.getClass().getName());
			
			
			box1.task();
			box2.task();
			box.task();
		}
}
