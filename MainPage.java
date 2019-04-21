import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
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
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 221, 632, 750);
		frame.getContentPane().add(scrollPane);
		scrollPane.setPreferredSize(new Dimension(600,700));
		
		JPanel Main_panel = new JPanel();
		scrollPane.setViewportView(Main_panel);
		Main_panel.setLayout(null);
		
		JLabel lbl_Pic1 = new JLabel("New label");
		lbl_Pic1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic1.setBounds(25, 50, 150, 200);
		Main_panel.add(lbl_Pic1);
		
		JLabel lbl_Pic2 = new JLabel("New label");
		lbl_Pic2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic2.setBounds(225, 50, 150, 200);
		Main_panel.add(lbl_Pic2);
		
		JLabel lbl_Pic3 = new JLabel("New label");
		lbl_Pic3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic3.setBounds(425, 50, 150, 200);
		Main_panel.add(lbl_Pic3);
		
		JLabel lbl_Game1 = new JLabel("New label");
		lbl_Game1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game1.setBounds(25, 287, 150, 40);
		Main_panel.add(lbl_Game1);
		
		JLabel lbl_Game2 = new JLabel("New label");
		lbl_Game2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game2.setBounds(225, 287, 150, 40);
		Main_panel.add(lbl_Game2);
		
		JLabel lbl_Game3 = new JLabel("New label");
		lbl_Game3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game3.setBounds(425, 287, 150, 40);
		Main_panel.add(lbl_Game3);
		
		JLabel label = new JLabel("New label");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(25, 383, 150, 200);
		Main_panel.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(225, 383, 150, 200);
		Main_panel.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(425, 383, 150, 200);
		Main_panel.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(25, 620, 150, 40);
		Main_panel.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(225, 620, 150, 40);
		Main_panel.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(425, 620, 150, 40);
		Main_panel.add(label_5);
		
		JPanel Head_panel = new JPanel();
		Head_panel.setBounds(0, -33, 632, 410);
		frame.getContentPane().add(Head_panel);
		Head_panel.setOpaque(false);
		
	}
}
