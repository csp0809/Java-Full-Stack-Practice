import java.awt.*;
import javax.swing.*;
 
public class EmployeeReg extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton submitButton, resetButton;
    
    public EmployeeReg() {
    	 JFrame j=new JFrame();
        setTitle("Employee Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        
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

        l4 = new JLabel("Email:");
        l4.setBounds(50, 200, 100, 30);
        t4 = new JTextField();
        t4.setBounds(150, 200, 200, 30);

        submitButton = new JButton("Submit");
        submitButton.setBounds(100, 270, 80, 30);
        resetButton = new JButton("Reset");
        resetButton.setBounds(200, 270, 80, 30);
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(submitButton);
        add(resetButton);


        submitButton.addActionListener(e -> {
            String employeeId = t1.getText();
            String name = t2.getText();
            String department = t3.getText();
            String email = t4.getText();
            JOptionPane.showMessageDialog(this, "Employee Registered:\n" +
                    "ID: " + employeeId + "\n" +
                    "Name: " + name + "\n" +
                    "Department: " + department + "\n" +
                    "Email: " + email);
            JLabel l11=new JLabel(new ImageIcon("C:\\Users\\91845\\eclipse-workspace\\Swing_project\\src\\" + t2.getText()));
            l11.setBounds(200, 400, 100, 100);
            
            add(l11);
            revalidate(); 
            repaint();  
        });

        resetButton.addActionListener(e -> {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        });

       
       
       
    }
    public static void main(String[] args) {
    	new EmployeeReg();
    	
    }
    
}