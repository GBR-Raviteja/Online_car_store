import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import java.awt.TextArea;
import javax.swing.JTextField;

public class order_details extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					order_details frame = new order_details();
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
	public order_details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 102, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  dispose();
				  payment_method cd = new payment_method();
				  cd.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(12, 450, 112, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ORDER NOW");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				gif f= new gif();
				f.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(531, 450, 149, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("ORDER DETAILS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(12, 37, 668, 65);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("BACK TO STORE");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  dispose();
				  STORE cd = new STORE();
				  cd.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(239, 450, 191, 38);
		contentPane.add(btnNewButton_2);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(41, 108, 440, 310);
		contentPane.add(textArea);
		
		JButton btnNewButton_3 = new JButton("DELETE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				payment_method page = new payment_method();
                page.itemspreview.remove(Integer.parseInt(textField.getText())-1);
                dispose();
                order_details list = new order_details();
                list.setVisible(true);
				
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3.setBounds(507, 115, 112, 38);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(507, 157, 112, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		payment_method sp = new payment_method();
        for(linkedlist part: sp.itemspreview) {
            textArea.append(part.toString());
            }
	}
}
