package com.abstract_;

class Ts{
	
	final int num=10;
}

class St extends Ts{
	
	
}
public class Test5 {
public static void main(String[] args) {
	St o = new St();
	System.out.println(o.num);
}
}
