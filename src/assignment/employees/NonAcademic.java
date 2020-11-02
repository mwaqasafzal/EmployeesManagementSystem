package assignment.employees;

public abstract class NonAcademic extends Employee {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float hourlyRate;
	
	public NonAcademic() {
		super();
		this.hourlyRate=0;
	}
	
	public NonAcademic(String name,int id,int age,float basicSalary,float hourlyRate) {
		super(name,id,age,basicSalary);
		this.hourlyRate=hourlyRate;
	}

	public NonAcademic(NonAcademic emp) {
		super(emp);
		this.hourlyRate=emp.hourlyRate;
	}
	
	
	public String toString() {
		return super.toString()+","+this.hourlyRate;
	}
	
	public boolean equals(NonAcademic emp) {
		if(super.equals(emp) && this.hourlyRate==emp.hourlyRate)
				return true;
		return false;
	}
	
	
	
	//GETTERS && SETTERS
	public float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	

}
