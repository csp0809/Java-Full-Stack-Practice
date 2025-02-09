import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Pass {
	public static void main	(String args[]) {
		JFrame j=new JFrame("Login Page");
		j.setSize(600, 600);
		j.setVisible(true);
		j.setLayout(null);
		
		JLabel l=new JLabel();
		l.setBounds(40, 200, 400, 30);
		j.add(l);
		
		JLabel lx=new JLabel();
		lx.setBounds(40, 200, 400, 30);
		j.add(lx);
		
		JLabel l1=new JLabel();
		l1.setBounds(40, 50, 90, 30);
		j.add(l1);
		
		JTextField jf1= new JTextField();
		jf1.setBounds(120, 50, 90, 30);
		j.add(jf1);
		
		JLabel l2=new JLabel();
		l2.setBounds(40, 100, 90, 30);
		j.add(l2);
		
		JPasswordField jf2=new JPasswordField();
		jf2.setBounds(120, 100, 90, 30);
		j.add(jf2);
		
		JButton b=new JButton("Login");
		b.setBounds(40,150,90,30);
		j.add(b);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String x= new String (jf2.getPassword());
				if(jf1.getText().equals("chait")&& x.equals("chait123"))
				{
					l.setText("Welcome: "+jf1.getText());
				}
				else {
					l.setText("Username and password not match");
					
				}
			}
		});
	}
}
