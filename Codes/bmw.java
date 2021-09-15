import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class bmw extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmw frame = new bmw();
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
	public bmw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 595);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblpleaseSelectA = new JLabel("BMW");
		lblpleaseSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblpleaseSelectA.setForeground(Color.RED);
		lblpleaseSelectA.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblpleaseSelectA.setBounds(12, 40, 805, 52);
		contentPane.add(lblpleaseSelectA);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\C .jpg"));
		lblNewLabel_1.setBounds(566, 130, 191, 97);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\E .jpg"));
		lblNewLabel_2.setBounds(59, 323, 191, 84);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\D .jpg"));
		lblNewLabel_3.setBounds(572, 323, 185, 84);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\5.jpg"));	
		lblNewLabel_4.setBounds(312, 230, 156, 84);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("SELECT");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("BMW");
				 car_details.txtRs.setText("3 Series");
				 car_details.txtkm.setText("42KM");
				 car_details.txtkmph.setText("189Kmph");
				 car_details.txtlakhs.setText("90Lakhs");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(98, 224, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SELECT");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("BMW");
				 car_details.txtRs.setText("XL");
				 car_details.txtkm.setText("14KM");
				 car_details.txtkmph.setText("195Kmph");
				 car_details.txtlakhs.setText("98Lakhs");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(98, 420, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SELECT");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("BMW");
				 car_details.txtRs.setText("5 Series");
				 car_details.txtkm.setText("23KM");
				 car_details.txtkmph.setText("145Kmph");
				 car_details.txtlakhs.setText("78Lakhs");
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(352, 323, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SELECT");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("BMW");
				 car_details.txtRs.setText("Z4");
				 car_details.txtkm.setText("20KM");
				 car_details.txtkmph.setText("170Kmph");
				 car_details.txtlakhs.setText("98Lakhs");
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3.setBounds(607, 230, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("SELECT");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("BMW");
				 car_details.txtRs.setText("7 Series");
				 car_details.txtkm.setText("24KM");
				 car_details.txtkmph.setText("160Kmph");
				 car_details.txtlakhs.setText("68Lakhs");
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_4.setBounds(607, 420, 97, 25);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_5 = new JLabel("3 Series");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(114, 98, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("XL");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(128, 298, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("5 Series");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_7.setBounds(361, 201, 56, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Z4");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8.setBounds(648, 101, 56, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("7Series");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_9.setBounds(632, 299, 56, 16);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\projects\\sem_2\\DSA project\\images\\3.jpg"));
		lblNewLabel.setBounds(59, 133, 161, 84);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(114, 377, 56, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(361, 266, 56, 16);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(632, 167, 56, 16);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setBounds(632, 358, 56, 16);
		contentPane.add(lblNewLabel_13);
		
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
		btnNewButton_5.setBounds(352, 467, 116, 45);
		contentPane.add(btnNewButton_5);
	}
}

