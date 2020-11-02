package assignment.views;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

import java.util.List;

import assignment.database.EmployeeManager;
import assignment.employees.Employee;
import assignment.employees.Lecturer;
import assignment.employees.SecurityGuard;

public class SalaryManipulator extends Base {

	private JLabel lblLecturer;
	private JLabel lblSecurityGuard;
	private JLabel lblLecSalary;
	private JLabel lblSgSalary;
	private JLabel lblTotal;
	private JLabel lblTotalSalary;
	
	private float lecSalary;
	private float sgSalary;
	private float totalSalary;

	

	/**
	 * Create the frame.
	 */
	public SalaryManipulator() {
		super();
		lblMainContext.setText("Salaries");
		calculateSalaries();
		
		lblLecturer = new JLabel("Lecturer");
		lblLecturer.setForeground(new Color(0, 102, 51));
		lblLecturer.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblLecturer.setBounds(210, 118, 80, 20);
		contentPane.add(lblLecturer);
		
		lblSecurityGuard = new JLabel("Security Guard");
		lblSecurityGuard.setForeground(new Color(0, 102, 51));
		lblSecurityGuard.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSecurityGuard.setBounds(210, 165, 105, 20);
		contentPane.add(lblSecurityGuard);
		
		lblLecSalary = new JLabel("Rs. "+String.valueOf(lecSalary));
		lblLecSalary.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(51, 102, 51)));
		lblLecSalary.setBounds(348, 118, 120, 20);
		contentPane.add(lblLecSalary);
		
		lblSgSalary = new JLabel("Rs. "+String.valueOf(sgSalary));
		lblSgSalary.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(51, 102, 51)));
		lblSgSalary.setBounds(348, 166, 120, 20);
		contentPane.add(lblSgSalary);
		
		lblTotal = new JLabel("Total");
		lblTotal.setForeground(new Color(0, 102, 51));
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTotal.setBounds(210, 209, 80, 20);
		contentPane.add(lblTotal);
		
		lblTotalSalary = new JLabel("Rs. "+String.valueOf(totalSalary));
		lblTotalSalary.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(51, 102, 51)));
		lblTotalSalary.setBounds(348, 209, 120, 20);
		contentPane.add(lblTotalSalary);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}
	
	void calculateSalaries() {
		lecSalary=sgSalary=totalSalary=0.0f;
		
		
		List<Employee> employees=EmployeeManager.getEmployees();
		
		if(employees.size()!=0) 
			for(Employee emp:employees) {
				totalSalary+=emp.computeSalary();
				if(emp instanceof Lecturer)
					lecSalary+=emp.computeSalary();
				else if(emp instanceof SecurityGuard)
					sgSalary+=emp.computeSalary();
		}
		
	}

}
