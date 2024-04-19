package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class swing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing window = new swing();
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
	public swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().setForeground(new Color(0, 128, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("metro ticket booking");
		lblNewLabel.setBounds(81, 11, 190, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(65, 46, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JFormattedTextField frmtdtxtfldTb = new JFormattedTextField();
		frmtdtxtfldTb.setText("Tb1");
		frmtdtxtfldTb.setBounds(161, 43, 88, 20);
		frame.getContentPane().add(frmtdtxtfldTb);
		
		JLabel lblNewLabel_2 = new JLabel("source");
		lblNewLabel_2.setBounds(65, 79, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select", "srnagar", "ammerpet"}));
		comboBox.setBounds(161, 77, 98, 14);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setBounds(46, 118, 65, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select", "kbhp", "moosapet"}));
		comboBox_1.setBounds(183, 114, 88, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"submit"}));
		comboBox_2.setBounds(109, 154, 82, 34);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\image.3.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("number of ticket");
		lblNewLabel_5.setBounds(56, 143, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("no.of ticket");
		lblNewLabel_6.setBounds(56, 143, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("num. of tickets");
		lblNewLabel_7.setBounds(46, 158, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(65, 143, 46, 14);
		frame.getContentPane().add(lblNewLabel_8);
	}
}
