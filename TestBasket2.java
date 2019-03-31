import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TestBasket2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestBasket2 window = new TestBasket2();
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
	public TestBasket2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbremove = new JLabel("");
		lbremove.setIcon(new ImageIcon(TestBasket2.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21remove.png")));
		lbremove.setBounds(408, 345, 200, 50);
		frame.getContentPane().add(lbremove);
		
		JLabel lbback = new JLabel("");
		lbback.setIcon(new ImageIcon(TestBasket2.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21back.png")));
		lbback.setBounds(10, 400, 200, 50);
		frame.getContentPane().add(lbback);
		lbback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
	}
}
