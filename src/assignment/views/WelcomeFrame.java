package assignment.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeFrame extends JFrame{
	
		public WelcomeFrame(){
		
		this.setUndecorated(true);//remove the title bar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.getContentPane().setBackground(new Color(39,174,96));
		
		JLabel lbl=new JLabel("Welcome",JLabel.CENTER);
		Font f=new Font("TimesRoman",Font.BOLD,60);
		this.add(lbl);
		lbl.setForeground(new Color(255,255,255));
		lbl.setFont(f);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	
	}

}
