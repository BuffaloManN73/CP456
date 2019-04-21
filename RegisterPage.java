import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

public class RegisterPage {

	private JFrame frmAppbuysteam;
	private JTextField textFieldusername;
	private JTextField textFieldpassword;
	private JTextField textFieldemail;
	private JTextField textFielphone;

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
		frmAppbuysteam.setBounds(100, 100, 650, 600);
		frmAppbuysteam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAppbuysteam.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RegisterPage.class.getResource("/Picture/logo.png")));
		label.setBounds(164, 13, 300, 150);
		frmAppbuysteam.getContentPane().add(label);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblRegister.setBounds(231, 176, 233, 50);
		frmAppbuysteam.getContentPane().add(lblRegister);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblusername.setBounds(123, 242, 198, 43);
		frmAppbuysteam.getContentPane().add(lblusername);
		
		textFieldusername = new JTextField();
		textFieldusername.setColumns(10);
		textFieldusername.setBounds(282, 248, 241, 34);
		frmAppbuysteam.getContentPane().add(textFieldusername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblpassword.setBounds(123, 298, 198, 43);
		frmAppbuysteam.getContentPane().add(lblpassword);
		
		textFieldpassword = new JTextField();
		textFieldpassword.setColumns(10);
		textFieldpassword.setBounds(282, 302, 241, 34);
		frmAppbuysteam.getContentPane().add(textFieldpassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEmail.setBounds(123, 354, 198, 43);
		frmAppbuysteam.getContentPane().add(lblEmail);
		
		textFieldemail = new JTextField();
		textFieldemail.setColumns(10);
		textFieldemail.setBounds(282, 360, 241, 34);
		frmAppbuysteam.getContentPane().add(textFieldemail);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPhone.setBounds(123, 410, 125, 43);
		frmAppbuysteam.getContentPane().add(lblPhone);
		
		textFielphone = new JTextField();
		textFielphone.setColumns(10);
		textFielphone.setBounds(282, 414, 241, 34);
		frmAppbuysteam.getContentPane().add(textFielphone);
		
		JLabel lblBack = new JLabel("Back \u0E23\u0E2D\u0E17\u0E33\u0E1B\u0E38\u0E48\u0E21");
		lblBack.setBounds(176, 497, 107, 16);
		frmAppbuysteam.getContentPane().add(lblBack);
		
		JLabel label_2 = new JLabel("Confirm \u0E23\u0E2D\u0E17\u0E33\u0E1B\u0E38\u0E48\u0E21");
		label_2.setBounds(395, 497, 107, 16);
		frmAppbuysteam.getContentPane().add(label_2);
	}

}
