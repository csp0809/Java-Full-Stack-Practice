package jdbcpack;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EmpLogin extends JFrame {
	JLabel  l1,l2,l0;
	JTextField t1;
	JButton Login,Cancel;
	
	public EmpLogin()
	{
		setTitle("Employee Login Page");
		setSize(550, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		l0 = new JLabel("Please Login");
		l0.setBounds(210, 60, 200, 30);
        l0.setFont(new Font("Arial", Font.BOLD, 18));
        add(l0);
        
        l1 = new JLabel("Login ID: ");
        l1.setBounds(150, 120, 200, 30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(150, 160, 200, 30);
        add(l2);
       
        
        t1 = new JTextField();
        t1.setBounds(250, 120, 140, 30);
        add(t1);
        
        JPasswordField t2=new JPasswordField();
        t2.setBounds(250, 160, 140, 30);
        add(t2);
        
        Login = new JButton("Login");
        Login.setBounds(150, 200, 100, 30);
        add(Login);
        
        Cancel = new JButton("Cancel");
        Cancel.setBounds(260, 200, 100, 30);
        add(Cancel);
        
		
		
		Login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String x= new String (t2.getPassword());
				if(t1.getText().equals("chait")&& x.equals("chait123"))
				{
					JOptionPane.showMessageDialog(EmpLogin.this, "Login Successful");
                    dispose();
                    new EmpFetch();
					
				}
				else {
					JOptionPane.showMessageDialog(EmpLogin.this, "Username and password not match, Please check and try again later");
					
					
				}
			}
		});
		
		Cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose(); 
	    	    new Login();
			}
			
		});
		
	}
	
}
		
	class EmpFetch extends JFrame implements ActionListener{	
			JLabel l0, l1,l2,l3,l4;
	        JTextField t1;
	        JButton fetch;
	        JTable table;
	        DefaultTableModel model;
	        JScrollPane scrollPane;
	        Connection con;
	        

	        public EmpFetch() {
			try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB", "root", "8451086651");
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(this, "Database Connection Failed: " + e.getMessage());
	        }
			
			setTitle("Add Employee Data");
	        setSize(600, 500);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLayout(null);
	        setVisible(true);
	        
	        l0 = new JLabel("Employee Management System");
	        l0.setBounds(130, 10, 300, 30);
	        l0.setFont(new Font("Arial", Font.BOLD, 16));
	        add(l0);
	        
	        l1 = new JLabel("Employee ID:");
	        l1.setBounds(50, 60, 100, 30);
	        add(l1);
	        t1 = new JTextField();
	        t1.setBounds(150, 60, 200, 30);
	        add(t1);
	        
	        l2 = new JLabel("Shift A: 8:00 AM - 3:30 PM");
	        l2.setBounds(360, 60, 250, 30);
	        add(l2);
	        l3 = new JLabel("Shift B: 2:00 PM - 10:00 PM");
	        l3.setBounds(360, 90, 250, 30);
	        add(l3);
	        l4 = new JLabel("Shift C: 10:00 PM - 8:00 AM");
	        l4.setBounds(360, 120, 250, 30);
	        add(l4);
	        
	        fetch = new JButton("Fetch");
	        fetch.setBounds(190, 100, 80, 30);
	        add(fetch);
	        
	     // Table Setup
	        model = new DefaultTableModel();
	        model.setColumnIdentifiers(new String[]{"ID", "Name", "Month", "Week1", "Week2", "Week3", "Week4"});
	        table = new JTable(model);
	        scrollPane = new JScrollPane(table);
	        scrollPane.setBounds(50, 200, 500, 200);
	        add(scrollPane);

	        fetch.addActionListener(this);
	}
	        @Override
	        public void actionPerformed(ActionEvent e)
	        {
	        	if(e.getSource()==fetch)
	        	{
	        		 try {
	        	            if (con == null) {
	        	                JOptionPane.showMessageDialog(this, "Database Not Connected");
	        	                return;
	        	            }
	        	            
	        	            String sql = "SELECT * FROM employees WHERE id=?";
	        	            PreparedStatement ps = con.prepareStatement(sql);
	        	            ps.setInt(1, Integer.parseInt(t1.getText()));
	        	            ResultSet rs = ps.executeQuery();
	        	            model.setRowCount(0);
	        	            
	        	            if (rs.next()) {
	        	                model.addRow(new Object[]{rs.getInt("id"), rs.getString("name"), rs.getString("Month"), rs.getString("Week1"), rs.getString("Week2"), rs.getString("Week3"), rs.getString("Week4")});
	        	                JOptionPane.showMessageDialog(this, "Employee Data Fetched");
	        	                 
	        	            } else {
	        	                JOptionPane.showMessageDialog(this, "Employee Not Found");
	        	            }
	        	            
	        	        } catch (Exception e1) {
	        	            JOptionPane.showMessageDialog(this, " Failed: " + e1.getMessage());
	        	        }
	        	}
	        }


	public static void main(String args []) {
		new EmpLogin();
	}
	}


