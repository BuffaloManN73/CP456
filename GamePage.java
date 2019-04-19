import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class GamePage {

	private JFrame frmGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamePage window = new GamePage();
					window.frmGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GamePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGame = new JFrame();
		frmGame.setBounds(100, 100, 450, 600);
		frmGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGame.getContentPane().setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(411, 0, 21, 554);
		frmGame.getContentPane().add(scrollBar);
		
		JLabel lblPicture = new JLabel("Picture");
		lblPicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblPicture.setBounds(125, 89, 180, 320);
		frmGame.getContentPane().add(lblPicture);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(73, 422, 281, 50);
		frmGame.getContentPane().add(lblName);
	}
}
