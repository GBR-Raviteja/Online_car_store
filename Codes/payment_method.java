import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class payment_method extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment_method frame = new payment_method();
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
	//linked list
	static  LinkedList<linkedlist> itemspreview = new LinkedList<linkedlist>(); 
	public payment_method() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(102, 204, 255));
		tabbedPane.setBounds(28, 69, 625, 288);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 255));
		tabbedPane.addTab("debit/Credit card", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNameOnCard = new JLabel("NAME ON CARD:");
		lblNameOnCard.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNameOnCard.setBounds(12, 37, 144, 16);
		panel.add(lblNameOnCard);
		
		JLabel lblCardNumber = new JLabel("CARD NUMBER:");
		lblCardNumber.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCardNumber.setBounds(12, 73, 144, 16);
		panel.add(lblCardNumber);
		
		JLabel label = new JLabel("");
		label.setBounds(12, 116, 56, 16);
		panel.add(label);
		
		textField = new JTextField();
		textField.setBounds(168, 35, 226, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(168, 71, 226, 22);
		panel.add(textField_1);
		
		JLabel lblExpiryMonth = new JLabel("EXPIRY MONTH:");
		lblExpiryMonth.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblExpiryMonth.setBounds(12, 116, 144, 22);
		panel.add(lblExpiryMonth);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("01");
		comboBox.addItem("02");
		comboBox.addItem("03");
		comboBox.addItem("04");
		comboBox.addItem("05");
		comboBox.addItem("06");
		comboBox.addItem("07");
		comboBox.addItem("08");
		comboBox.addItem("09");
		comboBox.addItem("10");
		comboBox.addItem("11");
		comboBox.addItem("12");
		comboBox.setBounds(168, 116, 98, 22);
		panel.add(comboBox);
		
		JLabel lblExpiryYear = new JLabel("EXPIRY YEAR:");
		lblExpiryYear.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblExpiryYear.setBounds(318, 116, 144, 22);
		panel.add(lblExpiryYear);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  dispose();
				  customer_Details cd = new customer_Details();
				  cd.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(12, 213, 97, 32);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("ORDER DETAILS");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				itemspreview.add(new linkedlist(customer_Details.textField_1.getText(),customer_Details.textField_2.getText(),customer_Details.textField_3.getText(),car_details.txtAudi.getText(),car_details.txtRs.getText()));
				  dispose();
				  order_details cd = new order_details();
				  cd.setVisible(true);

				  
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(443, 215, 165, 28);
		panel.add(btnNewButton_1_1);
		
		JLabel lblCvv = new JLabel("CVV:");
		lblCvv.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCvv.setBounds(12, 167, 56, 16);
		panel.add(lblCvv);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(168, 165, 104, 22);
		panel.add(passwordField);
		
		textField_3 = new JTextField();
		textField_3.setBounds(443, 117, 116, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 204, 255));
		tabbedPane.addTab("cash on delivery", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblEl = new JLabel("ENTER PINCODE:");
		lblEl.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEl.setBounds(12, 61, 175, 16);
		panel_2.add(lblEl);
		
		textField_2 = new JTextField();
		textField_2.setBounds(182, 59, 202, 22);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  dispose();
				  customer_Details cd = new customer_Details();
				  cd.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(37, 174, 97, 32);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ORDER DETAILS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemspreview.add(new linkedlist(customer_Details.textField_1.getText(),customer_Details.textField_2.getText(),customer_Details.textField_3.getText(),car_details.txtAudi.getText(),car_details.txtRs.getText()));
				dispose();
				order_details od = new order_details();
				od.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(424, 178, 165, 28);
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Select the payment method");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(28, 13, 625, 47);
		contentPane.add(lblNewLabel);
	}
}
