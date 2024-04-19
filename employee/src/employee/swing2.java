package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import java.awt.Font;

public class swing2 {
	int items=0;
	int total=0;
	
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					swing2 window = new swing2();
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
	public swing2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 489, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				total=total+500;
				tb1.setText(""+items);
				tb2.setText(""+total);
			
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\image.6.jpg"));
		btnNewButton.setBounds(28, 126, 96, 144);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\image.7.png"));
		btnNewButton_1.setBounds(134, 126, 89, 144);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\PIC5.PNG"));
		btnNewButton_2.setBounds(241, 126, 109, 144);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("BOOK STORE APPLICATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(79, 11, 250, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ITEMS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(123, 36, 64, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JFormattedTextField tb1 = new JFormattedTextField();
		tb1.setBounds(197, 36, 63, 14);
		frame.getContentPane().add(tb1);
		
		JLabel lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(123, 64, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JFormattedTextField tb2 = new JFormattedTextField();
		tb2.setBounds(197, 64, 63, 14);
		frame.getContentPane().add(tb2);
		
		JLabel lblNewLabel_3 = new JLabel("Rs:500/-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_3.setBounds(50, 304, 57, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rs:450/-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_4.setBounds(163, 304, 64, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS:150/-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_5.setBounds(277, 304, 64, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\image.9.jpg.crdownload"));
		lblNewLabel_6.setBounds(0, 0, 473, 353);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
