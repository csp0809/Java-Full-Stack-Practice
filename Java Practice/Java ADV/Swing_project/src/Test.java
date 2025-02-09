import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    // Create questions and options
    String[] questions = {
        "Which keyword is used for accessing the features of a package?",
        "In java, jar stands for_____.",
        "How many threads can be executed at a time?",
        "If a thread goes to sleep",
        "Number of primitive data types in Java are?"
    };

    String[][] options = {
        {"package", "import", "extends", "export"},
        {"Java Archive Runner"
        , "Java Application Resource", "Java Application Runner", "None of the above"},
        {"Only one thread", "Multiple threads", "Only main (main() method) thread", "Two threads"},
        {"It releases all the locks it has.","It does not release any locks.","It releases half of its locks.","It releases all of its lock except one."},
        {"6","7","8","9"}
    };

    int[] answers = {1, 3, 1, 1, 2}; // Correct answer indices (0-based)

    // GUI components
    JFrame frame;
    JPanel panel;
    JLabel questionLabel;
    JRadioButton[] optionButtons;
    ButtonGroup buttonGroup;
    JButton submitButton;
    int currentQuestion = 0;
    int score = 0;

    public Test() {
        frame = new JFrame("MCQ Quiz");
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        questionLabel = new JLabel(questions[currentQuestion]);
        panel.add(questionLabel);

        optionButtons = new JRadioButton[4];
        buttonGroup = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JRadioButton(options[currentQuestion][i]);
            buttonGroup.add(optionButtons[i]);
            panel.add(optionButtons[i]);
        }

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitActionListener());
        panel.add(submitButton);

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Action listener for submit button
    class SubmitActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Check answer
            for (int i = 0; i < 4; i++) {
                if (optionButtons[i].isSelected() && i == answers[currentQuestion]) {
                    score++;
                }
            }

            // Move to next question or show result
            currentQuestion++;
            if (currentQuestion < questions.length) {
                questionLabel.setText(questions[currentQuestion]);
                for (int i = 0; i < 4; i++) {
                    optionButtons[i].setText(options[currentQuestion][i]);
                    optionButtons[i].setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Quiz completed! Your score: " + score + "/" + questions.length);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Test::new);
    }
}