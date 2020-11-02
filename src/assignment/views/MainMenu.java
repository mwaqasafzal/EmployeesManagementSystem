package assignment.views;



import java.awt.Cursor;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import javax.swing.JLabel;

public class MainMenu extends Base {

	
	private JLabel lblAddEmpIco;
	private JLabel lblNewLabel_1;
	private JLabel lblSearchEmpIco;
	private JLabel lblSearchId;
	private JLabel lblAllEmpIco;
	private JLabel lblSearchEmp;
	private JLabel lblEvaluateIco;
	private JLabel lblEvaluate;
	private EmpMenu empMenu;//frame
	private SearchEmployee searchEmp;//frame
	private SalaryManipulator salManip;//frame
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		super();
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
		lblMainContext.setText("Main Menu");
		lblAddEmpIco = new JLabel("");
		lblAddEmpIco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				empMenu=new InpEmployees();
				empMenu.setVisible(true);
			}
		});
		lblAddEmpIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAddEmpIco.setBounds(255, 92, 66, 65);
		lblAddEmpIco.setIcon(new ImageIcon("C:\\Users\\mwaqa\\eclipse-workspace\\Assignment1\\images\\register.png"));
		contentPane.add(lblAddEmpIco);
		
		lblNewLabel_1 = new JLabel("New Employee");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(255, 163, 92, 25);
		contentPane.add(lblNewLabel_1);
		
		lblSearchEmpIco = new JLabel("");
		lblSearchEmpIco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				searchEmp=new SearchEmployee();
				searchEmp.setVisible(true);
			}
		});
		lblSearchEmpIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSearchEmpIco.setBounds(406, 92, 64, 71);
		lblSearchEmpIco.setIcon(new ImageIcon("C:\\Users\\mwaqa\\eclipse-workspace\\Assignment1\\images\\search.png"));
		contentPane.add(lblSearchEmpIco);
		
		lblSearchId = new JLabel("Search Employee");
		lblSearchId.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSearchId.setBounds(406, 163, 99, 25);
		contentPane.add(lblSearchId);
		
		lblAllEmpIco = new JLabel("");
		lblAllEmpIco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				empMenu=new SearchEmployees();
				empMenu.setVisible(true);
			}
		});
		lblAllEmpIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAllEmpIco.setBounds(255, 230, 66, 75);
		lblAllEmpIco.setIcon(new ImageIcon("C:\\Users\\mwaqa\\eclipse-workspace\\Assignment1\\images\\employees.png"));
		contentPane.add(lblAllEmpIco);
		
		lblSearchEmp = new JLabel("All Employees");
		lblSearchEmp.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSearchEmp.setBounds(255, 305, 82, 25);
		contentPane.add(lblSearchEmp);
		
		lblEvaluateIco = new JLabel("");
		lblEvaluateIco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				salManip=new SalaryManipulator();
				salManip.setVisible(true);
				
			}
		});
		lblEvaluateIco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEvaluateIco.setBounds(406, 230, 82, 75);
		lblEvaluateIco.setIcon(new ImageIcon("C:\\Users\\mwaqa\\eclipse-workspace\\Assignment1\\images\\evaluation.png"));
		contentPane.add(lblEvaluateIco);
		
		lblEvaluate = new JLabel("Evaluate Salaries");
		lblEvaluate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEvaluate.setBounds(406, 307, 89, 20);
		contentPane.add(lblEvaluate);
		
		
	}
}
