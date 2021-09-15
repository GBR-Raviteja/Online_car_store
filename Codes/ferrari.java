import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class ferrari extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ferrari frame = new ferrari();
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
	public ferrari() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 613);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblpleaseSelectA = new JLabel("FERRARI");
		lblpleaseSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblpleaseSelectA.setForeground(Color.RED);
		lblpleaseSelectA.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblpleaseSelectA.setBounds(12, 38, 688, 42);
		contentPane.add(lblpleaseSelectA);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\A .jpg"));
		lblNewLabel.setBounds(32, 122, 193, 82);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\4.jpg"));
		lblNewLabel_1.setBounds(55, 369, 170, 82);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\D .jpg"));
		lblNewLabel_2.setBounds(504, 116, 186, 94);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\E .jpg"));
		lblNewLabel_3.setBounds(504, 357, 186, 94);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\C .jpg"));
		lblNewLabel_4.setBounds(274, 224, 186, 94);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("SELECT");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("ferrari");
				 car_details.txtRs.setText("Roma");
				 car_details.txtkm.setText("13KM");
				 car_details.txtkmph.setText("175Kmph");
				 car_details.txtlakhs.setText("73Lakhs");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(90, 217, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SELECT");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("ferrari");
				 car_details.txtRs.setText("SF90");
				 car_details.txtkm.setText("18KM");
				 car_details.txtkmph.setText("165Kmph");
				 car_details.txtlakhs.setText("83Lakhs");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(90, 464, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SELECT");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("ferrari");
				 car_details.txtRs.setText("812");
				 car_details.txtkm.setText("21KM");
				 car_details.txtkmph.setText("160Kmph");
				 car_details.txtlakhs.setText("63Lakhs");
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(321, 331, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SELECT");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("ferrari");
				 car_details.txtRs.setText("GTC4");
				 car_details.txtkm.setText("18KM");
				 car_details.txtkmph.setText("180Kmph");
				 car_details.txtlakhs.setText("89Lakhs");
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3.setBounds(559, 217, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("SELECT");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("ferrari");
				 car_details.txtRs.setText("portofine");
				 car_details.txtkm.setText("16KM");
				 car_details.txtkmph.setText("150Kmph");
				 car_details.txtlakhs.setText("62Lakhs");
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_4.setBounds(559, 464, 97, 25);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_5 = new JLabel("Roma");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(101, 93, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("SF90");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(101, 340, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("812");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_7.setBounds(350, 195, 56, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("GTC4");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8.setBounds(571, 87, 56, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Portofino");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_9.setBounds(571, 328, 85, 16);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton_5 = new JButton("BACK");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				STORE st = new STORE();
				st.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_5.setBounds(316, 482, 116, 45);
		contentPane.add(btnNewButton_5);
	}
}
