import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Locale;

public class SecondPage extends JFrame implements ActionListener {

    JTextField n1,amt;
    JRadioButton wrb,drb;
    ButtonGroup bg;
    JButton sbt;

    SaveData a;
JLabel l1, l2;
JLabel names,acnums,balances;

    SecondPage(SaveData d){

this.a = d;
        setSize(500,500);
        setVisible(true);
        setTitle("ATM");
        setLayout(null);

        System.out.println("this is from page 2");
        d.displayalldata();


        names= new JLabel("");
        names.setBounds(400,100,400,50);
        add(names);
        names.setForeground(Color.blue);
        names.setFont(new Font("Arial",Font.BOLD, 25));

        acnums= new JLabel("");
        acnums.setBounds(400,200,400,50);
        acnums.setForeground(Color.blue);
        acnums.setFont(new Font("Arial",Font.BOLD, 25));
        add(acnums);


        balances= new JLabel("");
        balances.setBounds(400,300,400,50);
        balances.setForeground(Color.blue);
        balances.setFont(new Font("Arial",Font.BOLD, 25));
        add(balances);

        l1= new JLabel("Name :");
        l1.setBounds(30,100,150,50);
        add(l1);


        l2= new JLabel("Amout :");
        l2.setBounds(30,200,150,50);
        add(l2);


        n1 = new JTextField("");
        n1.setBounds(100, 100, 200, 50);
        add(n1);
        amt = new JTextField("");
        amt.setBounds(100, 200, 200, 50);
        add(amt);

        wrb = new JRadioButton("Witdraw");
        wrb.setBounds(50,300,80,30);
        drb = new JRadioButton("Diposit");
        drb.setBounds(180,300,80,30);
        bg = new ButtonGroup();
        bg.add(wrb);
        bg.add(drb);
        add(wrb);
        add(drb);


        sbt = new JButton("SUBMIT");
        sbt.setBounds(30, 400, 200, 50);
        add(sbt);



        sbt.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sbt){
             if(wrb.isSelected()){
                 String username = n1.getText().toLowerCase(Locale.ROOT);
                 int amout =Integer.parseInt(amt.getText());

                 a.widraw(username,amout);

                 System.out.println("widraw");

                 names.setText("Name :" +a.displaycurentname());
                 acnums.setText(  "Account no.:"+ a.displaycurrentaccount());
                 balances.setText("Current balance :"+a.displaycurrentbalance());


             }

             else if (drb.isSelected()){
                 String username = n1.getText().toLowerCase(Locale.ROOT);
                 int amout =Integer.parseInt(amt.getText());
                 a.depositfunc(username,amout);
                 System.out.println("deposit");

                 names.setText(a.displaycurentname());
                 acnums.setText(""+a.displaycurrentaccount());
                 balances.setText(""+a.displaycurrentbalance());

                 names.setText("Name :" +a.displaycurentname());
                 acnums.setText(  "Account no.:"+ a.displaycurrentaccount());
                 balances.setText("Current balance :"+a.displaycurrentbalance());
             }

             else{
                 System.out.println("Please select a opotion");
                 
             }
        }
    }
}
