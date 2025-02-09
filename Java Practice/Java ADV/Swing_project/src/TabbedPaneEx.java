
import javax.swing.*;

public class TabbedPaneEx extends JFrame{
	JPanel p1,p2,p3;
	JTextArea ta;
	JTabbedPane tp;
	TabbedPaneEx(){
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		ta=new JTextArea(200,200);
		p1=new JPanel();
		p1.add(ta);
		p2=new JPanel();
		p3=new JPanel();
		tp=new JTabbedPane();
		tp.setBounds(50, 50, 200, 200);
		add(tp);
		tp.add("Main",p1);
		tp.add("Visit",p2);
		tp.add("Help",p3);
	}
	
	public static void main(String[] args)
	{
		new TabbedPaneEx();
	}
}
