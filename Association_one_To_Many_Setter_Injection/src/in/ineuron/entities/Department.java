package in.ineuron.entities;

public class Department {

	//Target object
	private int deptId;
	private String deptName;
	private String deptLoc;
	
	//HAS-A relationship
	private Employe employe[];

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLoc() {
		return deptLoc;
	}

	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	public Employe[] getEmp() {
		return employe;
	}

	public void setEmp(Employe[] emp) {
		this.employe = emp;
	}
	
	public void display() {
		System.out.println("------------------DEPARTMENT DETAILS-------------------");
		System.out.println(getDeptId());
		System.out.println(getDeptName());
		System.out.println(getDeptLoc());
		System.out.println("------------------EMPLOYEE DETAILS-------------------");
		for(Employe employes:employe) {
			System.out.println(employes.getEid());
			System.out.println(employes.getEname());
			System.out.println(employes.getEage());
		}
		System.out.println();
	}
	
	
	
}
