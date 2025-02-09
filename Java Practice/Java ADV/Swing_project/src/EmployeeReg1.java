import java.awt.*;
import javax.swing.*;



public class EmployeeReg1 extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton submitButton, resetButton, loadImageButton;
   

    public EmployeeReg1() {
        // Set the frame properties
        setTitle("Employee Registration Form");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create and position components
        l1 = new JLabel("Employee ID:");
        l1.setBounds(50, 50, 100, 30);
        t1 = new JTextField();
        t1.setBounds(150, 50, 200, 30);

        l2 = new JLabel("Image Path:");
        l2.setBounds(50, 100, 100, 30);
        t2 = new JTextField();
        t2.setBounds(150, 100, 200, 30);

        l3 = new JLabel("Department:");
        l3.setBounds(50, 150, 100, 30);
        t3 = new JTextField();
        t3.setBounds(150, 150, 200, 30);

        l4 = new JLabel("Email:");
        l4.setBounds(50, 200, 100, 30);
        t4 = new JTextField();
        t4.setBounds(150, 200, 200, 30);

        submitButton = new JButton("Submit");
        submitButton.setBounds(100, 270, 80, 30);
        resetButton = new JButton("Reset");
        resetButton.setBounds(200, 270, 80, 30);
        loadImageButton = new JButton("Load Image");
        loadImageButton.setBounds(400, 100, 120, 30);

        // Add components to the frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(submitButton);
        add(resetButton);
        add(loadImageButton);

        // Add the canvas to the frame
      

        // Add action listeners
        submitButton.addActionListener(e -> {
            String employeeId = t1.getText();
            String name = t2.getText();
            String department = t3.getText();
            String email = t4.getText();
            JOptionPane.showMessageDialog(this, "Employee Registered:\n" +
                    "ID: " + employeeId + "\n" +
                    "Name: " + name + "\n" +
                    "Department: " + department + "\n" +
                    "Email: " + email);
        });

        resetButton.addActionListener(e -> {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            canvas.imagePath = ""; // Clear the image path
            canvas.repaint(); // Clear the image from the canvas
        });

        loadImageButton.addActionListener(e -> {
            String imagePath = t2.getText(); // Get the image path from the text field
            if (!imagePath.isEmpty()) {
                canvas.imagePath = imagePath; // Update the image path in the canvas
                canvas.repaint(); // Repaint the canvas to show the new image
            } else {
                JOptionPane.showMessageDialog(this, "Please provide a valid image path.");
            }
        });

        // Set frame visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeReg1();
    }
}
