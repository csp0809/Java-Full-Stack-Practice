import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxExample extends JFrame implements ActionListener{
	JLabel l1;
	JButton b1;
	JCheckBox cb1,cb2,cb3;
	public CheckBoxExample() {
		setSize(600, 600);
		setVisible(true);
		setLayout(null);
		
		l1= new JLabel("Food Ordering System");
		l1.setBounds(30, 50, 190, 30);
		
		cb1=new JCheckBox("Pizza @ 100");
		cb1.setBounds(30, 100, 150, 20);
		
		cb2=new JCheckBox("Burger @ 300");
		cb2.setBounds(30, 150, 150, 20);
		
		cb3=new JCheckBox("Coffee @ 300");
		cb3.setBounds(30, 200, 150, 20);
		
		b1=new JButton("Order");
		b1.setBounds(30, 250, 150, 30);
		b1.addActionListener(this);
		
		add(l1);
		add(cb1);
		add(cb2);
		add(cb3);
		add(b1);
	}
	public static void main(String args[]) {
		new CheckBoxExample();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		float amount=0;
		String msg="";
		if(cb1.isSelected()) {
			amount+=100;
			msg="Pizza 100\n";
		}
		if(cb2.isSelected()) {
			amount+=300;
			msg="Burger 300\n";
		}
		if(cb3.isSelected()) {
			amount+=300;
			msg="Coffee 300\n";
		}
		msg+="----------------------------------\n";
		JOptionPane.showMessageDialog(this, msg+"Total: "+amount);
		
	}
	
}
