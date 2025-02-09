import javax.swing.*;
import java.awt.event.*;

public class RadioBtn extends JFrame implements ActionListener{
	
	JRadioButton rb1,rb2;
	JButton b1;
	public RadioBtn() {
		
		setSize(600, 500);
		setVisible(true);
		setLayout(null);
		
		rb1=new JRadioButton("Male");
		rb1.setBounds(80, 50, 90, 30);
		
		rb2=new JRadioButton("Female");
		rb2.setBounds(80, 100, 90, 30);
		
		b1=new JButton("Click");
		b1.setBounds(80, 150, 90, 30);
		b1.addActionListener(this);
		
		add(rb1);
		add(rb2);
		add(b1);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		add(b1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(rb1.isSelected())
		{
			JOptionPane.showMessageDialog(b1, "You are Male");
		}
		if(rb2.isSelected())
		{
			JOptionPane.showMessageDialog(b1, "You are Female");
		}
	}
	public static void main(String args []) {
		new RadioBtn();
	}
}
