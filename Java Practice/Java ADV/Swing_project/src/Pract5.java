import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Pract5 extends JFrame implements ActionListener{
	JButton b1;
	JLabel l1;
	JTextArea t1;
	Pract5(){
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		
		b1=new JButton("red");
		b1.setBounds(10, 20, 70, 90);//x,y,w,h
		add(b1);
		b1.addActionListener(this);
		
		l1=new JLabel("Red");
		l1.setBounds(100, 20, 80, 90);
		l1.setForeground(Color.red);
		l1.setFont(new Font("Arial",Font.BOLD,35));
		add(l1);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			b1.setBackground(Color.green);
			b1.setForeground(Color.cyan);
		}
	}
	public static void main(String args [])
	{
		new Pract5();
	}
}

