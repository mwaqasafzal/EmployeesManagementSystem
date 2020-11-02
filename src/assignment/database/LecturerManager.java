package assignment.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import assignment.employees.Lecturer;

public class LecturerManager {

	public static boolean createLecturer(Lecturer emp) {
		
		DBConnect.connect("employeesDB.accdb");
		String query1="INSERT INTO EMPLOYEE (EMP_ID,EMP_NAME,EMP_AGE,EMP_SALARY,EMP_TYPE) VALUES ("+emp.getId()+",\""+emp.getName()+"\","+emp.getAge()+","+emp.getBasicSalary()+","+"\"lec\""+");";
		String query2="INSERT INTO LECTURER (LcEMP_ID,COURSE_RATE,NO_OF_COURSES) VALUES ("+emp.getId()+","+emp.getCourseRate()+","+emp.getTotalCourses()+");";
	
		return NewRecord.insertRecord(query1, query2);

	}
	
	public static ResultSet getLecturer(int id) throws SQLException {
		
		DBConnect.connect("employeesDB.accdb");
		
		return DBConnect.getStatement().executeQuery("SELECT EMP_ID,EMP_NAME,EMP_AGE,EMP_SALARY,EMP_TYPE,COURSE_RATE,NO_OF_COURSES "
																+ "FROM EMPLOYEE,LECTURER "
																+ "WHERE EMP_ID="+id+" and EMP_ID=LcEMP_ID;");
		
		
	}

	public static ResultSet getLecturer(String name) throws SQLException {
		// TODO Auto-generated method stub
		
		DBConnect.connect("employeesDB.accdb");
		
		return DBConnect.getStatement().executeQuery("SELECT EMP_ID,EMP_NAME,EMP_AGE,EMP_SALARY,COURSE_RATE,NO_OF_COURSES "
																+ "FROM EMPLOYEE,LECTURER "
																+ "WHERE EMP_NAME=\""+name+"\"and EMP_ID=LcEMP_ID;");
	}
	
	public static ResultSet getLecturers() throws SQLException {
		// TODO Auto-generated method stub
				
		DBConnect.connect("employeesDB.accdb");
		
		return DBConnect.getStatement().executeQuery("SELECT EMP_ID,EMP_NAME,EMP_AGE,EMP_SALARY,COURSE_RATE,NO_OF_COURSES "
																+ "FROM EMPLOYEE,LECTURER "
																+ "WHERE EMP_ID=LcEMP_ID;");
	}
}
