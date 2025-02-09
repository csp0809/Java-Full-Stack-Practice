import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class KeyList extends JFrame implements KeyListener
{
	KeyList()
	{
		setVisible(true);
		setSize(500, 500);
		
		addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char ch=e.getKeyChar();
		
		if(ch == ' ') {
		
			
			//getContentPane().setBackground(Color.red);
			
			try 
			{
			Thread.sleep(1000);
			}
			catch (Exception e1) {
				// TODO: handle exception
			}
			
			getContentPane().setBackground(Color.blue);
		
		}
		/*if(ch==' ')
		{
			getContentPane().setBackground(Color.red);
		}
		else
		{
			getContentPane().setBackground(Color.black);
		}*/
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String args[]) {
		 new KeyList();
	
	}
}