import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class STORE extends JFrame {

	private JPanel contentPane;
	static public JCheckBox chckbxNewCheckBox;
	static public JCheckBox chckbxNewCheckBox_1;
	static public JCheckBox chckbxNewCheckBox_2;
	static public JCheckBox chckbxNewCheckBox_4;
	static public JCheckBox chckbxNewCheckBox_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STORE frame = new STORE();
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
	public STORE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 635);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELECT A REQUIRE COMPANY ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(12, 33, 610, 80);
		contentPane.add(lblNewLabel);
		
		chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(28, 159, 25, 25);
		contentPane.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(240, 293, 25, 25);
		contentPane.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBounds(28, 422, 25, 25);
		contentPane.add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.setBounds(431, 159, 25, 25);
		contentPane.add(chckbxNewCheckBox_3);
		
		chckbxNewCheckBox_4 = new JCheckBox("");
		chckbxNewCheckBox_4.setBounds(446, 422, 25, 25);
		contentPane.add(chckbxNewCheckBox_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/audi-rings-logo (1).jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(61, 148, 101, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/benz (2).jpg")).getImage();
		lblNewLabel_1_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1_1.setBounds(273, 262, 101, 74);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/BMW (2).jpg")).getImage();
		lblNewLabel_1_2.setIcon(new ImageIcon(img3));
		lblNewLabel_1_2.setBounds(63, 385, 131, 80);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/ferrari (1).jpg")).getImage();
		lblNewLabel_1_3.setIcon(new ImageIcon(img4));
		lblNewLabel_1_3.setBounds(459, 132, 95, 74);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/Suzuki-symbol (1).jpg")).getImage();
		lblNewLabel_1_4.setIcon(new ImageIcon(img5));
		lblNewLabel_1_4.setBounds(479, 397, 75, 60);
		contentPane.add(lblNewLabel_1_4);
		
		
		JButton btnNewButton = new JButton("continue");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					dispose();
					audi a= new audi();
					a.setVisible(true);
				}
				else if(chckbxNewCheckBox_1.isSelected()) {
					dispose();
					benz b= new benz();
					b.setVisible(true);
				}
				else if(chckbxNewCheckBox_2.isSelected()) {
					dispose();
					bmw bm = new bmw();
					bm.setVisible(true);
				}
				else if(chckbxNewCheckBox_4.isSelected()) {
					dispose();
					suzuki s= new suzuki();
					s.setVisible(true);
				}
				else if(chckbxNewCheckBox_3.isSelected()) {
					dispose();
					ferrari f= new ferrari();
					f.setVisible(true);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(245, 495, 173, 60);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("AUDI");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(93, 207, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("FERRARI");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(469, 207, 75, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("BENZ");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(270, 351, 56, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BMW");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(93, 473, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("SUZUKI");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(488, 460, 66, 16);
		contentPane.add(lblNewLabel_6);
	}
}
