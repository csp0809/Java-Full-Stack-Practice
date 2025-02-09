import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class Mouselisten extends JFrame implements MouseListener
{
	Mouselisten()
	{
		setVisible(true);
		setSize(500, 500);
		addMouseListener(this);
	}
	public static void main(String args[]) {
		 new Mouselisten();
	
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		getContentPane().setBackground(Color.red);
		System.out.println("click");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		getContentPane().setBackground(Color.blue);
		System.out.println("press");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		getContentPane().setBackground(Color.green);
		System.out.println("release");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		getContentPane().setBackground(Color.yellow);
		System.err.println(e.getX()+","+e.getY());
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		getContentPane().setBackground(Color.cyan);
	}
}