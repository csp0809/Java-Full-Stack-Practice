import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;
public class Pract extends JFrame {
	Pract()
	{
		setSize(500,500);
		setVisible(true);
		getContentPane().setBackground(Color.red);
		repaint();
		
	}
//	public void paint(Graphics g)
//	{
//		setBackground(Color.red);
//		g.drawString("Chaitanya", 78, 20);
//	}
	public static void main(String args[]) {
		new Pract();
	}
}

