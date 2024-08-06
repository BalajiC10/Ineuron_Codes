package in.ineuron.entities;

//Target Class
public class Department {

	//Instance Variable
	private Integer deptNo;
	private String deptName;
	private String deptLoc;
	
	//Has-A variable
	private Employe[] emp;

	//Constructor Injection
	public Department(Integer deptNo, String deptName, String deptLoc, Employe[] emp) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		//Has-A variable injection through constructor
		this.emp = emp;
	}
	
	public void disp() {
		
		System.out.println("Department Details:");
		System.out.println("Depart Name: "+deptNo);
		System.out.println("Depart Num: "+deptName);
		System.out.println("Depart location: "+deptLoc);
		
		System.out.println("----------------------------------");
		System.out.println("Employee Details");
		
		for(Employe emps :emp) {
			System.out.println(emps.geteName());
			System.out.println(emps.geteId());
			System.out.println();
		}
		
	}
	
	
	
	
	
	
}
