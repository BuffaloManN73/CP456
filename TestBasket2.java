import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class TestBasket2 {

	private JFrame TestBasket2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestBasket2 window = new TestBasket2();
					window.TestBasket2.setVisible(true);
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
		TestBasket2 = new JFrame();
		TestBasket2.setBounds(100, 100, 700, 500);
		TestBasket2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TestBasket2.getContentPane().setLayout(null);
		
		JLabel lbremove = new JLabel("");
		lbremove.setBounds(377, 391, 200, 50);
		lbremove.setIcon(new ImageIcon(TestBasket2.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21remove.png")));
		TestBasket2.getContentPane().add(lbremove);
		
		JLabel lbback = new JLabel("");
		lbback.setBounds(125, 391, 200, 50);
		lbback.setIcon(new ImageIcon(TestBasket2.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21back.png")));
		TestBasket2.getContentPane().add(lbback);
		
		JPanel Game1 = new JPanel();
		Game1.setBounds(12, 59, 200, 276);
		Game1.setVisible(false);
		TestBasket2.getContentPane().add(Game1);
		
		JPanel Game2 = new JPanel();
		Game2.setBounds(246, 59, 200, 276);
		Game2.setVisible(false);
		TestBasket2.getContentPane().add(Game2);
		
		JPanel Game3 = new JPanel();
		Game3.setBounds(470, 59, 200, 276);
		Game3.setVisible(false);
		TestBasket2.getContentPane().add(Game3);
		
		JCheckBox chckbxGame1 = new JCheckBox("Select this");
		chckbxGame1.setBounds(56, 344, 111, 25);
		chckbxGame1.setVisible(false);
		TestBasket2.getContentPane().add(chckbxGame1);
		
		JCheckBox chckbxGame2 = new JCheckBox("Select this");
		chckbxGame2.setBounds(300, 344, 111, 25);
		chckbxGame2.setVisible(false);
		TestBasket2.getContentPane().add(chckbxGame2);
		
		JCheckBox chckbxGame3 = new JCheckBox("Select this");
		chckbxGame3.setBounds(519, 344, 111, 25);
		chckbxGame3.setVisible(false);
		TestBasket2.getContentPane().add(chckbxGame3);
		lbback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TestBasket testbasket = new TestBasket();
				testbasket.setVisible(true);
				TestBasket2.setVisible(false);


			}
		});
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		TestBasket2.setVisible(b);
		
	}
}
