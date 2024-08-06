package in.ineuron.test;

import in.ineuron.entities.Department;
import in.ineuron.entities.Employe;

public class TestApp {

	public static void main(String[] args) {
		
		Employe emp1 = new Employe();
		emp1.setEid(100);
		emp1.setEname("Balaji");
		emp1.setEage(23);
		
		Employe emp2 = new Employe();
		emp2.setEid(200);
		emp2.setEname("Rohit");
		emp2.setEage(24);
		
		Employe emp3 = new Employe();
		emp3.setEid(300);
		emp3.setEname("Virat");
		emp3.setEage(30);
		
		Employe []employes = new Employe[3];
		employes[0]=emp1;
		employes[1]=emp2;
		employes[2]=emp3;
		
		
		
		Department dp = new Department();
		dp.setDeptId(450);
		dp.setDeptName("IT");
		dp.setDeptLoc("Pune");
		dp.setEmp(employes);
		
		
		dp.display();
		
	}
}
