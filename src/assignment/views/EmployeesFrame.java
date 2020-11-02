package assignment.views;


import java.sql.ResultSet;
import java.sql.SQLException;

import assignment.employees.Lecturer;
import assignment.employees.SecurityGuard;
import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JScrollPane;

public class EmployeesFrame extends Base {
	private JTable table;

	
	public EmployeesFrame(String type) {
		lblMainContext.setText(type);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(135, 56, 665, 444);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		ResultSet rs=null;
		if(type=="Lecturers") {
			try {
				rs=Lecturer.retrive();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				rs=SecurityGuard.retrive();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		table.setModel(DbUtils.resultSetToTableModel(rs));
	}
}
