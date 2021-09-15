import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class end extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					end frame = new end();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the frame.
	 */
	public end() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 364);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYy = new JLabel("");
		lblYy.setBackground(new Color(102, 204, 255));

		lblYy.setHorizontalAlignment(SwingConstants.CENTER);
		Image img3 = new ImageIcon(this.getClass().getResource("/mark.jpg")).getImage();
		lblYy.setIcon(new ImageIcon(img3));
		lblYy.setBounds(12, 13, 536, 189);
		contentPane.add(lblYy);
		
		JLabel lblCarHasBooked = new JLabel("CAR HAS BOOKED SUCCESFULLY....");
		lblCarHasBooked.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblCarHasBooked.setBounds(12, 244, 548, 47);
		contentPane.add(lblCarHasBooked);
	}

}
