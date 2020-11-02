package assignment.views;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public abstract class EmployeeFrame extends Base {

	protected JTextField textId;
	protected JTextField textName;
	protected JTextField textAge;
	protected JTextField textSalary;
	protected JLabel lblId;
	protected JLabel lblName;
	protected JLabel lblAge;
	protected JLabel lblBasicSalary;
	protected JLabel lblRegister;
	

	/**
	 * Create the frame.
	 */
	public EmployeeFrame() {
		super();
		
		textId = new JTextField();
		textId.setOpaque(false);
		textId.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 128, 0)));
		textId.setBounds(217, 71, 312, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textName = new JTextField();
		textName.setOpaque(false);
		textName.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 128, 0)));
		textName.setColumns(10);
		textName.setBounds(217, 122, 312, 20);
		contentPane.add(textName);
		
		textAge = new JTextField();
		textAge.setOpaque(false);
		textAge.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 128, 0)));
		textAge.setColumns(10);
		textAge.setBounds(217, 166, 312, 20);
		contentPane.add(textAge);
		
		textSalary = new JTextField();
		textSalary.setOpaque(false);
		textSalary.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 128, 0)));
		textSalary.setColumns(10);
		textSalary.setBounds(217, 216, 312, 20);
		contentPane.add(textSalary);
		
		lblId = new JLabel("");
		lblId.setForeground(new Color(0, 102, 51));
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblId.setBounds(217, 61, 71, 14);
		contentPane.add(lblId);
		
		lblName = new JLabel("Name");
		lblName.setForeground(new Color(0, 102, 51));
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblName.setBounds(217, 102, 48, 14);
		contentPane.add(lblName);
		
		lblAge = new JLabel("Age");
		lblAge.setForeground(new Color(0, 102, 51));
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAge.setBounds(217, 148, 48, 14);
		contentPane.add(lblAge);
		
		lblBasicSalary = new JLabel("Basic Salary");
		lblBasicSalary.setForeground(new Color(0, 102, 51));
		lblBasicSalary.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblBasicSalary.setBounds(217, 197, 71, 14);
		contentPane.add(lblBasicSalary);
		
	}

}
