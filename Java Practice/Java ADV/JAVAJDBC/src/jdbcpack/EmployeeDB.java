package jdbcpack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class EmployeeDB extends JFrame implements ActionListener{
	JButton AddEmployee, update, delete, fetch;
	
	public EmployeeDB(){
		setTitle("Employees control centre for HR ");
		setSize(550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true); 
		
		AddEmployee = new JButton("Add Employee");
		AddEmployee.setBounds(20, 180, 120, 50);
		add(AddEmployee);
		
        update = new JButton("Update");
        update.setBounds(150, 180, 100, 50);
        add(update);
        
        delete = new JButton("Delete");
        delete.setBounds(260, 180, 100, 50);
        add(delete);
        
        fetch = new JButton("Fetch");
        fetch.setBounds(370, 180, 100, 50);
        add(fetch);
        
       
        
        AddEmployee.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);
        fetch.addActionListener(this);
       
}
	public void actionPerformed(ActionEvent e)
    {
    	// insert Employee Data
    	if(e.getSource()==AddEmployee) {
    		dispose();
    		new AddEmp();
    	}
    	if(e.getSource()==update) {
    		dispose();
    		new AddEmp();
    	}
    	if(e.getSource()==delete) {
    		dispose();
    		new AddEmp();
    	}
    	if(e.getSource()==fetch) {
    		dispose();
    		new AddEmp();
    	}
    	
    		
    }
	
	class AddEmp extends JFrame implements ActionListener{
		JLabel l0, l1, l2, l3, l4, l5, l6, l7;
        JTextField t1, t2, t4, t5, t6, t7;
        JComboBox<String> t3;
        JButton insert, update, delete, fetch, reset, showAll;
        JTable table;
        DefaultTableModel model;
        JScrollPane scrollPane;
        Connection con;
        

        public AddEmp() {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB", "root", "8451086651");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database Connection Failed: " + e.getMessage());
        }
		
		setTitle("Add Employee Data");
        setSize(650, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        l0 = new JLabel("Employee Management");
        l0.setBounds(150, 10, 200, 30);
        add(l0);
        
        l1 = new JLabel("Employee ID:");
        l1.setBounds(50, 50, 100, 30);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(150, 50, 200, 30);
        add(t1);

        l2 = new JLabel("Name:");
        l2.setBounds(50, 100, 100, 30);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(150, 100, 200, 30);
        add(t2);

        l3 = new JLabel("Month:");
        l3.setBounds(50, 150, 100, 30);
        add(l3);
        
        String Months[]= {"January", "February", "April", "May", "June", "July", "August", "September", "October", "November", "Decemebr"};
		t3=new JComboBox<>(Months);
		t3.setBounds(150, 150, 200, 30);
		add(t3);
        

        l4 = new JLabel("Week 1:");
        l4.setBounds(50, 200, 100, 30);
        add(l4);
        t4 = new JTextField();
        t4.setBounds(150, 200, 200, 30);
        add(t4);
        
        l5 = new JLabel("Week 2:");
        l5.setBounds(50, 250, 100, 30);
        add(l5);
        t5 = new JTextField();
        t5.setBounds(150, 250, 200, 30);
        add(t5);
        
        l6 = new JLabel("Week 3:");
        l6.setBounds(50, 300, 100, 30);
        add(l6);
        t6 = new JTextField();
        t6.setBounds(150, 300, 200, 30);
        add(t6);
        
        l7 = new JLabel("Week 4:");
        l7.setBounds(50, 350, 100, 30);
        add(l7);
        t7 = new JTextField();
        t7.setBounds(150, 350, 200, 30);
        add(t7);
        
        insert = new JButton("ADD");
        insert.setBounds(50, 400, 80, 30);
        add(insert);
        
        update = new JButton("Update");
        update.setBounds(140, 400, 80, 30);
        add(update);
        
        delete = new JButton("Delete");
        delete.setBounds(230, 400, 80, 30);
        add(delete);
        
        fetch = new JButton("Fetch");
        fetch.setBounds(320, 400, 80, 30);
        add(fetch);
        
        reset = new JButton("Reset");
        reset.setBounds(410, 400, 80, 30);
        add(reset);
        
        showAll = new JButton("Show All");
        showAll.setBounds(500, 400, 100, 30);
        add(showAll);
        

        // Table Setup
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Name", "Month", "Week1", "Week2", "Week3", "Week4"});
        table = new JTable(model);
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 440, 500, 200);
        add(scrollPane);

       
        insert.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);
        fetch.addActionListener(this);
        reset.addActionListener(e -> resetFields());
        showAll.addActionListener(e -> showAllEmployees());

        }
        public void actionPerformed(ActionEvent e)
        {
        	// insert Employee Data
        	if(e.getSource()==insert)
        	{
        		 try {
        	            if (con == null) {
        	                JOptionPane.showMessageDialog(this, "Database Not Connected");
        	                return;
        	            }

        	            String sql = "INSERT INTO employees (id, name, Month, Week1, Week2, Week3, Week4) VALUES (?, ?, ?, ?, ?, ?, ?)";
        	            PreparedStatement ps = con.prepareStatement(sql);
        	            ps.setInt(1, Integer.parseInt(t1.getText()));
        	            ps.setString(2, t2.getText());
        	            ps.setString(3, t3.getSelectedItem().toString());
        	            ps.setString(4, t4.getText());
        	            ps.setString(5, t5.getText());
        	            ps.setString(6, t6.getText());
        	            ps.setString(7, t7.getText());
        	            ps.executeUpdate();
        	            JOptionPane.showMessageDialog(this, "Employee Added Successfully");
        	            
        	            
        	        } catch (Exception e1) {
        	            JOptionPane.showMessageDialog(this, "Data Insertion Failed: " + e1.getMessage());
        	        }
        	}
        	// Update Employee Data
        	if(e.getSource()==update)
        	{
        		 try {
        	            if (con == null) {
        	                JOptionPane.showMessageDialog(this, "Database Not Connected");
        	                return;
        	            }

        	            String sql = "UPDATE employees SET name=?, Month=?, Week1=?, Week2=?, Week3=?, Week4=? WHERE id=?";
        	            PreparedStatement ps = con.prepareStatement(sql);
        	            ps.setString(1, t2.getText());
        	            ps.setString(2, t3.getSelectedItem().toString());
        	            ps.setString(3, t4.getText());
        	            ps.setString(4, t5.getText());
        	            ps.setString(5, t6.getText());
        	            ps.setString(6, t7.getText());
        	            ps.setInt(7, Integer.parseInt(t1.getText()));
        	            int rowsAffected = ps.executeUpdate();
        	            JOptionPane.showMessageDialog(this, "Employee Updated Successfully" );
        	            
        	            showAllEmployees(); // Refresh Table
        	            
        	        } catch (Exception e1) {
        	            JOptionPane.showMessageDialog(this, "update Failed: " + e1.getMessage());
        	        }
        	}
        	// delete Employee Data
        	if(e.getSource()==delete)
        	{
        		 try {
        	            if (con == null) {
        	                JOptionPane.showMessageDialog(this, "Database Not Connected");
        	                return;
        	            }

        	            String sql = "DELETE FROM employees WHERE id=?";
        	            PreparedStatement ps = con.prepareStatement(sql);
        	            ps.setInt(1, Integer.parseInt(t1.getText()));
        	            int rowsAffected = ps.executeUpdate();
        	            JOptionPane.showMessageDialog(this, "Employee Deleted Successfully" );
        	            
        	            showAllEmployees(); // Refresh Table
        	            
        	        } catch (Exception e1) {
        	            JOptionPane.showMessageDialog(this, "delete Failed: " + e1.getMessage());
        	        }
        	}
        	// search Employee Data
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
        	                t2.setText(rs.getString("name"));
        	                
        	                t4.setText(rs.getString("Week1"));
        	                t5.setText(rs.getString("Week2"));
        	                t6.setText(rs.getString("Week3"));
        	                t7.setText(rs.getString("Week4"));
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

       
        

        // Show All Employees (Table Refresh)
        public void showAllEmployees() {
            try {
                if (con == null) {
                    JOptionPane.showMessageDialog(this, "Database Not Connected");
                    return;
                }

                String sql = "SELECT * FROM employees";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                // Clear existing table data
                model.setRowCount(0);

                while (rs.next()) {
                	model.addRow(new Object[]{rs.getInt("id"), rs.getString("name"), rs.getString("Month"), rs.getString("Week1"), rs.getString("Week2"), rs.getString("Week3"), rs.getString("Week4")});
	            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Fetch Failed: " + e.getMessage());
            }
        }

        // Reset Fields
        public void resetFields() {
            t1.setText("");
            t2.setText("");
            
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
        }
  
}
          
public static void main(String args []) {
	new EmployeeDB();
}
}
