package jdbcpack;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HrLogin extends JFrame {
	JLabel  l1,l2,l0;
	JTextField t1,t2;
	JButton Login,Cancel;
	
	public HrLogin()
	{
		setTitle("HR Login Page");
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
					JOptionPane.showMessageDialog(HrLogin.this, "Login Successful");
                    dispose();
                    new EmployeeDB();
					
				}
				else {
					JOptionPane.showMessageDialog(HrLogin.this, "Username and password not match, Please check and try again later");
					
					
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
	
	
	
	public static void main(String args []) {
		new HrLogin();
	}
}
