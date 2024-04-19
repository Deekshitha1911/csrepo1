package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setBounds(193, 23, 100, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 255, 128));
		textField.setBounds(49, 48, 255, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("2");
		btnNewButton.setForeground(new Color(0, 255, 255));
		btnNewButton.setBounds(159, 81, 78, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setForeground(new Color(255, 128, 192));
		btnNewButton_1.setBackground(new Color(0, 0, 255));
		btnNewButton_1.setBounds(49, 81, 78, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.setForeground(new Color(0, 0, 160));
		btnNewButton_2.setBounds(301, 81, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setForeground(new Color(0, 128, 0));
		btnNewButton_3.setBounds(49, 111, 78, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setForeground(new Color(255, 0, 128));
		btnNewButton_4.setBounds(49, 145, 78, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.setForeground(new Color(64, 128, 128));
		btnNewButton_5.setBounds(49, 179, 78, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("4");
		btnNewButton_6.setForeground(new Color(0, 0, 64));
		btnNewButton_6.setBounds(159, 111, 78, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.setForeground(new Color(0, 0, 255));
		btnNewButton_7.setBounds(159, 145, 78, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setForeground(new Color(0, 128, 64));
		btnNewButton_8.setBounds(159, 179, 78, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.setForeground(new Color(255, 0, 255));
		btnNewButton_9.setBounds(301, 115, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("*");
		btnNewButton_10.setForeground(new Color(64, 0, 64));
		btnNewButton_10.setBounds(301, 145, 89, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("/");
		btnNewButton_11.setForeground(new Color(128, 128, 255));
		btnNewButton_11.setBounds(301, 179, 89, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("=");
		btnNewButton_12.setForeground(new Color(128, 128, 0));
		btnNewButton_12.setBounds(301, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("9");
		btnNewButton_13.setForeground(new Color(0, 128, 128));
		btnNewButton_13.setBounds(49, 214, 78, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("0");
		btnNewButton_14.setForeground(new Color(255, 128, 255));
		btnNewButton_14.setBounds(159, 214, 78, 23);
		frame.getContentPane().add(btnNewButton_14);
	}
}
