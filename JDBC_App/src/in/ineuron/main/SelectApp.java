package in.ineuron.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {
public static void main(String[] args) {
		
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
		try {
			//Load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class driver registed and loaded");
			//Establish the connection
			String url = "jdbc:mysql://localhost:3306/enterprisebatch";
			String user = "root";
			String pass = "root";
			
			connection = DriverManager.getConnection(url,user,pass);
			System.out.println("Connection established");
			
			//create the statement
			statement = connection.createStatement();
			
			String fetchQuery = "Select * from Employe";

			resultSet =  statement.executeQuery(fetchQuery);
			
			System.out.println("query executed ");
			
			System.out.println("Data executed from table");
			while(resultSet.next()) {
				int id = resultSet.getInt(0);
				String name = resultSet.getString(1);
				String domain = resultSet.getString(2);
				
				System.out.println("id: "+id + "name is: "+name+" works in "+domain);
			}
			
		}
				
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
				
			
			try {
				if(resultSet!=null) {
					resultSet.close();
				}
				if(statement!=null) {
					statement.close();
				}
				if(connection!=null) {
					connection.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			}
		
		
		
}
}
