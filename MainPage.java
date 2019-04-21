import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import GamePage.Function;

public class MainPage {
	
	public class Function{
	       Connection con = null;
	       ResultSet rs = null;
	       PreparedStatement ps = null;
	       public ResultSet find(String s){
	           try{
	        	Class.forName("com.mysql.jdbc.Driver");
	        	con = DriverManager.getConnection("jdbc:mysql://localhost/game","root","");
	        	ps = con.prepareStatement("select * from game where id = ?");
	        	ps.setString(1,s);
	        	rs = ps.executeQuery();
	           }catch(Exception ex){
	              JOptionPane.showMessageDialog(null, ex.getMessage());
	           }
	           return rs;
	       }
	       
	   }

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
		JPanel Head_panel = new JPanel();
		Head_panel.setBounds(0, -33, 632, 410);
		frame.getContentPane().add(Head_panel);
		Head_panel.setOpaque(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 221, 632, 750);
		frame.getContentPane().add(scrollPane);
		scrollPane.setPreferredSize(new Dimension(600,700));
		
		JPanel Main_panel = new JPanel();
		scrollPane.setViewportView(Main_panel);
		Main_panel.setLayout(null);
		Main_panel.setPreferredSize(new Dimension(600,1000));
		
		JLabel lbl_Pic1 = new JLabel("GamePic1");
		lbl_Pic1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic1.setBounds(25, 50, 150, 200);
		Main_panel.add(lbl_Pic1);
		
		JLabel lbl_Pic2 = new JLabel("GamePic2");
		lbl_Pic2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic2.setBounds(225, 50, 150, 200);
		Main_panel.add(lbl_Pic2);
		
		JLabel lbl_Pic3 = new JLabel("GamePic3");
		lbl_Pic3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic3.setBounds(425, 50, 150, 200);
		Main_panel.add(lbl_Pic3);
		
		JLabel lbl_Game1 = new JLabel("Game1");
		lbl_Game1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game1.setBounds(25, 287, 150, 40);
		Main_panel.add(lbl_Game1);
		
		JLabel lbl_Game2 = new JLabel("Game2");
		lbl_Game2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game2.setBounds(225, 287, 150, 40);
		Main_panel.add(lbl_Game2);
		
		JLabel lbl_Game3 = new JLabel("Game3");
		lbl_Game3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game3.setBounds(425, 287, 150, 40);
		Main_panel.add(lbl_Game3);
		
		JLabel lbl_Pic4 = new JLabel("GamePic4");
		lbl_Pic4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic4.setBounds(25, 383, 150, 200);
		Main_panel.add(lbl_Pic4);
		
		JLabel lbl_Pic5 = new JLabel("GamePic5");
		lbl_Pic5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic5.setBounds(225, 383, 150, 200);
		Main_panel.add(lbl_Pic5);
		
		JLabel lbl_Pic6 = new JLabel("GamePic6");
		lbl_Pic6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic6.setBounds(425, 383, 150, 200);
		Main_panel.add(lbl_Pic6);
		
		JLabel lbl_Game4 = new JLabel("Game4");
		lbl_Game4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game4.setBounds(25, 620, 150, 40);
		Main_panel.add(lbl_Game4);
		
		JLabel lbl_Game5 = new JLabel("Game5");
		lbl_Game5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game5.setBounds(225, 620, 150, 40);
		Main_panel.add(lbl_Game5);
		
		JLabel lbl_Game6 = new JLabel("Game6");
		lbl_Game6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game6.setBounds(425, 620, 150, 40);
		Main_panel.add(lbl_Game6);
		
		JLabel lbl_Pic7 = new JLabel("GamePic7");
		lbl_Pic7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic7.setBounds(25, 716, 150, 200);
		Main_panel.add(lbl_Pic7);
		
		JLabel lbl_Pic8 = new JLabel("GamePic8");
		lbl_Pic8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic8.setBounds(225, 716, 150, 200);
		Main_panel.add(lbl_Pic8);
		
		JLabel lbl_Pic9 = new JLabel("GamePic9");
		lbl_Pic9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic9.setBounds(425, 716, 150, 200);
		Main_panel.add(lbl_Pic9);
		
		JLabel lbl_Game7 = new JLabel("Game7");
		lbl_Game7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game7.setBounds(25, 953, 150, 40);
		Main_panel.add(lbl_Game7);
		
		JLabel lbl_Game8 = new JLabel("Game8");
		lbl_Game8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game8.setBounds(225, 953, 150, 40);
		Main_panel.add(lbl_Game8);
		
		JLabel lbl_Game9 = new JLabel("Game9");
		lbl_Game9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game9.setBounds(425, 953, 150, 40);
		Main_panel.add(lbl_Game9);
		
		Function f = new Function();
	    ResultSet rs = null;
	    rs = f.find("1");
	    try{
	      if(rs.next()){
	          lbl_Game1.setText(rs.getString("name"));
	          lbl_Pic1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/1.jpg")));
	      }  else{
	          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
	      }
	    }catch(Exception ex){
	           JOptionPane.showMessageDialog(null, ex.getMessage());
	            }
	    rs = f.find("2");
	    try{
	      if(rs.next()){
	          lbl_Game2.setText(rs.getString("name"));
	          lbl_Pic2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/2.jpg")));
	      }  else{
	          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
	      }
	    }catch(Exception ex){
	           JOptionPane.showMessageDialog(null, ex.getMessage());
	            }
	    rs = f.find("3");
	    try{
	      if(rs.next()){
	          lbl_Game3.setText(rs.getString("name"));
	          lbl_Pic3.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/3.png")));
	      }  else{
	          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
	      }
	    }catch(Exception ex){
	           JOptionPane.showMessageDialog(null, ex.getMessage());
	            }
	    rs = f.find("4");
	    try{
	      if(rs.next()){
	          lbl_Game4.setText(rs.getString("name"));
	          lbl_Pic4.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/4.jpeg")));
	      }  else{
	          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
	      }
	    }catch(Exception ex){
	           JOptionPane.showMessageDialog(null, ex.getMessage());
	            }
	    rs = f.find("5");
	    try{
	      if(rs.next()){
	          lbl_Game5.setText(rs.getString("name"));
	          lbl_Pic5.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/5.png")));
	      }  else{
	          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
	      }
	    }catch(Exception ex){
	           JOptionPane.showMessageDialog(null, ex.getMessage());
	            }
	    rs = f.find("6");
	    try{
	      if(rs.next()){
	          lbl_Game6.setText(rs.getString("name"));
	          lbl_Pic6.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/6.jpeg")));
	      }  else{
	          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
	      }
	    }catch(Exception ex){
	           JOptionPane.showMessageDialog(null, ex.getMessage());
	            }
	    rs = f.find("7");
	    try{
	      if(rs.next()){
	          lbl_Game7.setText(rs.getString("name"));
	          lbl_Pic7.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/7.jpg")));
	      }  else{
	          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
	      }
	    }catch(Exception ex){
	           JOptionPane.showMessageDialog(null, ex.getMessage());
	            }
	    rs = f.find("8");
	    try{
	      if(rs.next()){
	          lbl_Game8.setText(rs.getString("name"));
	          lbl_Pic8.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/8.jpeg")));
	      }  else{
	          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
	      }
	    }catch(Exception ex){
	           JOptionPane.showMessageDialog(null, ex.getMessage());
	            }
	    rs = f.find("9");
	    try{
	      if(rs.next()){
	          lbl_Game9.setText(rs.getString("name"));
	          lbl_Pic9.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/9.jpg")));
	      }  else{
	          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
	      }
	    }catch(Exception ex){
	           JOptionPane.showMessageDialog(null, ex.getMessage());
	            }
		
	}
}
