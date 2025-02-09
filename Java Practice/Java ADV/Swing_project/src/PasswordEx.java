import java.awt.event.*;

import javax.swing.*;

public class PasswordEx{
	
	public static void main(String[] args)
	{
		
		JFrame j=new JFrame("Password field example");
		j.setSize(300,300);
		j.setVisible(true);
		j.setLayout(null);
		
		final JLabel label=new JLabel(); //use to display output
		label.setBounds(20, 150, 400, 50);
		
		JLabel l1=new JLabel("Username");
		l1.setBounds(20, 20, 80, 30);
		
		final JTextField text=new JTextField();
		text.setBounds(100,20,100,30);
		
		
		JLabel l2=new JLabel("Password");
		l2.setBounds(20, 75, 80, 30);
		
		final JPasswordField pass=new JPasswordField();
		pass.setBounds(100, 75, 100, 30);
		
		JButton b1=new JButton("Login");
		b1.setBounds(100, 120, 80, 30);
		
		
		j.add(label);
		j.add(pass);
		j.add(l1);
		j.add(l2);
		j.add(b1);
		j.add(text);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String data="Username: " + text.getText();
				data+=",  Password: "+new String(pass.getPassword());
				label.setText(data);
			}
		});
	}	
}

	
	


