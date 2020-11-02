package assignment.employees;

import java.sql.ResultSet;
import java.sql.SQLException;

import assignment.database.LecturerManager;

public class Lecturer extends Academic {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int totalCourses;
	
	public Lecturer() {
		super();
		this.totalCourses=0;
	}
	
	public Lecturer(String name,int id,int age,float basicSalary,float courseRate,int totalCourses) {
		super(name,id,age,basicSalary,courseRate);
		this.totalCourses=totalCourses;
	}
	
	public Lecturer(Lecturer lc) {
		super(lc);
		this.totalCourses=lc.totalCourses;
	}
	
	public String toString() {
		return "lc,"+super.toString()+","+this.totalCourses;
	}
	
	public boolean equals(Lecturer lc) {
		if(super.equals(lc) && this.totalCourses==lc.totalCourses)
				return true;
		return false;
	}
	
	public int getTotalCourses() {
		return totalCourses;
	}

	public void setTotalCourses(int totalCourses) {
		this.totalCourses = totalCourses;
	}
	
	

	@Override
	public float computeSalary() {
		return this.getBasicSalary()+this.getCourseRate()*this.totalCourses;
	}
	
	public boolean addLecturer() {
		
		return LecturerManager.createLecturer(this);
	}

	public static ResultSet retrive(int id) {
		try {
			return LecturerManager.getLecturer(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static ResultSet retrive(String name) {
		try {
			return LecturerManager.getLecturer(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static ResultSet retrive() throws SQLException {
		return LecturerManager.getLecturers();
	}
}
