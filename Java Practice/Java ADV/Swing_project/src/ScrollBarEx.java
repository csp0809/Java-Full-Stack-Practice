import java.awt.event.*;

import javax.swing.*;
public class ScrollBarEx extends JFrame implements AdjustmentListener{
	JLabel l;
	final JScrollBar s;
	ScrollBarEx(){
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		
		l=new JLabel();
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setSize(400,100);
		add(l);
		
		s= new JScrollBar();
		s.setBounds(100,100,50,500);
		add(s);
		
		s.addAdjustmentListener(this);
		
		
		
	}
	public static void main(String[] args)
	{
		new ScrollBarEx();
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
		
		l.setText("vertical scrollbar: "+s.getValue());
		
	}
}
