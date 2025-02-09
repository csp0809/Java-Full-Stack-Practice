import javax.swing.*;
public class TableEx extends JFrame{
	
	TableEx()
	{
		setSize(300,400);
		setVisible(true);
		
		String data[][]= {{"101","Git","45000"},{"102","Chaitanya","45000"},{"103","Patil","45000"},{"101","Git","45000"},{"102","Chaitanya","45000"},{"103","Patil","45000"},
				{"101","Git","45000"},{"102","Chaitanya","45000"},{"103","Patil","45000"},{"101","Git","45000"},{"102","Chaitanya","45000"},{"103","Patil","45000"}};
		String column[]= {"ID","NAME","SALARY"};
		JTable t = new JTable(data,column);
		t.setBounds(30,40,200,300);
		
		JScrollPane j = new JScrollPane(t);
		add(j);
		
	}
	public static void main(String args[]) {
		new TableEx();
	}
}
