import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class ColorChooser extends JFrame implements ActionListener{
	JButton b1;
	JTextArea t1;
	ColorChooser()
	{
		setTitle("Color Chooser Example");
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		
		b1=new JButton("Color");
		b1.setBounds(200, 250, 100, 30);
		b1.addActionListener(this);
		t1=new JTextArea();
		t1.setBounds(10, 10, 300, 200);
		
		add(b1);
		add(t1);
	}
	public static void main(String[] args)
	{
		new ColorChooser();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Color c=JColorChooser.showDialog(b1, "Choose", Color.cyan);
				t1.setBackground(c);
	}
}
