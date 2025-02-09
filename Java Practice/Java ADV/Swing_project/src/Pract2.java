import javax.swing.*;
import java.awt.*;
//Abstract Window Toolkit
public class Pract2 extends Canvas{
public void paint(Graphics g)
{
	g.setColor(Color.gray);
	g.drawString("Chaitanya", 50,50);
	
	g.drawString("Patil", 110,50);
	setBackground(Color.pink);
	g.drawLine(50, 200, 20, 20);
	g.drawOval(300, 80, 20, 60);
	g.drawRect(250, 250,60,60);
	g.drawRoundRect(50, 300, 60, 60, 50, 60);
	
	g.setColor(Color.cyan);
	g.fillOval(250, 350, 50, 70);
	g.fillRect(150, 150, 80, 90);
}
public static void main(String args[])
{
	JFrame f =new JFrame();
	f.setSize(500,500);
	f.setVisible(true);
	f.add(new Pract2());
}
}
