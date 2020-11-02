package assignment.employees;

import java.sql.ResultSet;
import java.sql.SQLException;

import assignment.database.LecturerManager;
import assignment.database.SecurityGuardManager;

public class SecurityGuard extends NonAcademic {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int totalHours;
	
	public SecurityGuard() {
		super();
		this.totalHours=0;
	}
	
	public SecurityGuard(String name,int id,int age,float basicSalary,float hourlyRate,int totalHours) {
		super(name,id,age,basicSalary,hourlyRate);
		this.totalHours=totalHours;
	}
	
	
	public SecurityGuard(SecurityGuard sg) {
		super(sg);
		this.totalHours=sg.totalHours;
	}
	
	public String toString() {
		return "sg,"+super.toString()+","+this.totalHours;
	}
	
	public boolean equals(SecurityGuard sg) {
		if(super.equals(sg) && this.totalHours==sg.totalHours)
				return true;
		return false;
	}
	
	public int getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}

	
	@Override
	public float computeSalary() {
		return this.getBasicSalary()+this.getHourlyRate()*this.totalHours;		
	}

	public boolean addSecurityGuard() {
		
		return SecurityGuardManager.createSecurityGuard(this);
	}

	public static ResultSet retrive(int id) {
		try {
			return SecurityGuardManager.getSecurityGuard(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static ResultSet retrive(String name) {
		try {
			return SecurityGuardManager.getSecurityGuard(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static ResultSet retrive() throws SQLException {
		// TODO Auto-generated method stub
		return SecurityGuardManager.getSecurityGuards();
		
	}
}
