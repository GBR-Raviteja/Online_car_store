import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class audi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					audi frame = new audi();
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
	public audi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 579);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblpleaseSelectA = new JLabel("AUDI");
		lblpleaseSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblpleaseSelectA.setForeground(Color.RED);
		lblpleaseSelectA.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblpleaseSelectA.setBounds(12, 13, 766, 49);
		contentPane.add(lblpleaseSelectA);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/1.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(35, 97, 166, 79);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/2.jpg")).getImage();
		lblNewLabel_1_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1_1.setBounds(35, 321, 166, 87);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/3.jpg")).getImage();
		lblNewLabel_1_2.setIcon(new ImageIcon(img3));
		lblNewLabel_1_2.setBounds(543, 97, 157, 84);
		contentPane.add(lblNewLabel_1_2);
		
		
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/4.jpg")).getImage();
		lblNewLabel_1_3.setIcon(new ImageIcon(img4));
		lblNewLabel_1_3.setBounds(543, 321, 157, 87);;
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/5.jpg")).getImage();
		lblNewLabel_1_4.setIcon(new ImageIcon(img5));
		lblNewLabel_1_4.setBounds(285, 191, 157, 87);
		contentPane.add(lblNewLabel_1_4);
		
		JButton btnNewButton = new JButton("SELECT");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("AUDI");
				 car_details.txtRs.setText("RS7");
				 car_details.txtkm.setText("21KM");
				 car_details.txtkmph.setText("165Kmph");
				 car_details.txtlakhs.setText("48Lakhs");
				 
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			 			}
			
		});
		btnNewButton.setBounds(64, 189, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnSelect = new JButton("SELECT");
		btnSelect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();				
				 car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("AUDI");
				 car_details.txtRs.setText("A6");
				 car_details.txtkm.setText("19KM");
				 car_details.txtkmph.setText("200Kmph");
				 car_details.txtlakhs.setText("98Lakhs");
				 
			}
		});
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSelect.setBounds(64, 424, 97, 25);
		contentPane.add(btnSelect);
		
		JButton btnNewButton_1 = new JButton("SELECT");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("AUDI");
				 car_details.txtRs.setText("A8L");
				 car_details.txtkm.setText("16KM");
				 car_details.txtkmph.setText("150Kmph");
				 car_details.txtlakhs.setText("32Lakhs");
			}
		});
		btnNewButton_1.setBounds(321, 291, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SELECT");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("AUDI");
				 car_details.txtRs.setText("Q8");
				 car_details.txtkm.setText("26KM");
				 car_details.txtkmph.setText("170Kmph");
				 car_details.txtlakhs.setText("26Lakhs");
			}
		});
		btnNewButton_2.setBounds(584, 194, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SELECT");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				car_details a1 = new car_details();
				 a1.setVisible(true);
				 car_details.txtAudi.setText("AUDI");
				 car_details.txtRs.setText("e-tone");
				 car_details.txtkm.setText("31KM");
				 car_details.txtkmph.setText("170Kmph");
				 car_details.txtlakhs.setText("68Lakhs");
			}
		});
		btnNewButton_3.setBounds(584, 421, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Audi RS7");
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(64, 68, 97, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblAudiA = new JLabel("Audi A6");
		lblAudiA.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAudiA.setBackground(Color.BLUE);
		lblAudiA.setBounds(64, 295, 97, 16);
		contentPane.add(lblAudiA);
		
		JLabel lblAudial = new JLabel("AudiA8L");
		lblAudial.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAudial.setBackground(Color.BLUE);
		lblAudial.setBounds(310, 168, 97, 16);
		contentPane.add(lblAudial);
		
		JLabel lblAudiQ = new JLabel("Audi Q8");
		lblAudiQ.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAudiQ.setBackground(Color.BLUE);
		lblAudiQ.setBounds(584, 68, 97, 16);
		contentPane.add(lblAudiQ);
		
		JLabel lblAudiEtone = new JLabel("Audi e-tone");
		lblAudiEtone.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAudiEtone.setBackground(Color.BLUE);
		lblAudiEtone.setBounds(584, 295, 97, 16);
		contentPane.add(lblAudiEtone);
		
		JButton btnNewButton_5 = new JButton("BACK");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				STORE st = new STORE();
				st.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_5.setBounds(326, 449, 116, 45);
		contentPane.add(btnNewButton_5);
		
	}
}
