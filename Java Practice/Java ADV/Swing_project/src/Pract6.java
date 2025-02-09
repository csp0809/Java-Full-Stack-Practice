import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Pract6 extends JFrame implements ActionListener{
	
	JLabel l0,l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	
	Pract6(){
		setLayout(null);
		setSize(1000,1000);
		setVisible(true);
	
		l0=new JLabel("Form");
		l0.setBounds(40, 20, 80, 60);
		l0.setForeground(Color.red);
		l0.setFont(new Font("Arial",Font.BOLD,30));
		add(l0);
		
		l1=new JLabel("Number 1");
		l1.setBounds(10, 80, 80, 30);
		l1.setForeground(Color.red);
		//l1.setFont(new Font("Arial",Font.BOLD,35));
		add(l1);
		
		t1=new JTextField();
		t1.setBounds(100, 80, 90, 30);
		add(t1);
		l2=new JLabel("Number 2");
		l2.setBounds(10, 120, 80, 30);
		l2.setForeground(Color.red);
		//l2.setFont(new Font("Arial",Font.BOLD,35));
		add(l2);
		
		t2=new JTextField();
		t2.setBounds(100, 120, 90, 30);
		add(t2);
		
		l3=new JLabel("Result");
		l3.setBounds(10, 160, 80, 30);
		l3.setForeground(Color.red);
		//l3.setFont(new Font("Arial",Font.BOLD,35));
		add(l3);
		
		t3=new JTextField();
		t3.setBounds(100, 160, 90, 30);
		add(t3);
		
		l4=new JLabel("Percentage");
		l4.setBounds(10, 200, 80, 30);
		l4.setForeground(Color.red);
		//l3.setFont(new Font("Arial",Font.BOLD,35));
		add(l4);
		
		t4=new JTextField();
		t4.setBounds(100, 200, 90, 30);
		add(t4);
		
		l5=new JLabel("Grade");
		l5.setBounds(10, 240, 80, 30);
		l5.setForeground(Color.red);
		//l3.setFont(new Font("Arial",Font.BOLD,35));
		add(l5);
		
		t5=new JTextField();
		t5.setBounds(100, 240, 90, 30);
		add(t5);
		
		b1=new JButton("Submit");
		b1.setBackground(Color.gray);
		b1.setForeground(Color.blue);
		b1.setBounds(10, 280, 90, 30);
		add(b1);
		
		b1.addActionListener(this);
		
		b2=new JButton("Cancel");
		b2.setBounds(120, 280, 90, 30);
		add(b2);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			int a,b,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a+b;
			t3.setText(""+c);
			
			
//			b1.setBackground(Color.green);
//			b1.setForeground(Color.cyan);
//			b1.setBounds(10, 280, 90, 30);
//			
//			l6=new JLabel("Submitted!!!");
//			l6.setBounds(40, 320, 90, 30);
//			l6.setForeground(Color.red);
//			add(l6);
//			revalidate();
//			repaint();
		}
	}

	public static void main(String args [])
	{
		new Pract6();
	}
}