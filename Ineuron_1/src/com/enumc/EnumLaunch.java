package com.enumc;

enum Results{
	PASS, FAIL, NR;
	
	int marks;
	
	Results(){
		System.out.println("Constructor in enum class");
	}
	
	void setMarks(int marks) {
		this.marks=marks;
	}
	
	int getMarks() {
		return marks;
	}
}

public class EnumLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Results.PASS.setMarks(10);
		
		int marks = Results.PASS.getMarks();
		
		System.out.println(marks);
	}

}
