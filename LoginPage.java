import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;

public class LoginPage {

	private JFrame frmLogin;
	private JTextField textFieldusername;
	private JTextField textFieldpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("AppBuySteam");
		frmLogin.setBounds(100, 100, 650, 500);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginPage.class.getResource("/Picture/logo.png")));
		lblNewLabel.setBounds(164, 13, 300, 150);
		frmLogin.getContentPane().add(lblNewLabel);
		
		textFieldusername = new JTextField();
		textFieldusername.setBounds(269, 246, 241, 34);
		frmLogin.getContentPane().add(textFieldusername);
		textFieldusername.setColumns(10);
		
		textFieldpassword = new JTextField();
		textFieldpassword.setColumns(10);
		textFieldpassword.setBounds(269, 303, 241, 34);
		frmLogin.getContentPane().add(textFieldpassword);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblLogin.setBounds(273, 183, 137, 50);
		frmLogin.getContentPane().add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUsername.setBounds(110, 240, 198, 43);
		frmLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPassword.setBounds(110, 299, 198, 43);
		frmLogin.getContentPane().add(lblPassword);
		
		JLabel lblConfirm = new JLabel("Confirm \u0E23\u0E2D\u0E17\u0E33\u0E1B\u0E38\u0E48\u0E21");
		lblConfirm.setBounds(177, 388, 107, 16);
		frmLogin.getContentPane().add(lblConfirm);
		
		JLabel lblRegister = new JLabel("Register \u0E23\u0E2D\u0E17\u0E33\u0E1B\u0E38\u0E48\u0E21");
		lblRegister.setBounds(362, 388, 137, 16);
		frmLogin.getContentPane().add(lblRegister);
	}
}
