import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class StationaryEx extends JFrame implements ItemListener {
	JLabel l1,l2,l3,l4;
	JComboBox products;
	JTextField price,t2,t4;
	JButton b1;
	int p;
	
	StationaryEx(){
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		
		String product[]= {"Pen", "Pencil", "Book", "Eraser", "Sharpener"};
		products =new JComboBox(product);
		products.setBounds(200, 80, 90, 30);
		add(products);
		products.addItemListener((ItemListener) this);
		
		l1=new JLabel("Product : ");
		l1.setBounds(60, 80, 200, 30);
		l1.setForeground(Color.blue);
		add(l1);
		
		l2=new JLabel("Quantity : ");
		l2.setBounds(60, 120, 200, 30);
		l2.setForeground(Color.blue);
		add(l2);
		
		t2=new JTextField();
		t2.setBounds(200, 120, 90, 30);
		add(t2);
		
		l3=new JLabel("Price :");
		l3.setBounds(60, 160, 200, 30);
		l3.setForeground(Color.blue);
		add(l3);
		
		price=new JTextField();
		price.setBounds(200, 160, 90, 30);
		add(price);
		
		l4=new JLabel("Total :");
		l4.setBounds(60, 200, 200, 30);
		l4.setForeground(Color.blue);
		add(l4);
		
		t4=new JTextField();
		t4.setBounds(200, 200, 90, 30);
		add(t4);
		
		b1=new JButton("Buy Now");
		b1.setBounds(100, 260, 90, 30);
		b1.setForeground(Color.green);
		add(b1);
		
		}
    public void itemStateChanged(ItemEvent e)
    {
        int a=products.getSelectedIndex();

        if(a==0)
        {
            p=10;
        }
        else if(a==1)
        {
            p=5;
        } else if (a==2)
        {
        p=50;
        } else if (a==3)
        {
        p=2;
        }
        else
        {
            p=5;
        }
        price.setText(""+p);
        int qty= Integer.parseInt(t2.getText());
        t4.setText(""+p*qty);
    }
	public static void main(String args[]) {
		new StationaryEx();
	}
}
