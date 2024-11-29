package in.main.jdbc.employe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteApp {
public static void main(String[] args) {
	
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			//Load and register the Drier
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded driver successfully");
			
			//Establish Connection
			String url = "jdbc:mysql://localhost:3306/enterprisebatch";
			String user = "root";
			String pass = "root";
			
			connection = DriverManager.getConnection(url,user,pass);
			
			if(connection!=null) {
				
				System.out.println("Connection Successfully");
				
				//create statement object
				statement = connection.createStatement();
				
				if(statement!=null) {
					
					//Prepare SQLQuery
					String sqlQuery = "Delete from Employe where empId=4";
					
					
					System.out.println("Executing the Query: "+sqlQuery);
					
					//Executing update the Query
					int rowsAff = statement.executeUpdate(sqlQuery);
					System.out.println("rowsAffected::"+rowsAff);
					
					String fetchQuery = "select * from Employe";
					if(fetchQuery!=null) {
						resultSet = statement.executeQuery(fetchQuery);
						//Retrive data
						
						System.out.println("Data from table...");
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
			
			catch(SQLException s) {
				s.printStackTrace();
			}
			catch(ClassNotFoundException c) {
				c.printStackTrace();
			}
			catch(Exception o) {
				o.printStackTrace();
			}
			
			
			finally {
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
				catch(SQLException e){
					e.printStackTrace();
				}
				
			}
			
}
}
