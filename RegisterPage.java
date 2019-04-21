import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterPage {

	private JFrame frmAppbuysteam;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;
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

	
	 public class Function{
	       Connection con = null;
	       ResultSet rs = null;
	       PreparedStatement ps = null;
	       public ResultSet find(String s){
	           try{
	        	Class.forName("com.mysql.jdbc.Driver");
	        	con = DriverManager.getConnection("jdbc:mysql://localhost/game","root","");
	        	ps = con.prepareStatement("select * from user where username = ?");
	        	ps.setString(1,s);
	        	rs = ps.executeQuery();
	           }catch(Exception ex){
	              JOptionPane.showMessageDialog(null, ex.getMessage());
	           }
	           return rs;
	       }
	       
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
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUsername.setBounds(123, 242, 198, 43);
		frmAppbuysteam.getContentPane().add(lblUsername);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(282, 248, 241, 34);
		frmAppbuysteam.getContentPane().add(textFieldUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPassword.setBounds(123, 298, 198, 43);
		frmAppbuysteam.getContentPane().add(lblPassword);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(282, 302, 241, 34);
		frmAppbuysteam.getContentPane().add(textFieldPassword);
		
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
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnBack.setBounds(178, 487, 97, 25);
		frmAppbuysteam.getContentPane().add(btnBack);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				Function f = new Function();
			    //ResultSet rs = null;
			    Connection con = null;
			    PreparedStatement ps = null;
			    con = DriverManager.getConnection("jdbc:mysql://localhost/game","root","");
				String query = "insert into user (username,password,email,phone) values (?,?,?,?)";
			    //String query = "insert into 'user` (`username`, `password`, `email`, `phone`) VALUES ('?', '?', '?', '?')";
				PreparedStatement pst = con.prepareStatement(query);
				
				if(textFieldUsername.getText().equals("") || textFieldPassword.getText().equals("") || textFieldemail.getText().equals("") || textFielphone.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Fill all information pls");
				}else {
					pst.setString(1, textFieldUsername.getText());
					pst.setString(2, textFieldPassword.getText());
					pst.setString(3, textFieldemail.getText());
					pst.setString(4, textFielphone.getText());
					
					pst.execute();
				}

				
				//rs = pst.executeQuery();

				//ResultSet rs = pst.executeQuery();
				
				JOptionPane.showMessageDialog(null, "Register Success");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Fail");
			}
			}
		});
		
		
		
		btnConfirm.setBounds(364, 487, 97, 25);
		frmAppbuysteam.getContentPane().add(btnConfirm);
	}



}
