package central;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class REGFORM {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGFORM window = new REGFORM();
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
	public REGFORM() {
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
		
		JLabel lblNewLabel = new JLabel("Student registration form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(141, 11, 171, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLLNO:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(68, 52, 89, 14);
		frame.getContentPane().add(lblNewLabel_1);
		tb1 = new JTextField();
		tb1.setBounds(167, 49, 145, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("NAME:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(78, 77, 79, 14);
		frame.getContentPane().add(lblNewLabel_2);
		tb2 = new JTextField();
		tb2.setBounds(167, 74, 145, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(68, 113, 89, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(64, 148, 97, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PROGRAMMING LANG:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 185, 137, 30);
		frame.getContentPane().add(lblNewLabel_5);

		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "IOT", "IT", "DS", "CSC"}));
		cb1.setBounds(167, 109, 145, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("male");
		r1.setBounds(163, 144, 79, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("female");
		r2.setBounds(259, 144, 109, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("C ");
		c1.setHorizontalAlignment(SwingConstants.CENTER);
		c1.setBounds(152, 189, 54, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("Java ");
		c2.setHorizontalAlignment(SwingConstants.CENTER);
		c2.setBounds(220, 189, 97, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("Python ");
		c3.setHorizontalAlignment(SwingConstants.CENTER);
		c3.setBounds(302, 189, 97, 23);
		frame.getContentPane().add(c3);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rollno=tb1.getText();
				String name=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String Gender=" ";
				String proglang=" ";
				if(r1.isSelected())
				{
					Gender="male";
				}
				if(r2.isSelected())
				{
					Gender="female";
				}
				if(c1.isSelected())
				{
					proglang=proglang+"C";
				}
				if(c2.isSelected())
				{
					proglang=proglang+"Java";
				}
				if(c3.isSelected())
				{
					proglang=proglang+"Python";
				}
				JOptionPane.showMessageDialog(btnNewButton, "ROLLNO: "+rollno+"\nNAME: "+name+"\nBRANCH: "+branch+"\nGENDER: "+ Gender +"\nPROGLANG: "+ proglang);
			
			}
		});
		btnNewButton.setBounds(180, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
