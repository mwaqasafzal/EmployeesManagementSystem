package assignment.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class Message extends JFrame {

	private String message;
	private Color foreColor;
	private Color backColor;
	
	/**
	 * Create the frame.
	 */
	public Message(boolean success) {
		
		if(success) {
			message="Operation Successful!";
			foreColor=new Color(0, 102, 51);
			backColor=new Color(39,174,96);
		}
		else {
			message="Operation Failed!";
			foreColor=new Color(0, 0, 0);
			backColor=new Color(200,0,0);
		}
			
		this.setUndecorated(true);//remove the title bar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(308, 61);
		this.getContentPane().setBackground(backColor);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(message);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(foreColor);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(39, 21, 236, 29);
		getContentPane().add(lblNewLabel);
		Font f=new Font("TimesRoman",Font.BOLD,60);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}

}
