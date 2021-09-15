import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class LOGIN extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField password_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN frame = new LOGIN();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LOGIN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 486);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 102, 0));
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ONLINE CAR STORE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel.setBounds(111, 49, 489, 45);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(210, 228, 159, -105);
		contentPane.add(tabbedPane);
		
		JLabel lblNewLabel_1 = new JLabel("UserName:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(31, 185, 110, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(31, 256, 110, 28);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(153, 187, 224, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		String username=textField.getText();
		String password=password_1.getText();
		if(username.equals("raviteja") && password.equals("19022")|| username.equals("bhanu") && password.equals("1234")){
			JOptionPane.showMessageDialog(btnNewButton, "Login succesfully..");
			dispose();
			STORE s = new STORE();
			s.setVisible(true);
			}
		else {
		JOptionPane.showMessageDialog(btnNewButton, "Login unsuccesfull!");	
		}
		}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(33, 346, 169, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewUser = new JButton("New User");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				NEWUSER was = new NEWUSER();
				was.setVisible(true);
			}
		});
		btnNewUser.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewUser.setBounds(472, 346, 169, 45);
		contentPane.add(btnNewUser);
		
		JLabel lblNewLabel_3 = new JLabel("*Please enter UserName and password if existing user or if new user select the new user button below");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(31, 136, 635, 16);
		contentPane.add(lblNewLabel_3);
		
		password_1 = new JPasswordField();
		password_1.setBounds(153, 260, 224, 28);
		contentPane.add(password_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\start (1).jpg"));
		lblNewLabel_4.setBounds(652, 45, 103, 74);
		contentPane.add(lblNewLabel_4);
	}
}
