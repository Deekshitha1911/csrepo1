package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class common {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					common window = new common();
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
	public common() {
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
		
		JLabel lblNewLabel = new JLabel("  MOVIE TICKETS");
		lblNewLabel.setBounds(159, 26, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("  NAME");
		lblNewLabel_1.setBounds(72, 71, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setBounds(72, 125, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TICKETS");
		lblNewLabel_3.setBounds(72, 176, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"tb1", "tb2", "RRR"}));
		comboBox.setBounds(250, 121, 79, 22);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(243, 68, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(243, 173, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String movie=(String) cb1.getSelecteditem();
				String tickets=tb2.getText();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("RRR"))
				{
					bill=bill+150*nt;
				}
				if(movie.equals("KGF"))
				{
					bill=bill+200*nt;
				}
				if(movie.equals("SALAR"))
				{
					bill=bill+250*nt;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "NAME " +name"\n MOVIE"+movie+"\n NUM TICKTS"+tickets+"\n AMOUNT"+bill);
				if(res=YES_OPTION)
				{
					JOptionPane.showConfirmDialog(btnNewButton, "BOOKING CONFIRMED");
				}
				else
				{
					JOptionPane.showConfirmDialog(btnNewButton, "BOOKING CANCELLED");
				}
			}
			
		});
		btnNewButton.setBounds(159, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Toyota-Supra-manual-gearbox-3-Copy.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
