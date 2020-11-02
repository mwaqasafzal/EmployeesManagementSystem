
package assignment.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import assignment.employees.SecurityGuard;;

public class SecurityGuardManager {

	public static boolean createSecurityGuard(SecurityGuard emp) {
		DBConnect.connect("employeesDB.accdb");
		String query1="INSERT INTO EMPLOYEE (EMP_ID,EMP_NAME,EMP_AGE,EMP_SALARY,EMP_TYPE) VALUES ("+emp.getId()+",\""+emp.getName()+"\","+emp.getAge()+","+emp.getBasicSalary()+","+"\"sg\""+")";
		String query2="INSERT INTO SECURITY_GUARD (SgEMP_ID,HOURLY_RATE,TOTAL_HRS) VALUES ("+emp.getId()+","+emp.getHourlyRate()+","+emp.getTotalHours()+")";
		return NewRecord.insertRecord(query1, query2);
	}
	
	public static ResultSet getSecurityGuard(int id) throws SQLException {
		
		DBConnect.connect("employeesDB.accdb");
		
		
			return DBConnect.getStatement().executeQuery("SELECT EMP_ID,EMP_NAME,EMP_AGE,EMP_SALARY,EMP_TYPE,HOURLY_RATE,TOTAL_HRS"
																+ " FROM EMPLOYEE,SECURITY_GUARD"
																+ " WHERE EMP_ID="+id+" and EMP_ID=SgEMP_ID");
		
	}

	public static ResultSet getSecurityGuard(String name)throws SQLException {
			
		DBConnect.connect("employeesDB.accdb");
		
		
			return DBConnect.getStatement().executeQuery("SELECT EMP_ID,EMP_NAME,EMP_AGE,EMP_SALARY,HOURLY_RATE,TOTAL_HRS"
																+ " FROM EMPLOYEE,SECURITY_GUARD"
																+ " WHERE EMP_NAME=\""+name+"\" and EMP_ID=SgEMP_ID");
	}

	public static ResultSet getSecurityGuards() throws SQLException {
		
		DBConnect.connect("employeesDB.accdb");
		
		
		return DBConnect.getStatement().executeQuery("SELECT EMP_ID,EMP_NAME,EMP_AGE,EMP_SALARY,HOURLY_RATE,TOTAL_HRS"
															+ " FROM EMPLOYEE,SECURITY_GUARD"
															+ " WHERE EMP_ID=SgEMP_ID");
	}
}
