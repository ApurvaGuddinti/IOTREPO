package central;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;

public class book {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					book window = new book();
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
	public book() {
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
		
		JLabel lblNewLabel = new JLabel("BOOKING TICKETS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(115, 11, 162, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(39, 56, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ticname");
		lblNewLabel_2.setBounds(39, 102, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("number of tickets");
		lblNewLabel_3.setBounds(39, 147, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "Family Star", "Salar"}));
		cb1.setBounds(156, 98, 62, 22);
		frame.getContentPane().add(cb1);
		
		tb1 = new JTextField();
		tb1.setBounds(152, 53, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JSpinner sp1 = new JSpinner();
		sp1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		sp1.setBounds(156, 144, 30, 20);
		frame.getContentPane().add(sp1);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name = tb1.getText();
				String movie = (String) cb1.getSelectedItem();
				int ticket = (Integer) sp1.getValue();
				int bill=0;
				if(movie.equals("RRR"))
				{
					bill=bill+ticket*150;
				}
				if(movie.equals("Family Star"))
				{
					bill=bill+ticket*150;
				}
				if(movie.equals("Salar"))
				{
					bill=bill+ticket*150;
				}
	            int res=0;
				res = JOptionPane.showConfirmDialog(btnNewButton,"Name: " +Name+"\nMovie Name: "+movie+"\nNumber of tickets: "+ticket+ "\nTOTAL BILL IS: "+bill );
				if(res == YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CONFIRMED");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CANCELLED");
				}
			}
			
		});
		btnNewButton.setBounds(156, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
