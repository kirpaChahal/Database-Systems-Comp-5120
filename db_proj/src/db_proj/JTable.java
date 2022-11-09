package db_proj;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JLabel;

//ORDER DETAIL FRAME

public class JTable extends JFrame {

	private JPanel contentPane;
	private javax.swing.JTable jt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTable frame = new JTable();
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
public JTable() {

	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 400, 305);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
		
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(10, 64, 366, 107);
	contentPane.add(scrollPane);	

	//ACTUAL QUERY
	my_mysql obj=new my_mysql();
	String[] column= {"BookID","OrderID","Quantity"};
	String orderquery = "SELECT * FROM db_order_detail LIMIT 0,8";
	jt1 = new javax.swing.JTable(obj.my_db_select(orderquery,3),column);
	scrollPane.setViewportView(jt1);
	
	JButton btnNewButton = new JButton("Order");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				orderTbl frame2 = new orderTbl();
				frame2.setVisible(true);
			
			} catch (Exception buhbuh) {
				buhbuh.printStackTrace();
			}
		}
	});
	btnNewButton.setBounds(10, 186, 85, 21);
	contentPane.add(btnNewButton);
	
	JLabel lblNewLabel = new JLabel("Order Detail");
	lblNewLabel.setBounds(158, 41, 85, 13);
	contentPane.add(lblNewLabel);
	
	JButton btnNewButton_1 = new JButton("Book");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				bookTbl frame3 = new bookTbl();
				frame3.setVisible(true);
			
			} catch (Exception buhbuh) {
				buhbuh.printStackTrace();
			}
		}
	});
	btnNewButton_1.setBounds(105, 186, 85, 21);
	contentPane.add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("Shipper");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				shipperTbl frame3 = new shipperTbl();
				frame3.setVisible(true);
			
			} catch (Exception buhbuh) {
				buhbuh.printStackTrace();
			}
		}
	});
	btnNewButton_2.setBounds(200, 186, 85, 21);
	contentPane.add(btnNewButton_2);
	//SUBJECT
	JButton btnNewButton_3 = new JButton("Subject");
	btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				subjectTbl frame3 = new subjectTbl();
				frame3.setVisible(true);
			
			} catch (Exception buhbuh) {
				buhbuh.printStackTrace();
			}
		}
	});
	btnNewButton_3.setBounds(291, 186, 85, 21);
	contentPane.add(btnNewButton_3);
	//SUPPLIER
	JButton btnNewButton_4 = new JButton("Supplier");
	btnNewButton_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				supplierTbl frame3 = new supplierTbl();
				frame3.setVisible(true);
			
			} catch (Exception buhbuh) {
				buhbuh.printStackTrace();
			}
		}
	});
	btnNewButton_4.setBounds(10, 217, 85, 21);
	contentPane.add(btnNewButton_4);
	//CUSTOMER
	JButton btnNewButton_5 = new JButton("Customer");
	btnNewButton_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				customerTbl frame3 = new customerTbl();
				frame3.setVisible(true);
			
			} catch (Exception buhbuh) {
				buhbuh.printStackTrace();
			}
		}
	});
	btnNewButton_5.setBounds(105, 217, 85, 21);
	contentPane.add(btnNewButton_5);
	
	//EMPLOYEE
	JButton btnNewButton_6 = new JButton("Employee");
	btnNewButton_6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				employeeTbl frame3 = new employeeTbl();
				frame3.setVisible(true);
			
			} catch (Exception buhbuh) {
				buhbuh.printStackTrace();
			}
		}
	});
	
	btnNewButton_6.setBounds(200, 217, 85, 21);
	contentPane.add(btnNewButton_6);
	}
}