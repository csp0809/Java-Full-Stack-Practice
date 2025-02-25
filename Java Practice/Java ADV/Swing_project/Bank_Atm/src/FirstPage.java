import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class FirstPage extends JFrame implements ActionListener {

public SaveData dataclass = new SaveData();

    JButton submit;
    JTextField NT;
    JTextField BT;
    JTextField AT;
    JTextField BLT;
    JLabel l1,l2,l3,l4,status;



    boolean secondpage = false;
    public FirstPage() {
        this.setTitle("Key Listener Example");
        this.setSize(1000, 1000);
        this.setLayout((LayoutManager)null);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);


        this.submit = new JButton("SUBMIT");
        this.submit.setBounds(300, 600, 100, 50);
        this.submit.setBackground(Color.black);
        this.submit.setForeground(Color.white);
        this.add(this.submit);
        
        l1 = new JLabel("Enter name :");
        l1.setBounds(200,100,80,30);
        add(l1);
        this.NT = new JTextField("");
        this.NT.setBounds(350, 100, 200, 50);
        this.add(this.NT);
        l2 = new JLabel("Enter Balance :");
        l2.setBounds(200,200,130,30);
        add(l2);
        this.BLT = new JTextField("");
        this.BLT.setBounds(350, 200, 200, 50);
        this.add(this.BLT);
        l3 = new JLabel("Enter Bank name :");
        l3.setBounds(200,300,130,30);
        add(l3);
        this.BT = new JTextField("");
        this.BT.setBounds(350, 300, 200, 50);
        this.add(this.BT);
        l4 = new JLabel("Enter Account no. :");
        l4.setBounds(200,400,130,30);
        add(l4);

        status = new JLabel("");
        status.setBounds(200,500,500,30);
        status.setForeground(Color.cyan);
        status.setFont(new Font("Arial",Font.BOLD, 30));
        add(status);

        this.AT = new JTextField("");
        this.AT.setBounds(350, 400, 200, 50);
        this.add(this.AT);
        this.submit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.submit) {
            int accountnum = Integer.parseInt(this.AT.getText());
            int balance = Integer.parseInt(this.BLT.getText());
            String bankname = this.BT.getText();
            String username = this.NT.getText();
            System.out.println(accountnum);
            System.out.println(balance);
            System.out.println(bankname);
            System.out.println(username);

           dataclass.users.add(new userinput(username, bankname, balance,accountnum));
           dataclass.displayalldata();
           status.setText("Data submited : " + username);



	if(secondpage){
		System.out.println("second page");

		}

	else{
		secondpage= true;
		new SecondPage(dataclass);
		}


	dataclass.appendingcustomer(dataclass.users);
        }

    }

    public static void main(String[] args) {
        new FirstPage();
    }
}
