package jdbcpack;
import javax.swing.*;

public class Loginpage {
    private JFrame frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Loginpage().createFirstPage());
    }

    // First Page: Employee Login Portal
    private void createFirstPage() {
        frame = new JFrame("Employee Login Portal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Heading Label
        JLabel heading = new JLabel("Employee Login Portal", JLabel.CENTER);
        heading.setBounds(100, 30, 200, 30);
        frame.add(heading);

        // Employee Button
        JButton btnEmployee = new JButton("Employee");
        btnEmployee.setBounds(120, 80, 150, 40);
        btnEmployee.addActionListener(e -> openLoginPage("Employee Login"));
        frame.add(btnEmployee);

        // HR Button
        JButton btnHR = new JButton("HR");
        btnHR.setBounds(120, 140, 150, 40);
        btnHR.addActionListener(e -> openLoginPage("HR Login"));
        frame.add(btnHR);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Second Page: Login Window
    private void openLoginPage(String title) {
        frame.getContentPane().removeAll();
        frame.setTitle(title);
        frame.setLayout(null);

        // Login ID Label
        JLabel lblLogin = new JLabel("Login ID:");
        lblLogin.setBounds(50, 50, 100, 30);
        frame.add(lblLogin);

        // Login ID Text Field
        JTextField txtLogin = new JTextField();
        txtLogin.setBounds(150, 50, 150, 30);
        frame.add(txtLogin);

        // Password Label
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 100, 100, 30);
        frame.add(lblPassword);

        // Password Field
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 100, 150, 30);
        frame.add(txtPassword);

        // Login Button
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 160, 80, 40);
        frame.add(btnLogin);

        // Back Button
        JButton btnBack = new JButton("Back");
        btnBack.setBounds(200, 160, 80, 40);
        btnBack.addActionListener(e -> createFirstPage());
        frame.add(btnBack);

        frame.revalidate();
        frame.repaint();
    }
}
