import javax.swing.*;    
import java.awt.event.*;   
public class MenuEx implements ActionListener {
	JFrame f;
	JMenuBar mb;
	JMenu file,edit,help;
	JMenuItem cut,copy,paste,selectAll;
	JTextArea ta;
	MenuEx(){
		f=new JFrame();
		mb=new JMenuBar();
		file=new JMenu("File");
		edit=new JMenu("Edit");
		help=new JMenu("Help");
		
		cut=new JMenuItem("cut");
		copy=new JMenuItem("copy");
		paste=new JMenuItem("paste");
		selectAll=new JMenuItem("selectAll");
		
		file.add(cut);
		file.add(copy);
		file.add(paste);
		file.add(selectAll);
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		
		ta=new JTextArea();
		ta.setBounds(5,5,1150,320);
		
		f.add(mb);
		f.add(ta);
		f.setJMenuBar(mb);
		
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		
	}	
	public void actionPerfromed(ActionEvent e)
	{
		if(e.getSource()==cut)
			ta.cut();
		if(e.getSource()==cut)
			ta.paste();
		if(e.getSource()==cut)
			ta.copy();
		if(e.getSource()==cut)
			ta.selectAll();
		
	}
	public static void main(String args []) {
		new MenuEx();
	}
}
