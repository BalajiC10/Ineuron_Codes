package in.ineuron.entities;

public class Student {

	//Target Object
	private int sid;
	private String sname;
	private int sage;
	
	private Branch branch;
	

	
	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public int getSage() {
		return sage;
	}



	public void setSage(int sage) {
		this.sage = sage;
	}



	public Branch getBranch() {
		return branch;
	}



	public void setBranch(Branch branch) {
		this.branch = branch;
	}



public void display() {
		
		System.out.println("---------STUDENT DETAILS------------");
		System.out.println(getSid());
		System.out.println(getSname());
		System.out.println(getSage());
		
		System.out.println("---------BRANCH DETAILS-------------");
		System.out.println(branch.getBid());
		System.out.println(branch.getBname());
		
	}
	
	
}
