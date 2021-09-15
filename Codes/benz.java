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

public class benz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					benz frame = new benz();
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
	public benz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 581);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblpleaseSelectA = new JLabel("MERCEDES-BENZ");
		lblpleaseSelectA.setBackground(new Color(102, 204, 255));
		lblpleaseSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblpleaseSelectA.setForeground(Color.RED);
		lblpleaseSelectA.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblpleaseSelectA.setBounds(12, 13, 832, 47);
		contentPane.add(lblpleaseSelectA);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/A .jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(41, 102, 205, 91);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/B.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1.setBounds(57, 341, 189, 88);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/C .jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img3));
		lblNewLabel_2.setBounds(544, 102, 205, 91);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/D .jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img4));
		lblNewLabel_3.setBounds(544, 344, 205, 91);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/E .jpg")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img5));
		lblNewLabel_4.setBounds(301, 223, 205, 88);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("SELECT");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				 car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("benz");
				 car_details.txtRs.setText("C-Class");
				 car_details.txtkm.setText("14KM");
				 car_details.txtkmph.setText("183Kmph");
				 car_details.txtlakhs.setText("56Lakhs");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(94, 206, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SELECT");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("benz");
				 car_details.txtRs.setText("GLS");
				 car_details.txtkm.setText("14KM");
				 car_details.txtkmph.setText("185Kmph");
				 car_details.txtlakhs.setText("78Lakhs");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(94, 442, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SELECT");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("benz");
				 car_details.txtRs.setText("S-Class");
				 car_details.txtkm.setText("32KM");
				 car_details.txtkmph.setText("145Kmph");
				 car_details.txtlakhs.setText("78Lakhs");
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(349, 324, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SELECT");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("benz");
				 car_details.txtRs.setText("GLA");
				 car_details.txtkm.setText("13KM");
				 car_details.txtkmph.setText("190Kmph");
				 car_details.txtlakhs.setText("98Lakhs");
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3.setBounds(600, 206, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("SELECT");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("benzI");
				 car_details.txtRs.setText("E-class");
				 car_details.txtkm.setText("11KM");
				 car_details.txtkmph.setText("145Kmph");
				 car_details.txtlakhs.setText("79Lakhs");
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_4.setBounds(600, 448, 97, 25);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_5 = new JLabel("c-class");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(109, 73, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("GLS");
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5_1.setBounds(135, 324, 56, 16);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("S-Class");
		lblNewLabel_5_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5_2.setBounds(365, 194, 56, 16);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("GLA");
		lblNewLabel_5_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5_3.setBounds(602, 73, 56, 16);
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("E-Class");
		lblNewLabel_5_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5_4.setBounds(600, 315, 56, 16);
		contentPane.add(lblNewLabel_5_4);
		
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
		btnNewButton_5.setBounds(349, 458, 116, 45);
		contentPane.add(btnNewButton_5);
		
	}

}

