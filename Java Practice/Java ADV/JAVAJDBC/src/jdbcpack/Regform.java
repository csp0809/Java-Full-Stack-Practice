package jdbcpack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Regform extends JFrame implements ActionListener {

    JLabel l0, l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton insert, update, delete, fetch, reset, showAll;
    JTable table;
    DefaultTableModel model;
    JScrollPane scrollPane;
    Connection con;

    public Regform() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iiht", "root", "8451086651");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database Connection Failed: " + e.getMessage());
        }
        setTitle("Employee Registration Form");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        l0 = new JLabel("Registration Form");
        l0.setBounds(150, 10, 200, 30);
        l1 = new JLabel("Employee ID:");
        l1.setBounds(50, 50, 100, 30);
        t1 = new JTextField();
        t1.setBounds(150, 50, 200, 30);

        l2 = new JLabel("Name:");
        l2.setBounds(50, 100, 100, 30);
        t2 = new JTextField();
        t2.setBounds(150, 100, 200, 30);

        l3 = new JLabel("Department:");
        l3.setBounds(50, 150, 100, 30);
        t3 = new JTextField();
        t3.setBounds(150, 150, 200, 30);

        l4 = new JLabel("Salary:");
        l4.setBounds(50, 200, 100, 30);
        t4 = new JTextField();
        t4.setBounds(150, 200, 200, 30);

        insert = new JButton("Insert");
        insert.setBounds(50, 270, 80, 30);
        update = new JButton("Update");
        update.setBounds(140, 270, 80, 30);
        delete = new JButton("Delete");
        delete.setBounds(230, 270, 80, 30);
        fetch = new JButton("Fetch");
        fetch.setBounds(320, 270, 80, 30);
        reset = new JButton("Reset");
        reset.setBounds(410, 270, 80, 30);
        showAll = new JButton("Show All");
        showAll.setBounds(500, 270, 100, 30);

        // Table Setup
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Name", "Department", "Salary"});
        table = new JTable(model);
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 320, 700, 200);

        add(l0);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(insert);
        add(update);
        add(delete);
        add(fetch);
        add(reset);
        add(showAll);
        add(scrollPane);

        insert.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);
        fetch.addActionListener(this);
        reset.addActionListener(e -> resetFields());
        showAll.addActionListener(e -> showAllEmployees());

        setVisible(true);
        
        // Load data initially
        showAllEmployees();
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

    	            String sql = "INSERT INTO employees (id, name, department, salary) VALUES (?, ?, ?, ?)";
    	            PreparedStatement ps = con.prepareStatement(sql);
    	            ps.setInt(1, Integer.parseInt(t1.getText()));
    	            ps.setString(2, t2.getText());
    	            ps.setString(3, t3.getText());
    	            ps.setDouble(4, Double.parseDouble(t4.getText()));
    	            ps.executeUpdate();
    	            JOptionPane.showMessageDialog(this, "Employee Inserted Successfully");
    	            
    	            showAllEmployees(); // Refresh Table
    	            
    	        } catch (Exception e1) {
    	            JOptionPane.showMessageDialog(this, "Insertion Failed: " + e1.getMessage());
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

    	            String sql = "UPDATE employees SET name=?, department=?, salary=? WHERE id=?";
    	            PreparedStatement ps = con.prepareStatement(sql);
    	            ps.setString(1, t2.getText());
    	            ps.setString(2, t3.getText());
    	            ps.setDouble(3, Double.parseDouble(t4.getText()));
    	            ps.setInt(4, Integer.parseInt(t1.getText()));
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
    	                t3.setText(rs.getString("department"));
    	                t4.setText(rs.getString("salary"));
    	                model.addRow(new Object[]{rs.getInt("id"), rs.getString("name"), rs.getString("department"), rs.getDouble("salary")});
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
                model.addRow(new Object[]{rs.getInt("id"), rs.getString("name"), rs.getString("department"), rs.getDouble("salary")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fetch Failed: " + e.getMessage());
        }
    }

    // Reset Fields
    public void resetFields() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
    }

    public static void main(String[] args) {
        new Regform();
    }
}
