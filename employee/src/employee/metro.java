package employee;

import java.awt.EventQueue;
//fjkdhgu
//jdhuighf

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metro {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
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
		
		JLabel lblNewLabel = new JLabel("METRO APP");
		lblNewLabel.setBounds(175, 26, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(81, 64, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("source");
		lblNewLabel_2.setBounds(81, 102, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("destination");
		lblNewLabel_3.setBounds(81, 140, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("num tickts");
		lblNewLabel_4.setBounds(81, 176, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(211, 61, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox ch2 = new JComboBox();
		ch2.setModel(new DefaultComboBoxModel(new String[] {"JUBLIHILLS", "PAREDGROUND", "LBNAGAR"}));
		ch2.setBounds(211, 136, 86, 22);
		frame.getContentPane().add(ch2);
		
		JComboBox ch1 = new JComboBox();
		ch1.setModel(new DefaultComboBoxModel(new String[] {"AMEERPET", "KUKATPALLY", "NIZAMPET"}));
		ch1.setBounds(211, 98, 86, 22);
		frame.getContentPane().add(ch1);
		
		JComboBox ch3 = new JComboBox();
		ch3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		ch3.setBounds(211, 172, 86, 22);
		frame.getContentPane().add(ch3);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) ch1.getSelectedItem();
				String destination=(String) ch2.getSelectedItem();
				String tickets=(String) ch3.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(source.equals(destination))
				{
					JOptionPane.showMessageDialog(btnNewButton, "please check stations");
				}
				else
				{
					bill=bill+nt*45;
					JOptionPane.showMessageDialog(btnNewButton, "name"+name+"\n source"+source+"\n destination "+destination+"\n bill"+bill);
				}
			}
		});
		btnNewButton.setBounds(150, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Toyota-Supra-manual-gearbox-3-Copy.jpg"));
		lblNewLabel_5.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
