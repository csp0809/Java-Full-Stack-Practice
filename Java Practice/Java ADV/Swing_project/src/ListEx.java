import java.awt.event.*;

import javax.swing.*;
public class ListEx extends JFrame implements ActionListener {
	JList<String> list1,list2;
	JLabel l;
	ListEx(){
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		
		l=new JLabel();
		l.setSize(500,100);
		JButton b= new JButton("Show");
		b.setBounds(200,250,80,30);
		
		final DefaultListModel<String>
		l1=new DefaultListModel<>();
		l1.addElement("C");
		l1.addElement("C++");
		l1.addElement("Java");
		l1.addElement("C#");
		
		final DefaultListModel<String>
		l2=new DefaultListModel<>();
		l2.addElement("Javascript");
		l2.addElement("Ruby");
		l2.addElement("Spring");
		l2.addElement("Hibernate");
		
		list2=new JList<>(l2);
		list2.setBounds(100,200,75,75);
		
		add(list1);
		add(list2);
		add(b);
		add(l);
		b.addActionListener(this);
		
	}

	public static void main(String args []) {
		new ListEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String data="";
		if(list1.getSelectedIndex()!=-1) {
			data="Programming laguage selected :"+list1.getSelectedIndex();
			l.setText(data);
			
		}
		if(list2.getSelectedIndex()!=-1) {
			data+=", Framework selected: ";
			for(Object frame : list2.getSelectedValues()) {
				data += frame+ " ";
			}
		}
		l.setText(data);
	}
}
