package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton convertB = new JButton();
	JTextField textfield = new JTextField(20);

	public static void main(String[] args) {
		BinaryConverter b = new BinaryConverter();
		b.CreateUI();

	}

	// public BinaryConverter() {
	// frame.add(panel);
	// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// frame.setTitle("Convert 8 bits of binary to ASCII");
	// panel.add(textfield);
	// panel.add(convertB);
	// label.setText(" ");
	// panel.add(label);
	// convertB.setText("convert");
	// frame.setVisible(true);
	// frame.pack();
	//
	// convertB.addActionListener(this);
	// }

	public void CreateUI() {
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Convert 8 bits of binary to ASCII");
		panel.add(textfield);
		panel.add(convertB);
		label.setText("     ");
		panel.add(label);
		convertB.setText("convert");
		frame.setVisible(true);
		frame.pack();

		convertB.addActionListener(this);
	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label.setText(convert(textfield.getText()));
	}

}
