import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BorderPract1 extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5;
	BorderPract1()
	{
		setLayout(new BorderLayout());
		setSize(500,500);
		setVisible(true);
		b1=new JButton("red");
		b2=new JButton("yellow");
		b3=new JButton("green");
		b4=new JButton("blue");
		b5=new JButton("cyan");
		
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.NORTH);
		add(b4,BorderLayout.SOUTH);
		add(b5,BorderLayout.CENTER);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			b1.setBackground(Color.red);
			b1.setForeground(Color.blue);
			b1.setFont(new Font("Arial",Font.BOLD,35));
		}
		if(e.getSource()==b2)
		{
			b2.setBackground(Color.yellow);
			b2.setForeground(Color.red);
//			b2.setSize(50, 50);
		}
		if(e.getSource()==b3)
		{
			b3.setBackground(Color.green);
			b3.setForeground(Color.cyan);
//			b3.setSize(50, 50);
		}
		if(e.getSource()==b4)
		{
			b4.setBackground(Color.blue);
			b4.setForeground(Color.green);
			
		}
		if(e.getSource()==b5)
		{
			b5.setBackground(Color.cyan);
			b5.setForeground(Color.darkGray);
			b5.setFont(new Font("Arial",Font.BOLD,35));
		}
	}
	public static void main(String args [])
	{
		new BorderPract1();
	}
}
