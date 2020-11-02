package assignment.views;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InpEmployees extends EmpMenu {
	
	private NewLecturer lecturer;
	private NewSgGuard sguard;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InpEmployees frame = new InpEmployees();
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
	public InpEmployees() {
		
		lblAddLecIco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lecturer=new NewLecturer();
				lecturer.setVisible(true);
			}
		});
		
		lblSgIco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sguard=new NewSgGuard();
				sguard.setVisible(true);
			}
		});
	}

}
