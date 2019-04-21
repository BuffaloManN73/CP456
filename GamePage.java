import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import java.awt.Font;

public class GamePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamePage window = new GamePage();
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
	public GamePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Head_panel = new JPanel();
		Head_panel.setBounds(12, 13, 758, 210);
		frame.getContentPane().add(Head_panel);
		Head_panel.setLayout(null);
		
		JPanel Game_panel = new JPanel();
		Game_panel.setBounds(12, 236, 758, 705);
		frame.getContentPane().add(Game_panel);
		Game_panel.setLayout(null);
		
		JLabel lbl_Picture = new JLabel("picture");
		lbl_Picture.setBounds(200, 5, 360, 480);
		Game_panel.add(lbl_Picture);
		lbl_Picture.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(737, 0, 21, 705);
		Game_panel.add(scrollBar);
		
		JLabel lbl_Name = new JLabel("Name");
		lbl_Name.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbl_Name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Name.setBounds(100, 495, 548, 50);
		Game_panel.add(lbl_Name);
		
	}
}
