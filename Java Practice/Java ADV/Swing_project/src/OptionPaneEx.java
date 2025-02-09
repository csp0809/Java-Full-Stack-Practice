import javax.swing.*;
public class OptionPaneEx extends JFrame{
	JFrame f;
	OptionPaneEx()
	{
		JOptionPane.showMessageDialog(f, "Successfully updated!!","Alert",JOptionPane.WARNING_MESSAGE);
	}

	public static void main(String[] args) {
		new OptionPaneEx();
	}
}