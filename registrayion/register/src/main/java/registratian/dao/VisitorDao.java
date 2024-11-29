package registratian.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import registratian.model.Visitor;

public class VisitorDao {
	 public int registerVisitor(Visitor visitor) throws ClassNotFoundException {
	        String INSERT_USERS_SQL = "INSERT INTO visitors" +
	            "  (first_name, last_name, email, password, phone_number, address, age) VALUES " +
	            " (?, ?, ?, ?, ?, ?, ?);";

	        int result = 0;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/registratian?useSSL=false", "springstudent", "springstudent");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	            preparedStatement.setString(1, visitor.getFirstName());
	            preparedStatement.setString(2, visitor.getLastName());
	            preparedStatement.setString(3, visitor.getEmail());
	            preparedStatement.setString(4, visitor.getPassword());
	            preparedStatement.setString(5, visitor.getPhoneNumber());
	            preparedStatement.setString(6, visitor.getAddress());
	            preparedStatement.setString(7, visitor.getAge());

	            System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            // process sql exception
	            printSQLException(e);
	        }
	        return result;
	    }

	    private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }

}
