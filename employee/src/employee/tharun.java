package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tharun {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tharun window = new tharun();
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
	public tharun() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 424, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setForeground(new Color(0, 64, 0));
		lblNewLabel.setBounds(135, 11, 133, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(255, 128, 64));
		lblNewLabel_1.setBounds(92, 60, 42, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setForeground(new Color(255, 128, 64));
		lblNewLabel_2.setBounds(71, 115, 63, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(211, 57, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("SUBMIT");
		tglbtnNewToggleButton.setBounds(168, 227, 100, 0);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "BAHUBALI", "SEETHA RAMAM", "SAAHOO"}));
		cb1.setBounds(211, 111, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox Cb2 = new JComboBox();
		Cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5"}));
		Cb2.setBounds(211, 163, 86, 22);
		frame.getContentPane().add(Cb2);
		
		JLabel lblNewLabel_3 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_3.setForeground(new Color(255, 128, 64));
		lblNewLabel_3.setBounds(42, 167, 121, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill=0;
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) Cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				if(movie.equals("BAHUBALI"))
				{
					bill=bill+nt*150;
				}
				if(movie.equals("SEETHA RAMAM"))
				{
					bill=bill+nt*200;
				}
				if(movie.equals("SAAHOO"))
				}
			        bill=bill+nt*250;
		         }
		         JOptionPane.showmessageDialog(btnNewButton, "Name :"+name+ 
		        		 "\n Movie Name : "Movie+"\n Number of Tickets:"
		        		 +nt+"\n Amount :"+bill);
		});
		btnNewButton_1.setForeground(new Color(255, 128, 64));
		btnNewButton_1.setBounds(135, 226, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\image 3.jpg"));
		lblNewLabel_4.setBounds(0, 0, 408, 272);
		frame.getContentPane().add(lblNewLabel_4);
		
		
	}
}
