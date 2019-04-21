import java.awt.EventQueue;

import javax.swing.JFrame;

public class RegisterPage {

	private JFrame frmAppbuysteam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage window = new RegisterPage();
					window.frmAppbuysteam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegisterPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAppbuysteam = new JFrame();
		frmAppbuysteam.setTitle("AppBuySteam");
		frmAppbuysteam.setBounds(100, 100, 450, 300);
		frmAppbuysteam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
