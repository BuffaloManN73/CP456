import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class TestBasket {

	private JFrame frame;
	private JTextField textField_ID;
	private JTextField textField_Name;
	private JTextField textField_Type;
	private JTextField textField_Score;
	private JTextField textField_Review;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestBasket window = new TestBasket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestBasket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 685, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField_ID = new JTextField();
		textField_ID.setBounds(166, 86, 116, 22);
		textField_ID.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(40, 89, 56, 16);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(309, 379, 97, 25);
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.setBounds(457, 379, 97, 25);
		
		JLabel lblPhoto = new JLabel("Photo");
		lblPhoto.setBounds(351, 89, 267, 274);
		lblPhoto.setVerticalAlignment(SwingConstants.TOP);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(166, 132, 116, 22);
		textField_Name.setColumns(10);
		
		textField_Type = new JTextField();
		textField_Type.setEditable(false);
		textField_Type.setBounds(166, 172, 116, 22);
		textField_Type.setColumns(10);
		
		textField_Score = new JTextField();
		textField_Score.setEditable(false);
		textField_Score.setBounds(166, 344, 116, 22);
		textField_Score.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(40, 135, 56, 16);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(40, 175, 56, 16);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setBounds(40, 347, 56, 16);
		
		JLabel lblReview = new JLabel("Type");
		lblReview.setBounds(40, 213, 38, 16);
		
		textField_Review = new JTextField();
		textField_Review.setEditable(false);
		textField_Review.setBounds(166, 212, 173, 114);
		textField_Review.setColumns(10);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(lblName);
		frame.getContentPane().add(lblType);
		frame.getContentPane().add(lblReview);
		frame.getContentPane().add(textField_ID);
		frame.getContentPane().add(textField_Review);
		frame.getContentPane().add(textField_Name);
		frame.getContentPane().add(textField_Type);
		frame.getContentPane().add(lblPhoto);
		frame.getContentPane().add(lblScore);
		frame.getContentPane().add(textField_Score);
		frame.getContentPane().add(btnSearch);
		frame.getContentPane().add(btnCheckout);
		
		JLabel lblHeader = new JLabel("TestBuyGame");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setBounds(40, 13, 578, 63);
		frame.getContentPane().add(lblHeader);
	}
}
