package in.ineuron.test;

import in.ineuron.entities.Department;
import in.ineuron.entities.Employe;

public class MainApp {

	public static void main(String[] args) {
		
		//Creating an dependant object to inject in target object.
		
		Employe emp1 = new Employe(100, "Sachin");
		Employe emp2 = new Employe(200, "Rohit");
		Employe emp3 = new Employe(390, "Virat");
		
		//Creating 	an array to perform One-Many association
		Employe employes[]= new Employe[3];
		employes[0]=emp1;
		employes[1]=emp2;
		employes[2]=emp3;
		
		Department d1 = new Department(789,"BCCI","Dubai",employes);
		d1.disp();
		
		
		
	}
}
