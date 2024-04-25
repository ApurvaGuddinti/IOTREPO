package central;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LOGINPAGE {

	private JFrame frame;
	private JPasswordField p1;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINPAGE window = new LOGINPAGE();
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
	public LOGINPAGE() {
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
		
		JLabel pro = new JLabel("USERNAME");
		pro.setForeground(new Color(0, 0, 0));
		pro.setBackground(new Color(255, 255, 255));
		pro.setFont(new Font("Tahoma", Font.BOLD, 12));
		pro.setBounds(62, 67, 76, 14);
		frame.getContentPane().add(pro);
		
		JLabel pr = new JLabel("PASSWORD");
		pr.setForeground(new Color(0, 0, 0));
		pr.setFont(new Font("Tahoma", Font.BOLD, 12));
		pr.setBounds(62, 116, 110, 14);
		frame.getContentPane().add(pr);
		p1 = new JPasswordField();
		p1.setBounds(181, 114, 159, 20);
		frame.getContentPane().add(p1);
		
		JLabel lblNewLabel_2 = new JLabel("LOGINPAGE");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(166, 11, 101, 14);
		frame.getContentPane().add(lblNewLabel_2);
		tb1 = new JTextField();
		tb1.setBounds(181, 65, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String pwd=p1.getText();
				if(name.equals("raju") && pwd.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Valid user");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid user");
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(166, 184, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
	}
}
