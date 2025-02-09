package jdbcpack;

import java.awt.Font;
import javax.swing.*;

public class EmpManage extends JFrame {
    JLabel l0;

    public EmpManage() {
        setTitle("Employee Login");
        setSize(550, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Heading Label
        l0 = new JLabel("Welcome To Employee Management System");
        l0.setBounds(50, 200, 500, 30);
        l0.setFont(new Font("Arial", Font.BOLD, 20));
        add(l0);

        setVisible(true);

        
        new Thread(() -> {
            try {
                Thread.sleep(3000); 
                SwingUtilities.invokeLater(this::openNextPage); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    
    private void openNextPage() {
        dispose();
        new Login();
    }

    public static void main(String[] args) {
        new EmpManage();
    }
}
