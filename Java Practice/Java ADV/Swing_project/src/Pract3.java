import java.awt.*;
import javax.swing.*;
public class Pract3 extends JFrame
{
	JLabel l1,l2,l3;
	Pract3(){
	setLayout(new FlowLayout());
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
}
	public static void main(String args[]) {
		new Pract3();
	}
}
