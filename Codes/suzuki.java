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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class suzuki extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					suzuki frame = new suzuki();
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
	public suzuki() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 562);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblpleaseSelectA = new JLabel("SUZUKI");
		lblpleaseSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblpleaseSelectA.setForeground(Color.RED);
		lblpleaseSelectA.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblpleaseSelectA.setBounds(12, 13, 647, 29);
		contentPane.add(lblpleaseSelectA);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\1.jpg"));
		lblNewLabel.setBounds(36, 84, 161, 79);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\2.jpg"));
		lblNewLabel_1.setBounds(43, 323, 173, 93);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\D .jpg"));
		lblNewLabel_2.setBounds(506, 84, 189, 93);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\A .jpg"));
		lblNewLabel_3.setBounds(506, 323, 189, 93);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\E .jpg"));
		lblNewLabel_4.setBounds(270, 204, 189, 93);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("SELECT");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				 car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("suzuki");
				 car_details.txtRs.setText("baleno");
				 car_details.txtkm.setText("29KM");
				 car_details.txtkmph.setText("145Kmph");
				 car_details.txtlakhs.setText("47Lakhs");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(68, 173, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SELECT");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("suzuki");
				 car_details.txtRs.setText("swift");
				 car_details.txtkm.setText("32KM");
				 car_details.txtkmph.setText("140Kmph");
				 car_details.txtlakhs.setText("38Lakhs");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(80, 429, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SELECT");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("suzuki");
				 car_details.txtRs.setText("dzire");
				 car_details.txtkm.setText("25KM");
				 car_details.txtkmph.setText("155Kmph");
				 car_details.txtlakhs.setText("37Lakhs");
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(317, 310, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SELECT");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("suzuki");
				 car_details.txtRs.setText("Alto");
				 car_details.txtkm.setText("24KM");
				 car_details.txtkmph.setText("130Kmph");
				 car_details.txtlakhs.setText("59Lakhs");
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3.setBounds(562, 190, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("SELECT");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("suzuki");
				 car_details.txtRs.setText("presso");
				 car_details.txtkm.setText("32KM");
				 car_details.txtkmph.setText("160Kmph");
				 car_details.txtlakhs.setText("52Lakhs");
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_4.setBounds(562, 429, 97, 25);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(97, 55, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("swift");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(109, 294, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Dzire");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_7.setBounds(334, 175, 56, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Alto");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8.setBounds(582, 55, 56, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Presso");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_9.setBounds(582, 294, 56, 16);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblBaleno = new JLabel("Baleno");
		lblBaleno.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBaleno.setBounds(86, 55, 67, 16);
		contentPane.add(lblBaleno);
		
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
		btnNewButton_5.setBounds(306, 438, 116, 45);
		contentPane.add(btnNewButton_5);
	}
}
