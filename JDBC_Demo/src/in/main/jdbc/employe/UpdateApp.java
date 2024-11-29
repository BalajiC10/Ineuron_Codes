package in.main.jdbc.employe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateApp {
public static void main(String[] args) {
		
	Connection connection = null;	
	Statement statement = null;
	ResultSet rs = null;
	
	try {
		//Step1- Load and register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		
		//Step2- Establish the connection
		String url = "jdbc:mysql://localhost:3306/enterprisebatch";
		String user = "root";
		String pass = "root";
		
		connection = DriverManager.getConnection(url,user,pass);
		
		if(connection!=null) {

			//Step3- create the statement object
			 statement = connection.createStatement();
			 
			 String Query = "Update Employe set empName='Shane' where empId=1";
			 if(Query!=null) {
					//Step4- Prepare the SQL Query
					
					System.out.println("Executing the Query: "+Query);
					//Step5 - Executethe update Query
					int rowsAffected = statement.executeUpdate(Query);
					System.out.println("rows affected:: "+rowsAffected);
					
					//Step6 -Retrive data 
					String fetch = "select * from Employe";
					if(fetch!=null) {
						
						rs = statement.executeQuery(fetch);
						
						
						System.out.println("Data from table");
						
						while(rs.next()) {
							int empId = rs.getInt("empId");
				            String empName = rs.getString("empName");
				            String empDomain = rs.getString("empDomain");

				            System.out.println(empId + "\t" + empName + "\t" + empDomain);
						}
					}
					
			 }
			 
		}
	
		
	}
	catch(SQLException s) {
		s.printStackTrace();
	}
	catch(ClassNotFoundException c) {
		c.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	finally {
		
		try {
			if(rs!=null) {
				rs.close();
			}
			if(statement!=null) {
				statement.close();
			}
			if(connection!=null) {
				connection.close();
			}
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
		
	};
}
}
