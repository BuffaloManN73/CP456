import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class header {
	int i = 0; //for making dropdown menu
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					header window = new header();
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
	public header() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
<<<<<<< HEAD
		frame.setBounds(100, 100, 650, 410);
=======
		frame.setBounds(100, 100, 651, 412);
>>>>>>> 9fea59f40f985be3bc1014b276e5bf4d5fac1106
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(header.class.getResource("/Picture/logo.png")));
		lblLogo.setBounds(0, 0, 300, 150);
		frame.getContentPane().add(lblLogo);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
<<<<<<< HEAD
		textField.setBounds(367, 29, 257, 34);
=======
		textField.setBounds(358, 33, 260, 35);
>>>>>>> 9fea59f40f985be3bc1014b276e5bf4d5fac1106
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u0E04\u0E49\u0E19\u0E2B\u0E32");
<<<<<<< HEAD
		lblNewLabel.setBounds(317, 39, 40, 14);
=======
		lblNewLabel.setIcon(new ImageIcon(header.class.getResource("/Picture/search.png")));
		lblNewLabel.setBounds(291, 19, 334, 61);
>>>>>>> 9fea59f40f985be3bc1014b276e5bf4d5fac1106
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbmain = new JLabel("");
		lbmain.setIcon(new ImageIcon("C:\\Users\\Administrator\\appbuysteam\\Picture\\\u0E1B\u0E38\u0E48\u0E21\u0E2B\u0E19\u0E49\u0E32\u0E2B\u0E25\u0E31\u0E01.png"));
		lbmain.setBounds(8, 161, 200, 50);
		frame.getContentPane().add(lbmain);
		
		JLabel lbgamehit = new JLabel("");
		lbgamehit.setIcon(new ImageIcon("C:\\Users\\Administrator\\appbuysteam\\Picture\\\u0E1B\u0E38\u0E48\u0E21\u0E40\u0E01\u0E21\u0E2E\u0E34\u0E15.png"));
		lbgamehit.setBounds(218, 161, 200, 50);
		frame.getContentPane().add(lbgamehit);
		
		JLabel lbstory = new JLabel("");
		lbstory.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21story.png")));
		lbstory.setBounds(428, 213, 200, 50);
		lbstory.setVisible(false);
		frame.getContentPane().add(lbstory);
		
		JLabel lbaction = new JLabel("");
		lbaction.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21action.png")));
		lbaction.setBounds(428, 265, 200, 50);
		lbaction.setVisible(false);
		frame.getContentPane().add(lbaction);
		
		JLabel lbsimulation = new JLabel("");
		lbsimulation.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21simulation.png")));
		lbsimulation.setBounds(428, 317, 200, 50);
		lbsimulation.setVisible(false);
		frame.getContentPane().add(lbsimulation);
		

		
		
		JLabel lbtype = new JLabel("");
		lbtype.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21\u0E2B\u0E21\u0E27\u0E14\u0E2B\u0E21\u0E39\u0E48.png")));
		lbtype.setBounds(428, 161, 200, 50);
		frame.getContentPane().add(lbtype);
		lbtype.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(i == 0){
					lbaction.setVisible(true);
					lbstory.setVisible(true);
					lbsimulation.setVisible(true);
					i = 1;
				}else {
					lbaction.setVisible(false);
					lbstory.setVisible(false);
					lbsimulation.setVisible(false);
					i = 0;
				}
				
			}
		});

		

	}
}
