import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class car_details extends JFrame {

	private JPanel contentPane;
	static public JTextField txtAudi;
	static public JTextField txtRs;
	static public JTextField txtkm;
	static public JTextField txtkmph;
	static public JTextField txtlakhs;
	
	public String company;
	public String model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					car_details frame = new car_details();
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
	
	public car_details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 525);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCompany = new JLabel("COMPANY NAME:");
		lblCompany.setBackground(Color.RED);
		lblCompany.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCompany.setBounds(40, 87, 166, 16);
		contentPane.add(lblCompany);
		
		JLabel lblNewLabel = new JLabel("MODEL NO:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(40, 136, 139, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblMileage = new JLabel("MILEAGE:");
		lblMileage.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMileage.setBounds(40, 185, 98, 16);
		contentPane.add(lblMileage);
		
		JLabel lblNewLabel_1 = new JLabel("SPEED:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(40, 228, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("COLOUR:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(40, 311, 98, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("COST:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(40, 272, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("NEXT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    dispose();
			   customer_Details cd = new customer_Details();
			   cd.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(561, 384, 166, 45);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("RED");
		comboBox.addItem("BLUE");
		comboBox.addItem("BLACK");
		comboBox.addItem("WHITE");
		comboBox.setBounds(201, 309, 108, 22);
		contentPane.add(comboBox);
		
		JLabel label = new JLabel("");
		label.setBounds(201, 311, 56, 16);
		contentPane.add(label);
		
		txtAudi = new JTextField();
		txtAudi.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtAudi.setText("AUDI");
		txtAudi.setBounds(201, 85, 116, 22);
		contentPane.add(txtAudi);
		txtAudi.setColumns(10);
		
		txtRs = new JTextField();
		txtRs.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtRs.setText("RS7");
		txtRs.setBounds(201, 134, 116, 22);
		contentPane.add(txtRs);
		txtRs.setColumns(10);
		
		txtkm = new JTextField();
		txtkm.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtkm.setText("21KM");
		txtkm.setBounds(201, 183, 116, 22);
		contentPane.add(txtkm);
		txtkm.setColumns(10);
		
		txtkmph = new JTextField();
		txtkmph.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtkmph.setText("165Kmph");
		txtkmph.setBounds(201, 226, 116, 22);
		contentPane.add(txtkmph);
		txtkmph.setColumns(10);
		
		txtlakhs = new JTextField();
		txtlakhs.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtlakhs.setText("48Lakhs");
		txtlakhs.setBounds(201, 270, 116, 22);
		contentPane.add(txtlakhs);
		txtlakhs.setColumns(10);
		
		JLabel lblCarSpecificationslabel = new JLabel("car specifications");
		lblCarSpecificationslabel.setBackground(new Color(0, 255, 0));
		lblCarSpecificationslabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarSpecificationslabel.setForeground(new Color(255, 0, 0));
		lblCarSpecificationslabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblCarSpecificationslabel.setBounds(255, 23, 289, 51);
		contentPane.add(lblCarSpecificationslabel);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\\\projects\\\\sem_2\\\\DSA project\\\\images\\s.jpg"));
		lblNewLabel_4.setBounds(625, 36, 62, 67);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(STORE.chckbxNewCheckBox.isSelected()) {
					dispose();
					audi a = new audi();
					a.setVisible(true);
		
				}
				else if(STORE.chckbxNewCheckBox_1.isSelected()) {
					dispose();
					benz b = new benz();
					b.setVisible(true);
		
				}
				else if(STORE.chckbxNewCheckBox_2.isSelected()) {
					dispose();
					bmw b = new bmw();
					b.setVisible(true);
		
				}
				else if(STORE.chckbxNewCheckBox_3.isSelected()) {
					dispose();
					ferrari b = new ferrari();
					b.setVisible(true);
		
				}		else if(STORE.chckbxNewCheckBox_4.isSelected()) {
					dispose();
					suzuki b = new suzuki();
					b.setVisible(true);
		
				}
			}
		});
		btnNewButton.setToolTipText("BACK");
		btnNewButton.setBounds(40, 384, 139, 45);
		contentPane.add(btnNewButton);
		
		company= txtAudi.getText();
		model= txtRs.getText();
	}
}
