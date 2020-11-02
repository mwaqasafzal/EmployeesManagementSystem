package assignment.views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

public class LecturerView extends JFrame {

	private JPanel contentPane;
	private JLabel lblMainSide;
	private JLabel lblClose;
	private JLabel lblNewLabel;
	private JLabel lblLecReg;
	private JTextField textId;
	private JTextField textName;
	private JTextField textAge;
	private JTextField textSalary;
	private JTextField textCrRate;
	private JTextField textTotalCrs;
	private JLabel lblRegister;
	private JLabel lblCancel;

	
	public LecturerView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 568, 386);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblClose = new JLabel(" X");
		lblClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblClose.setForeground(new Color(51, 102, 51));
		lblClose.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblClose.setBounds(10, 0, 31, 20);
		contentPane.add(lblClose);
		
		lblNewLabel = new JLabel("EMS");
		lblNewLabel.setForeground(new Color(51, 102, 51));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 35));
		lblNewLabel.setBounds(10, 148, 152, 65);
		contentPane.add(lblNewLabel);
		
		lblMainSide = new JLabel("");
		lblMainSide.setBackground(new Color(39,174,96));
		lblMainSide.setOpaque(true);
		lblMainSide.setBounds(0, 0, 183, 386);
		contentPane.add(lblMainSide);
		
		lblLecReg = new JLabel("Lecturer");
		lblLecReg.setForeground(new Color(51, 102, 51));
		lblLecReg.setOpaque(true);
		lblLecReg.setBackground(new Color(46,204,113));
		lblLecReg.setFont(new Font("Bell MT", Font.PLAIN, 30));
		lblLecReg.setHorizontalAlignment(SwingConstants.CENTER);
		lblLecReg.setHorizontalTextPosition(SwingConstants.LEADING);
		lblLecReg.setBounds(180, 0, 388, 58);
		contentPane.add(lblLecReg);
		
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
		
		textCrRate = new JTextField();
		textCrRate.setOpaque(false);
		textCrRate.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 128, 0)));
		textCrRate.setColumns(10);
		textCrRate.setBounds(217, 260, 312, 20);
		contentPane.add(textCrRate);
		
		textTotalCrs = new JTextField();
		textTotalCrs.setOpaque(false);
		textTotalCrs.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 128, 0)));
		textTotalCrs.setColumns(10);
		textTotalCrs.setBounds(217, 306, 312, 20);
		contentPane.add(textTotalCrs);
		
		JLabel lblId = new JLabel("Lecturer ID");
		lblId.setForeground(new Color(0, 102, 51));
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblId.setBounds(217, 61, 71, 14);
		contentPane.add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(0, 102, 51));
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblName.setBounds(217, 102, 48, 14);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setForeground(new Color(0, 102, 51));
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAge.setBounds(217, 148, 48, 14);
		contentPane.add(lblAge);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary");
		lblBasicSalary.setForeground(new Color(0, 102, 51));
		lblBasicSalary.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblBasicSalary.setBounds(217, 197, 71, 14);
		contentPane.add(lblBasicSalary);
		
		JLabel lblCourseRate = new JLabel("Course Rate");
		lblCourseRate.setForeground(new Color(0, 102, 51));
		lblCourseRate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCourseRate.setBounds(217, 247, 71, 14);
		contentPane.add(lblCourseRate);
		
		JLabel lblNoOfCourses = new JLabel("No Of Courses");
		lblNoOfCourses.setForeground(new Color(0, 102, 51));
		lblNoOfCourses.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNoOfCourses.setBounds(217, 291, 95, 14);
		contentPane.add(lblNoOfCourses);
		
		lblRegister = new JLabel("Update");
		lblRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegister.setForeground(new Color(51, 102, 51));
		lblRegister.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblRegister.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblRegister.setOpaque(true);
		lblRegister.setBackground(new Color(46,204,113));
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setBounds(296, 345, 105, 30);
		contentPane.add(lblRegister);
		
		lblCancel = new JLabel("Remove");
		lblCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCancel.setForeground(new Color(51, 102, 51));
		lblCancel.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblCancel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblCancel.setOpaque(true);
		lblCancel.setBackground(new Color(46,204,113));
		lblCancel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCancel.setBounds(427, 345, 105, 30);
		contentPane.add(lblCancel);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}

}
