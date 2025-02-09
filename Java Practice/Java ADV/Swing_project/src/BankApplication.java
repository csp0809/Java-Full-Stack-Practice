import javax.swing.*;
import java.awt.*;
public class BankApplication extends JFrame{

	JLabel l0,l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	
		BankApplication(){
			setLayout(null);
			setSize(1000,1000);
			setVisible(true);
		
			l0=new JLabel("GIThub BANK ATM Service");
			l0.setBounds(40, 20, 600, 60);
			l0.setForeground(Color.black);
			l0.setFont(new Font("Arial",Font.BOLD,35));
			add(l0);
		
			
			l1=new JLabel("Account Number: ");
			l1.setBounds(60, 80, 200, 30);
			l1.setForeground(Color.red);
			add(l1);
			
			t1=new JTextField();
			t1.setBounds(200, 80, 90, 30);
			add(t1);
			
			l2=new JLabel("Account Holders Name: ");
			l2.setBounds(60, 120, 200, 30);
			l2.setForeground(Color.red);
			add(l2);
			
			t2=new JTextField();
			t2.setBounds(200, 120, 90, 30);
			add(t2);
			
			l3=new JLabel("Amount");
			l3.setBounds(60, 160, 200, 30);
			l3.setForeground(Color.red);
			add(l3);
			
			t3=new JTextField();
			t3.setBounds(200, 160, 90, 30);
			add(t3);
			
			l4=new JLabel("Percentage");
			l4.setBounds(60, 200, 200, 30);
			l4.setForeground(Color.red);
			add(l4);
			
			t4=new JTextField();
			t4.setBounds(200, 200, 90, 30);
			add(t4);
			
			b1=new JButton("Submit");
			b1.setBackground(Color.gray);
			b1.setForeground(Color.blue);
			b1.setBounds(60, 300, 90, 30);
			add(b1);
			
//			b1.addActionListener(this);
			
			b2=new JButton("Cancel");
			b2.setBounds(180, 300, 90, 30);
			add(b2);
		}
		public static void main(String args[]) {
			new BankApplication();
		}
}
		


		
		
		