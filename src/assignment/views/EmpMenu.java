package assignment.views;


import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EmpMenu extends Base {

	
	protected JLabel lblAddLecIco;
	protected JLabel lblLecturer;
	protected JLabel lblSgIco;
	protected JLabel lblSecurityGuard;
	


	/**
	 * Create the frame.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpMenu frame = new EmpMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public EmpMenu() {
	
		lblMainContext.setText("Employees");
		
		lblAddLecIco = new JLabel("");
		
		lblAddLecIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAddLecIco.setBounds(300, 98, 66, 65);
		lblAddLecIco.setIcon(new ImageIcon("C:\\Users\\mwaqa\\eclipse-workspace\\Assignment1\\images\\educator.png"));
		contentPane.add(lblAddLecIco);
		
		lblLecturer = new JLabel("Lecturer");
		lblLecturer.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblLecturer.setBounds(305, 174, 92, 25);
		contentPane.add(lblLecturer);
		
		lblSgIco = new JLabel("");
		
		lblSgIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSgIco.setBounds(300, 221, 82, 75);
		lblSgIco.setIcon(new ImageIcon("C:\\Users\\mwaqa\\eclipse-workspace\\Assignment1\\images\\security-guard.png"));
		contentPane.add(lblSgIco);
		
		lblSecurityGuard = new JLabel("Security Guard");
		lblSecurityGuard.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSecurityGuard.setBounds(305, 307, 89, 20);
		contentPane.add(lblSecurityGuard);
		
	}

}
