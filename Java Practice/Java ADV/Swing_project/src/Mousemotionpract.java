import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
public class Mousemotionpract extends JFrame implements MouseMotionListener
{int x,y;
	Mousemotionpract()
	{
		setVisible(true);
		setSize(500, 500);
		addMouseMotionListener(this);
	}
	public static void main(String args[]) {
		 new Mousemotionpract();
	
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//getContentPane().setBackground(Color.yellow);
		x=e.getX();
		y=e.getY();
		repaint();
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		getContentPane().setBackground(Color.blue);
		//x=e.getX();
		//y=e.getY();
		//repaint();
	}
	public void paint(Graphics g)
	{
		//g.drawLine(x, y, 60, 60);
//		g.drawString(".", x, y);
	}
	}