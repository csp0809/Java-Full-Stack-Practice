import java.awt.event.*;

import javax.swing.*;

public class ComboBox extends JFrame{
	ComboBox()
	{
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		
		JLabel l1 = new JLabel();
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setSize(400, 400);
		
		JButton b1=new JButton("Show");
		b1.setBounds(200, 100, 75, 20);
		
		add(l1);
		add(b1);
		
		String laguages[]= {"C", "C++", "JAVA"};
		JComboBox cb=new JComboBox(laguages);
		cb.setBounds(50, 100, 90, 20);
		add(cb);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String data ="Programming language selected: "+cb.getItemAt(cb.getSelectedIndex());
				l1.setText(data);
			}
		});
		
		
		
	}
	public static void main(String args[])
	{
		new ComboBox();
	}
}
