package assignment.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	
	  private static Connection con;
	  private static Statement stm;
	  
	  public static void connect(String path) {
		
		  try {
			  Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			  con=DriverManager.getConnection("jdbc:ucanaccess://"+path);
			  stm=con.createStatement();
		  }
		  catch(ClassNotFoundException e) {
			  System.err.println("NO Driver Found");
			  e.printStackTrace();
		  }
		  catch(SQLException e) {
			  System.err.println("Unable to Connect to Database");
			  e.printStackTrace();
			  
		  }
		 
	  }
	  
	  public static Statement getStatement() {
		  return stm;
	  }
	  
	  public static void disconnect() {
		  try {
			con.close();
			stm.close();
		} catch (SQLException e) {
			System.err.println("Error:");
			e.printStackTrace();
		}
		  
	  }
	  
}
