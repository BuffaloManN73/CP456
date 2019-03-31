import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JPanel;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class header {

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
		frame.setBounds(100, 100, 650, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("logo");
		lblLogo.setBounds(0, 0, 203, 72);
		frame.getContentPane().add(lblLogo);
		
		JButton btnNewButton = new JButton("\u0E2B\u0E19\u0E49\u0E32\u0E2B\u0E25\u0E31\u0E01");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(40, 83, 137, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\u0E40\u0E01\u0E21\u0E2E\u0E34\u0E15");
		button.setBounds(176, 83, 137, 40);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u0E2B\u0E21\u0E27\u0E14\u0E2B\u0E21\u0E39\u0E48");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		button_1.setBounds(313, 83, 137, 40);
		frame.getContentPane().add(button_1);
		
		JButton btnAction = new JButton("Action");
		btnAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAction.setEnabled(false);
		btnAction.setBounds(313, 120, 137, 40);
		frame.getContentPane().add(btnAction);
		
		JButton btnFps = new JButton("FPS");
		btnFps.setEnabled(false);
		btnFps.setBounds(313, 157, 137, 40);
		frame.getContentPane().add(btnFps);
		
		JButton btnStory = new JButton("Story");
		btnStory.setEnabled(false);
		btnStory.setBounds(313, 194, 137, 40);
		frame.getContentPane().add(btnStory);
		
		textField = new JTextField();
		textField.setBounds(253, 27, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u0E04\u0E49\u0E19\u0E2B\u0E32");
		lblNewLabel.setBounds(212, 30, 39, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
