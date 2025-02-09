import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutPract extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	CardLayout card;
	Container c;
	
	CardLayoutPract(){
		setSize(600, 600);
		setVisible(true);
		
		c=getContentPane();
		card=new CardLayout(550, 400);
		c.setLayout(card);
		
		b1=new JButton("One");
		b1.setBackground(Color.red);
		
		b2=new JButton("Two");
		b2.setBackground(Color.blue);
		
		b3=new JButton("Three");
		b3.setBackground(Color.orange);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		c.add(" ",b1);
		c.add(" ",b2);
		c.add(" ",b3);
		
	}
	public static void main(String args[]) {
		new CardLayoutPract();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		card.next(c);
		
	}
}
