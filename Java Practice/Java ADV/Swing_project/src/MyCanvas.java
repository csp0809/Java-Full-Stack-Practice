import java.awt.*;
import java.awt.image.ImageObserver;

import javax.swing.*;
public class MyCanvas extends Canvas{
	public void paint(Graphics g)
	{
		Toolkit t=Toolkit.getDefaultToolkit();
		Image i=t.getImage("C:\\Users\\91845\\eclipse-workspace\\Swing_project\\src\\feather.jpg");
		g.drawImage(i, 0, 0, 1500, 740, this);
	}
	public static void main(String args [])
	{
		MyCanvas obj=new MyCanvas();
		JFrame j=new JFrame();
		j.add(obj);
		j.setSize(400,400);
		j.setVisible(true);
	}
}
