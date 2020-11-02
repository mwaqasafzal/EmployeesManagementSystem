package assignment.views;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;



import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import assignment.employees.SecurityGuard;

import javax.swing.border.EtchedBorder;

public class NewSgGuard extends EmployeeFrame {
	private JTextField textHrlyRate;
	private JTextField textTotalHrs;

	public NewSgGuard() {
		super();
		lblMainContext.setText("Security Guard Registeration");
		lblId.setText("S-Guard ID");
		textHrlyRate = new JTextField();
		textHrlyRate.setOpaque(false);
		textHrlyRate.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 128, 0)));
		textHrlyRate.setColumns(10);
		textHrlyRate.setBounds(217, 260, 312, 20);
		contentPane.add(textHrlyRate);
		
		textTotalHrs = new JTextField();
		textTotalHrs.setOpaque(false);
		textTotalHrs.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 128, 0)));
		textTotalHrs.setColumns(10);
		textTotalHrs.setBounds(217, 306, 312, 20);
		contentPane.add(textTotalHrs);
		
		JLabel lblCourseRate = new JLabel("Hourly Rate");
		lblCourseRate.setForeground(new Color(0, 102, 51));
		lblCourseRate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCourseRate.setBounds(217, 247, 71, 14);
		contentPane.add(lblCourseRate);
		
		JLabel lblNoOfCourses = new JLabel("Total Hours");
		lblNoOfCourses.setForeground(new Color(0, 102, 51));
		lblNoOfCourses.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNoOfCourses.setBounds(217, 291, 95, 14);
		contentPane.add(lblNoOfCourses);
		
		lblRegister = new JLabel("Register");
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SecurityGuard sg=new SecurityGuard(textName.getText(),Integer.parseInt(textId.getText()),
											Integer.parseInt(textAge.getText()),Float.parseFloat(textSalary.getText()),
				
											Float.parseFloat(textHrlyRate.getText()),Integer.parseInt(textTotalHrs.getText()));
				System.out.println("over here");
				Message msg;
				Thread msgThread;
				if(sg.addSecurityGuard()) {
					msg=new Message(true);
					msgThread=new Thread(new Runnable() {
						@Override
						public void run() {
							// TODO Auto-generated method stub
							msg.setVisible(true);
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							msg.setVisible(false);
							
						}
					});
					msgThread.start();
					
					dispose();
				}
				else {
					System.out.println("not found");
					msg=new Message(false);
					msgThread=new Thread(new Runnable() {
						@Override
						public void run() {
							// TODO Auto-generated method stub
							msg.setVisible(true);
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							msg.setVisible(false);
							
						}
					});
					msgThread.start();
					
				}
		
			}
		});
		
		lblRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegister.setForeground(new Color(51, 102, 51));
		lblRegister.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblRegister.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblRegister.setOpaque(true);
		lblRegister.setBackground(new Color(46,204,113));
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setBounds(388, 337, 125, 38);
		contentPane.add(lblRegister);
		
	}

}
