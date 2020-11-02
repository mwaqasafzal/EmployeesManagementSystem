package assignment.views;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SearchEmployees extends EmpMenu {

		EmployeesFrame empFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchEmployees frame = new SearchEmployees();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchEmployees() {
		
		lblAddLecIco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				empFrame=new EmployeesFrame("Lecturers");
				empFrame.setVisible(true);
			}
		});
		
		lblSgIco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				empFrame=new EmployeesFrame("Security Guards");
				empFrame.setVisible(true);
			}
		});
	}

}
