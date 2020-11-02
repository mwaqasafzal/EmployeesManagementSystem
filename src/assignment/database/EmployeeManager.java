package assignment.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import assignment.employees.*;

public class EmployeeManager {
	
	public static List<Employee> getEmployees() {
		List<Employee> emps=new ArrayList<>();
		
		DBConnect.connect("employeesDB.accdb");
		
		try {
			ResultSet rs=DBConnect.getStatement().executeQuery("SELECT EMP_ID,EMP_NAME,EMP_AGE,EMP_SALARY,EMP_TYPE "
																+ "FROM EMPLOYEE");
			
			while(rs.next()) {
				Employee emp;
				
				if(rs.getString("EMP_TYPE").compareToIgnoreCase("lec")==0) {
					ResultSet rsLec=DBConnect.getStatement().executeQuery("SELECT COURSE_RATE,NO_OF_COURSES "
																			+ "FROM LECTURER "
																			+ "WHERE LcEMP_ID="+rs.getInt(1));
					Lecturer lc=new Lecturer();
					while(rsLec.next()) {
						lc.setCourseRate(rsLec.getFloat(1));
						lc.setTotalCourses(rsLec.getInt(2));
					}
					emp=lc;
					
				}
					
				else {
					ResultSet rsSg=DBConnect.getStatement().executeQuery("SELECT HOURLY_RATE,TOTAL_HRS "
																		+ "FROM SECURITY_GUARD "
																		+ "WHERE SgEMP_ID="+rs.getInt(1));
					SecurityGuard sg=new SecurityGuard();
					while(rsSg.next()) {
						sg.setHourlyRate(rsSg.getFloat(1));
						sg.setTotalHours(rsSg.getInt(2));
					}
					emp=sg;
				}
					
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setAge(rs.getInt(3));
				emp.setBasicSalary(rs.getFloat(4));
				
				emps.add(emp);
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Err:Unable to Read Data from Database");
			e.printStackTrace();
		}
		
		return emps;
	}

}
