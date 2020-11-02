package assignment.views;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Base extends JFrame {

	protected JPanel contentPane;
	protected JLabel lblMainSide;
	protected JLabel lblClose;
	
	protected JLabel lblNewLabel;
	protected JLabel lblMainContext;
	private JLabel lblMini;
	private JLabel lblEMS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Base frame = new Base();
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
	public Base() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
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
		lblClose.setForeground(Color.WHITE);
		lblClose.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblClose.setBounds(10, 0, 31, 20);
		contentPane.add(lblClose);
		
		lblMini = new JLabel("-");
		lblMini.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblMini.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		lblMini.setVerticalAlignment(SwingConstants.BOTTOM);
		lblMini.setHorizontalAlignment(SwingConstants.CENTER);
		lblMini.setForeground(Color.WHITE);
		lblMini.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblMini.setBounds(37, 3, 24, 20);
		contentPane.add(lblMini);
		
		lblEMS = new JLabel("EMS");
		lblEMS.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblEMS.setHorizontalAlignment(SwingConstants.CENTER);
		lblEMS.setForeground(new Color(0, 250, 154));
		lblEMS.setBounds(22, 171, 87, 42);
		contentPane.add(lblEMS);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(51, 102, 51));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 35));
		lblNewLabel.setBounds(0, 44, 133, 103);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mwaqa\\eclipse-workspace\\Assignment1\\images\\group.png"));
		contentPane.add(lblNewLabel);
		
		lblMainSide = new JLabel("");
		lblMainSide.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblMainSide.setBackground(new Color(39,174,96));
		lblMainSide.setOpaque(true);
		lblMainSide.setBounds(0, 0, 133, 500);
		contentPane.add(lblMainSide);
		
		lblMainContext = new JLabel("");
		lblMainContext.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblMainContext.setForeground(new Color(51, 102, 51));
		lblMainContext.setOpaque(true);
		lblMainContext.setBackground(new Color(46,204,113));
		lblMainContext.setFont(new Font("Bell MT", Font.PLAIN, 30));
		lblMainContext.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainContext.setHorizontalTextPosition(SwingConstants.LEADING);
		lblMainContext.setBounds(131, 0, 669, 58);
		contentPane.add(lblMainContext);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}

}
