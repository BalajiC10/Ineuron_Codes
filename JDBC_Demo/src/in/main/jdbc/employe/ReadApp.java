package in.main.jdbc.employe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadApp {
public static void main(String[] args) {
	
		
	Connection connection = null;
	Statement statement   = null;
	ResultSet resultSet   = null;
	
	
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Registered and loaded success");
		
		String url = "jdbc:mysql://localhost:3306/enterprisebatch";
		String user = "root";
		String pass = "root";
		
		connection = DriverManager.getConnection(url,user,pass);
		
		if(connection!=null) {
			
			statement = connection.createStatement();
			
			if(statement!=null) {
				
				String sqlQuery = "Select * from Employe";
				resultSet = statement.executeQuery(sqlQuery);
				
				if(resultSet!=null) {
					System.out.println("Fetching data");
					
					while(resultSet.next()) {
						
						int empId = resultSet.getInt("empId");
						String empName = resultSet.getString("empName");
						String empDomain = resultSet.getString("empDomain");
						
						System.out.println(empId + "\t" + empName + "\t" + empDomain);
					}
				}
				
			}
			
		}
			
		
		
		
		
	}
	catch(ClassNotFoundException c) {
		c.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("Closing resources");
		
		try {
			if(resultSet!=null) {
				resultSet.close();
			}
			if(connection!=null) {
				connection.close();
			}
			
			if(statement!=null) {
				statement.close();
			}
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
		
	}
}
}
