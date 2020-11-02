package assignment.employees;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import assignment.database.LecturerManager;
import assignment.database.SecurityGuardManager;


public abstract class Employee implements Serializable,Comparable<Employee> {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int age;
	private float basicSalary;
	
	//default constructor
	public Employee() {
		
		this.id=this.age=0;
		this.basicSalary=0;
		this.name="";
	}
	
	//parameterized constructor
	public Employee(String name,int id,int age,float basicSalary) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.basicSalary=basicSalary;
	}
	
	//copy constructor
	public Employee(Employee emp) {
		this.id=emp.id;
		this.name=emp.name;
		this.age=emp.age;
		this.basicSalary=emp.basicSalary;
	}
	
	
	
	public abstract float computeSalary();
	
	public String toString() {
		return this.id+","+this.name+","+this.age+","+this.basicSalary;
	}
	
	public boolean equals(Employee emp) {
		if(this.id==emp.id && this.age==emp.age && this.basicSalary==emp.basicSalary)
			if(this.name.compareToIgnoreCase(emp.name)==0)
				return true;
		return false;
	}
	
	
	//GETTERS & SETTERS 
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public int compareTo(Employee emp) {
		return this.id-emp.getId();
	}
	
	public static ResultSet retrive(int id) throws SQLException {
		ResultSet rs=null;
		
		rs=LecturerManager.getLecturer(id);
	
		if(!rs.next())//if not record found
			return SecurityGuardManager.getSecurityGuard(id);
	
		//as there is content in rs..moving it to first row
		//rs.first();//feature not supported
		return LecturerManager.getLecturer(id);
		
	}
	
	public static ResultSet retrive (String name) throws SQLException {
		ResultSet rs=null;
		
		rs=LecturerManager.getLecturer(name);
		if(!rs.next())//if not record found
			return SecurityGuardManager.getSecurityGuard(name);
		//as there is content in rs..moving it to first row
		//rs.first();//feature not supported
		
		return LecturerManager.getLecturer(name);
	}
}
