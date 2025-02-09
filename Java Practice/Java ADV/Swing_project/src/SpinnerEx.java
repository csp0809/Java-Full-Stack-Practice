import javax.swing.*;
import javax.swing.event.*;

public class SpinnerEx extends JFrame implements ChangeListener{
	JLabel l;
	SpinnerEx(){
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		l=new JLabel();
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setSize(250,100);
		add(l);
		
		SpinnerModel s=new SpinnerNumberModel(10,0,20,1);
		JSpinner j=new JSpinner(s);
		j.setBounds(200,200,50,40);
		add(j);
		j.addChangeListener(this);
		
	}
	
	public static void main(String[] args)
	{
		new SpinnerEx();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		// TODO Auto-generated method stub
		l.setText("value: "+((JSpinner)e.getSource()).getValue());
	}
	
}
