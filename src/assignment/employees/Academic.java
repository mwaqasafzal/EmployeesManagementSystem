package assignment.employees;

public abstract class Academic extends Employee {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private float courseRate;
	
	public Academic() {
		super();
		this.courseRate=0;
	}
	
	public Academic(String name,int id,int age,float basicSalary,float courseRate) {
		super(name,id,age,basicSalary);
		this.courseRate=courseRate;
	
	}

	public Academic(Academic emp) {
		super(emp);
		this.courseRate=emp.courseRate;
	}
	
	public String toString() {
		return super.toString()+","+this.courseRate;
	}
	
	public boolean equals(Academic emp) {
		if(super.equals(emp) && this.courseRate==emp.courseRate)
				return true;
		return false;
	}
	
		//GETTERS && SETTERS
	public float getCourseRate() {
		return courseRate;
	}

	public void setCourseRate(float courseRate) {
		this.courseRate = courseRate;
	}
	
	
	
}

