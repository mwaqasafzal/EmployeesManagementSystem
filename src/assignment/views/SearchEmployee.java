package assignment.views;

import java.awt.EventQueue;


import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.table.TableModel;

import assignment.employees.Employee;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SearchEmployee extends Base {
	private JTextField textSearchValue;
	private ButtonGroup searchBtnGrp;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchEmployee frame = new SearchEmployee();
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
	public SearchEmployee() {
	searchBtnGrp=new ButtonGroup();
	lblMainContext.setText("Search Employee");
	
	textSearchValue = new JTextField("Search By ID...");
	textSearchValue.addFocusListener(new FocusAdapter() {
		@Override
		public void focusGained(FocusEvent e) {
			textSearchValue.setText("");
		}
	});
	
	textSearchValue.setFont(new Font("Times New Roman", Font.ITALIC, 12));
	textSearchValue.setForeground(new Color(0, 128, 0));
	textSearchValue.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 100, 0)));
	textSearchValue.setBounds(145, 69, 156, 20);
	getContentPane().add(textSearchValue);
	textSearchValue.setColumns(10);
	
	JRadioButton rdbtnById = new JRadioButton("By ID");
	rdbtnById.setSelected(true);
	rdbtnById.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			textSearchValue.setText("Enter ID...");
		}
	});
	rdbtnById.setBounds(145, 96, 57, 23);
	getContentPane().add(rdbtnById);
	
	JRadioButton rdbtnByName = new JRadioButton("By Name");
	rdbtnByName.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			textSearchValue.setText("Enter Name...");
		}
	});
	rdbtnByName.setBounds(204, 96, 97, 23);
	getContentPane().add(rdbtnByName);
	
	searchBtnGrp.add(rdbtnById);
	searchBtnGrp.add(rdbtnByName);
	
	JButton btnSearch = new JButton("Search");
	btnSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	btnSearch.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 15));
	btnSearch.setForeground(new Color(0, 100, 0));
	btnSearch.setBackground(new Color(46, 139, 87));
	btnSearch.setBounds(311, 65, 89, 23);
	getContentPane().add(btnSearch);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBackground(new Color(46, 139, 87));
	scrollPane.setBounds(133, 146, 667, 343);
	getContentPane().add(scrollPane);
	
	table = new JTable();
	
	scrollPane.setViewportView(table);
	
	JButton btnUpdate = new JButton("Update");
	btnUpdate.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			update();
		}
		
	});
//	btnUpdate.addMouseListener(new MouseAdapter() {
//		@Override
//		public void mouseClicked(MouseEvent e) {
//	
//			update();
//		}
//	});
	btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	btnUpdate.setForeground(new Color(0, 100, 0));
	btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 15));
	btnUpdate.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	btnUpdate.setBackground(new Color(46, 139, 87));
	btnUpdate.setBounds(356, 121, 89, 23);
	btnUpdate.setEnabled(false);
	getContentPane().add(btnUpdate);
	
	JButton btnDelete = new JButton("Delete");
	btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	btnDelete.setForeground(new Color(0, 100, 0));
	btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 15));
	btnDelete.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	btnDelete.setBackground(new Color(46, 139, 87));
	btnDelete.setBounds(455, 122, 89, 23);
	btnDelete.setEnabled(false);
	getContentPane().add(btnDelete);
	
	
	table.setVisible(false);
	scrollPane.setVisible(false);
	
	table.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			btnUpdate.setEnabled(true);
			btnDelete.setEnabled(true);
			
		}
	});

	btnSearch.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			
			ResultSet rs=null;
			if(rdbtnById.isSelected()) {
				try {
					rs=Employee.retrive(Integer.parseInt(textSearchValue.getText()));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			else if(rdbtnByName.isSelected()) {
				try {
					rs=Employee.retrive(textSearchValue.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(rs!=null) {
				table.setModel(DbUtils.resultSetToTableModel(rs));
				table.setVisible(true);
				scrollPane.setVisible(true);
			}
				
		}
	});
	}
	
	public void update() {
		int index=table.getSelectedRow();
		TableModel model=table.getModel();
		int value1=Integer.parseInt(model.getValueAt(index, 0).toString());
		String value2=model.getValueAt(index, 1).toString();
		int value3=Integer.parseInt(model.getValueAt(index, 2).toString());
		float value4=Float.parseFloat((model.getValueAt(index, 3).toString()));
		String designation=model.getValueAt(index, 4).toString();
		float value5=Float.parseFloat((model.getValueAt(index, 5).toString()));
		int value6=Integer.parseInt(model.getValueAt(index, 6).toString());
		
		if(designation.equalsIgnoreCase("lec")) {
			
			System.out.println("Lecturer:"+value1+" "+value2+" "+value3+" "+value4+" "+value5+" "+value6);
		}
		else {
			System.out.println("Security Guard:"+value1+" "+value2+" "+value3+" "+value4+" "+value5+" "+value6);
		}
	}
}
