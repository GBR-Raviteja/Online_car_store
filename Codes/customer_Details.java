import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class customer_Details extends JFrame {

	private JPanel contentPane;
	static public JTextField textField;
	static public JTextField textField_1;
	static public JTextField textField_2;
	static public  JTextField textField_3;
	static public JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public String name;
	public String mobile;
	public String email;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_Details frame = new customer_Details();
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
	public customer_Details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 578);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setForeground(new Color(0, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblpleaseEnterThe = new JLabel("CUSTOMER DETAILS");
		lblpleaseEnterThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblpleaseEnterThe.setForeground(Color.RED);
		lblpleaseEnterThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblpleaseEnterThe.setBounds(51, 27, 528, 51);
		contentPane.add(lblpleaseEnterThe);
		
		JLabel lblNewLabel = new JLabel("NAME:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(23, 109, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MOBILE NO:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(23, 161, 98, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL ID:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(23, 219, 80, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("ADDRESS:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(23, 319, 87, 16);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(198, 319, 300, 61);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(198, 107, 300, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(198, 159, 300, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(198, 217, 300, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\DETAILS.jpg"));
		lblNewLabel_3.setBounds(591, 27, 72, 66);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				  dispose();
				  car_details cd = new car_details();
				   cd.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(51, 427, 116, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("NEXT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 dispose();
				   payment_method cd = new payment_method();
				   cd.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(532, 427, 107, 45);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("PINCODE:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(23, 271, 87, 16);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(198, 269, 300, 22);
		
		contentPane.add(textField_4);
		name=textField_1.getText();
		mobile=textField_2.getText();
	    email=textField_3.getText();
		
	}
}
