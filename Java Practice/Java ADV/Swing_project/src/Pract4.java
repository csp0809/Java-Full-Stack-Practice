import javax.swing.*;
import java.awt.*;
public class Pract4 extends JFrame
	{
		JLabel l1,l2,l3,l4,l5,l6;
		Pract4(){
		setLayout(new GridLayout(2, 3));
		setSize(500,500);
		setVisible(true);
		
		l1=new JLabel("Red");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Arial",Font.BOLD,35));
		add(l1);
		
		l2=new JLabel("Blue");
		l2.setForeground(Color.blue);
		l2.setFont(new Font("Arial",Font.BOLD,35));
		add(l2);
		
		l3=new JLabel("Yellow");
		l3.setForeground(Color.yellow);
		l3.setFont(new Font("Arial",Font.BOLD,35));
		add(l3);
		
		l4=new JLabel("GIT");
		l4.setForeground(Color.magenta);
		l4.setFont(new Font("Arial",Font.BOLD,35));
		add(l4);
		
		l5=new JLabel("Chaitanya");
		l5.setForeground(Color.red);
		l5.setFont(new Font("Arial",Font.BOLD,35));
		add(l5);
		
		l6=new JLabel("Patil");
		l6.setForeground(Color.blue);
		l6.setFont(new Font("Arial",Font.BOLD,35));
		add(l6);
		
	}
		public static void main(String args[]) {
			new Pract4();
		}
}

