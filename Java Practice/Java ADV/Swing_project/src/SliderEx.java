import javax.swing.*;
public class SliderEx extends JFrame{
	JSlider s1;
	JPanel p;
	SliderEx(){
		s1=new JSlider(JSlider.HORIZONTAL,0,100,50);
		s1.setMinorTickSpacing(2);
		s1.setMajorTickSpacing(10);
		s1.setPaintTicks(true);
		s1.setPaintLabels(true);
		
		p=new JPanel();
		add(p);
		p.add(s1);
		
		
	}
	
	public static void main (String[] args)
	{
		SliderEx s=new SliderEx();
		s.pack();
		s.setVisible(true);
		
	}
}
