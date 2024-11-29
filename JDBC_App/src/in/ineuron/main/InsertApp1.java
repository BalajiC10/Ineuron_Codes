package in.ineuron.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertApp1 {
public static void main(String[] args) {
	
	System.out.println("1.Load and register the Driver");

    Connection connection = null;
    Statement statement = null;

    try {
        // Step 1: Load the MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver"); // Corrected driver class name
        System.out.println("Driver loaded successfully");

        // Step 2: Establish the Connection
        String url = "jdbc:mysql://localhost:3306/enterprisebatch"; // Ensure database exists
        String user = "root";
        String password = "root";

        connection = DriverManager.getConnection(url, user, password);
        System.out.println("Connection established successfully");

        // Step 3: Create a Statement object
        statement = connection.createStatement();

        // Step 4: Prepare the SQL Query
        String sqlQuery = "INSERT INTO Employe (empId, empName, empDomain) VALUES (2, 'Rohit', 'Research')";

        System.out.println("Executing query: " + sqlQuery);

        // Execute the update query
        int rowsAffected = statement.executeUpdate(sqlQuery);
        System.out.println("Rows affected: " + rowsAffected);

        // Step 5: Retrieve data (if necessary)
        String fetchQuery = "SELECT * FROM Employe";
        ResultSet resultSet = statement.executeQuery(fetchQuery);

        System.out.println("Data from Employe table:");
        while (resultSet.next()) {
            int empId = resultSet.getInt("empId");
            String empName = resultSet.getString("empName");
            String empDomain = resultSet.getString("empDomain");

            System.out.println(empId + "\t" + empName + "\t" + empDomain);
        }

        // Close the ResultSet
        resultSet.close();

    } catch (ClassNotFoundException e) {
        System.out.println("Driver not found!");
        e.printStackTrace();
    } catch (SQLException e) {
        System.out.println("SQL Exception occurred!");
        e.printStackTrace();
    } finally {
        // Step 6: Close the Connection
        try {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
            System.out.println("Connection closed successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
}
}
