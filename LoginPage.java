import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;


import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage {

	public static JFrame frmLogin;
	public static JTextField textFieldusername = new JTextField();
	public static JTextField textFieldpassword = new JTextField();
	public static JButton btnLogin = new JButton("Confirm");

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
 
	 public static class Function{
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
	static String[] username = {""} ;
	
	public static void login() {
		
		Function f = new Function();
	    ResultSet rs = null;
	    
	    try{
		      if(textFieldusername.getText().equals("") || textFieldpassword.getText().equals("")){
		    	  JOptionPane.showMessageDialog(null, "Write username and password pls");
		      }else{
		    	  rs = f.find(textFieldusername.getText()); 
		    	  if(rs.next()){
			    	  if(textFieldpassword.getText().equals(rs.getString("password"))) {
			    		  username[0] =  textFieldusername.getText();
			    		  JOptionPane.showMessageDialog(null, "Login Success");
			    		  
			    		
			    		  
							MainPage mainpage = new MainPage();
							mainpage.setVisible(true);
							frmLogin.setVisible(false);
			    		  
			    	  }else {
			    		  JOptionPane.showMessageDialog(null, "Wrong Password");
			    	  }
			      }  else{
			          JOptionPane.showMessageDialog(null, "No data for this account");
			      }
		      }
		    }catch(Exception ex){
		           JOptionPane.showMessageDialog(null, "s");
		            }
	} 
	 
	 
	public LoginPage() {
		initialize();
	}
	
	
	
	

	
	//public void storeusername (String a) {
	//	username[0] = "asss";
	//}

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
		
		 
		textFieldusername.setBounds(269, 246, 241, 34);
		frmLogin.getContentPane().add(textFieldusername);
		textFieldusername.setColumns(10);
		
		
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
		lblPassword.setBounds(110, 299, 153, 43);
		frmLogin.getContentPane().add(lblPassword);
		
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnLogin.setBounds(142, 388, 146, 34);
		frmLogin.getContentPane().add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				RegisterPage regpage = new RegisterPage();
				regpage.setVisible(true);
				frmLogin.setVisible(false);
			}
		});

		btnRegister.setBounds(336, 388, 146, 34);
		frmLogin.getContentPane().add(btnRegister);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frmLogin.setVisible(b);
	}
}
