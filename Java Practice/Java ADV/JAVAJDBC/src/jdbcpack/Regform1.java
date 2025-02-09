package jdbcpack;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Regform1 extends JFrame {

    JLabel l0, l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton insert, update, delete, fetch, reset, showAll;
    JTable table;
    DefaultTableModel model;
    JScrollPane scrollPane;
    Connection con;

    public Regform1() {
        setTitle("Employee Registration Form");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        l0 = new JLabel("Registration Form");
        l0.setBounds(150, 10, 200, 30);
        l1 = new JLabel("Employee ID:");
        l1.setBounds(50, 50, 100, 30);
        t1 = new JTextField();
        t1.setBounds(150, 50, 200, 30);

        l2 = new JLabel("Name:");
        l2.setBounds(50, 100, 100, 30);
        t2 = new JTextField();
        t2.setBounds(150, 100, 200, 30);

        l3 = new JLabel("Department:");
        l3.setBounds(50, 150, 100, 30);
        t3 = new JTextField();
        t3.setBounds(150, 150, 200, 30);

        l4 = new JLabel("Salary:");
        l4.setBounds(50, 200, 100, 30);
        t4 = new JTextField();
        t4.setBounds(150, 200, 200, 30);

        insert = new JButton("Insert");
        insert.setBounds(50, 270, 80, 30);
        update = new JButton("Update");
        update.setBounds(140, 270, 80, 30);
        delete = new JButton("Delete");
        delete.setBounds(230, 270, 80, 30);
        fetch = new JButton("Fetch");
        fetch.setBounds(320, 270, 80, 30);
        reset = new JButton("Reset");
        reset.setBounds(410, 270, 80, 30);
        showAll = new JButton("Show All");
        showAll.setBounds(500, 270, 100, 30);

    }

    public static void main(String[] args) {
        new Regform1();
    }
}
