package jdbcpack;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	JLabel  l0,l01;
	JButton Emp,HR;
	
	public Login()
	{
		setTitle("Employee Login");
		setSize(550, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		l0 = new JLabel("Employee Management System");
        l0.setBounds(120, 10, 300, 30);
        l0.setFont(new Font("Arial", Font.BOLD, 20));
        add(l0);
        
        l01 = new JLabel("Select Employee Type ");
        l01.setBounds(180, 60, 200, 30);
        l01.setFont(new Font("Arial", Font.BOLD, 16));
        add(l01);
        
        Emp = new JButton("Employee");
        Emp.setBounds(200, 110, 100, 30);
        Emp.addActionListener(this);
        add(Emp);
        
        HR = new JButton("HR");
        HR.setBounds(200, 150, 100, 30);
        HR.addActionListener(this);
        add(HR);
	}
	
	public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==Emp)
    	{
    		dispose(); 
    	    new EmpLogin();
    	}
    	if(e.getSource()==HR)
    	{
    		dispose(); 
    	    new HrLogin();
    	}
    }
	
	
	public static void main(String args []) {
		new Login();
	}
}
