import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.sql.*;

public class TestBasket2 {
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
	
	public void refresh()
	{
		TestBasket3 testbasket = new TestBasket3();
		testbasket.setVisible(true);
		TestBasket2.setVisible(false);
	}
	
	private void initialize(){
		TestBasket2 = new JFrame();
		TestBasket2.setBounds(100, 100, 700, 500);
		TestBasket2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TestBasket2.getContentPane().setLayout(null);
		
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
		
		
		JPanel Game1 = new JPanel();
		Game1.setBounds(12, 59, 200, 276);
		Game1.setVisible(false);
		TestBasket2.getContentPane().add(Game1);
		Game1.setLayout(null);
	
		JLabel lblPicture1 = new JLabel("Picture");
		lblPicture1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPicture1.setBounds(22, 13, 150, 200);
		Game1.add(lblPicture1);
		
		JLabel lblName1 = new JLabel("Name");
		lblName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName1.setBounds(22, 238, 150, 25);
		Game1.add(lblName1);
		
		JPanel Game2 = new JPanel();
		Game2.setBounds(246, 59, 200, 276);
		Game2.setVisible(false);
		TestBasket2.getContentPane().add(Game2);
		Game2.setLayout(null);
		
		JLabel lblPicture2 = new JLabel("Picture");
		lblPicture2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPicture2.setBounds(23, 13, 150, 200);
		Game2.add(lblPicture2);
		
		JLabel lblName2 = new JLabel("Name");
		lblName2.setHorizontalAlignment(SwingConstants.CENTER);
		lblName2.setBounds(23, 238, 150, 25);
		Game2.add(lblName2);
		
		JPanel Game3 = new JPanel();
		Game3.setBounds(470, 59, 200, 276);
		Game3.setVisible(false);
		TestBasket2.getContentPane().add(Game3);
		Game3.setLayout(null);
		
		JLabel lblPicture3 = new JLabel("Picture");
		lblPicture3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPicture3.setBounds(27, 13, 150, 200);
		Game3.add(lblPicture3);
		
		JLabel lblName3 = new JLabel("Name");
		lblName3.setHorizontalAlignment(SwingConstants.CENTER);
		lblName3.setBounds(27, 238, 150, 25);
		Game3.add(lblName3);
		
		JLabel lbremove = new JLabel("");
		lbremove.setBounds(377, 391, 200, 50);
		lbremove.setIcon(new ImageIcon(TestBasket2.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21remove.png")));
		TestBasket2.getContentPane().add(lbremove);
		
		
		JLabel lbback = new JLabel("");
		lbback.setBounds(125, 391, 200, 50);
		lbback.setIcon(new ImageIcon(TestBasket2.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21back.png")));
		TestBasket2.getContentPane().add(lbback);
		
		lbback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TestBasket testbasket = new TestBasket();
				testbasket.setVisible(true);
				TestBasket2.setVisible(false);
			}
		});
		

		
		if (TestBasket.gameList.size() == 1){
			Game1.setVisible(true);
			chckbxGame1.setVisible(true);
			
			Function f = new Function();
		    ResultSet rs = null;
		    String name ="name";
		    rs = f.find(TestBasket.gameList.get(0));
		    try{
		      if(rs.next()){
		          lblName1.setText(rs.getString("name"));
		          
		      }  else{
		          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
		      }
		    }catch(Exception ex){
		           JOptionPane.showMessageDialog(null, ex.getMessage());
		            }
		    switch(TestBasket.gameList.get(0).charAt(0)) {
	         case '1' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/1.jpg")));
	            break;
	         case '2' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/2.jpg")));
	            break;
	         case '3' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/3.png")));
	            break;
	         case '4' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/4.jpeg")));
	            break;
	         case '5' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/5.png")));
	            break;
	         case '6' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/6.jpeg")));
	            break;
	         case '7' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/7.jpg")));
	            break;
	         case '8' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/8.jpeg")));
	            break;
	         case '9' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/9.jpg")));
	            break;
		    }
		  //11111111111111111
		    lbremove.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (chckbxGame1.isSelected() && TestBasket.gameList.size()>=1) {
						JOptionPane.showMessageDialog(null, "Delete1!!");
						TestBasket.gameList.remove(0);
				        
					}
					if (chckbxGame2.isSelected()&& TestBasket.gameList.size()>=2 ) {
						JOptionPane.showMessageDialog(null, "Delete2!!");
						TestBasket.gameList.remove(1);
						
					}
					if (chckbxGame3.isSelected()&& TestBasket.gameList.size()==3 ) {
						JOptionPane.showMessageDialog(null, "Delete3!!");
						TestBasket.gameList.remove(2);
					}
					refresh();
				}
			});
			//lblName1.setText(TestBasket.gameList.get(0));
		}else if(TestBasket.gameList.size() == 2) {
			Game1.setVisible(true);
			Game2.setVisible(true);
			chckbxGame1.setVisible(true);
			chckbxGame2.setVisible(true);
			Function f = new Function();
		    ResultSet rs = null;
		    String name ="name";
		    rs = f.find(TestBasket.gameList.get(0));
		    try{
		      if(rs.next()){
		          lblName1.setText(rs.getString("name"));
		          
		      }  else{
		          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
		      }
		    }catch(Exception ex){
		           JOptionPane.showMessageDialog(null, ex.getMessage());
		            }
		    rs = f.find(TestBasket.gameList.get(1));
		    try{
		      if(rs.next()){
		          lblName2.setText(rs.getString("name"));
		          
		      }  else{
		          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
		      }
		    }catch(Exception ex){
		           JOptionPane.showMessageDialog(null, ex.getMessage());
		            }
		    
		    switch(TestBasket.gameList.get(0).charAt(0)) {
	         case '1' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/1.jpg")));
	            break;
	         case '2' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/2.jpg")));
	            break;
	         case '3' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/3.png")));
	            break;
	         case '4' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/4.jpeg")));
	            break;
	         case '5' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/5.png")));
	            break;
	         case '6' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/6.jpeg")));
	            break;
	         case '7' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/7.jpg")));
	            break;
	         case '8' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/8.jpeg")));
	            break;
	         case '9' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/9.jpg")));
	            break;
		    }
		    
		    switch(TestBasket.gameList.get(1).charAt(0)) {
	         case '1' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/1.jpg")));
	            break;
	         case '2' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/2.jpg")));
	            break;
	         case '3' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/3.png")));
	            break;
	         case '4' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/4.jpeg")));
	            break;
	         case '5' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/5.png")));
	            break;
	         case '6' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/6.jpeg")));
	            break;
	         case '7' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/7.jpg")));
	            break;
	         case '8' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/8.jpeg")));
	            break;
	         case '9' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/9.jpg")));
	            break;
	      }
		    //222222222222222222222
		    lbremove.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (chckbxGame1.isSelected() && TestBasket.gameList.size()>=1) {
						JOptionPane.showMessageDialog(null, "Delete2.111!!");
						TestBasket.gameList.remove(0);
						lblPicture1.setIcon(lblPicture1.getIcon());
					}
					if (chckbxGame2.isSelected()&& TestBasket.gameList.size()>=2 ) {
						JOptionPane.showMessageDialog(null, "Delete2.2!!");
						TestBasket.gameList.remove(1);
						//Game1.updateUI();	
					}
					if (chckbxGame3.isSelected()&& TestBasket.gameList.size()==3 ) {
						JOptionPane.showMessageDialog(null, "Delete3!!");
						TestBasket.gameList.remove(2);
						//Game1.updateUI();	
					}
					refresh();
				}
			});
			
			//lblName1.setText(TestBasket.gameList.get(1));
		}else if(TestBasket.gameList.size() == 3) {
			Game1.setVisible(true);
			Game2.setVisible(true);
			Game3.setVisible(true);
			chckbxGame1.setVisible(true);
			chckbxGame2.setVisible(true);
			chckbxGame3.setVisible(true);
			
			Function f = new Function();
		    ResultSet rs = null;
		    String name ="name";
		    rs = f.find(TestBasket.gameList.get(0));
		    try{
		      if(rs.next()){
		          lblName1.setText(rs.getString("name"));
		          
		      }  else{
		          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
		      }
		    }catch(Exception ex){
		           JOptionPane.showMessageDialog(null, ex.getMessage());
		            }
		    rs = f.find(TestBasket.gameList.get(1));
		    try{
		      if(rs.next()){
		          lblName2.setText(rs.getString("name"));
		          
		      }  else{
		          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
		      }
		    }catch(Exception ex){
		           JOptionPane.showMessageDialog(null, ex.getMessage());
		    }
		    rs = f.find(TestBasket.gameList.get(2));
		    try{
		      if(rs.next()){
		          lblName3.setText(rs.getString("name"));
		          
		      }  else{
		          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
		      }
		    }catch(Exception ex){
		           JOptionPane.showMessageDialog(null, ex.getMessage());
		    }
		    
		    switch(TestBasket.gameList.get(0).charAt(0)) {
	         case '1' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/1.jpg")));
	            break;
	         case '2' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/2.jpg")));
	            break;
	         case '3' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/3.png")));
	            break;
	         case '4' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/4.jpeg")));
	            break;
	         case '5' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/5.png")));
	            break;
	         case '6' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/6.jpeg")));
	            break;
	         case '7' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/7.jpg")));
	            break;
	         case '8' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/8.jpeg")));
	            break;
	         case '9' :
	        	 lblPicture1.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/9.jpg")));
	            break;
		    }
		    
		    switch(TestBasket.gameList.get(1).charAt(0)) {
	         case '1' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/1.jpg")));
	            break;
	         case '2' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/2.jpg")));
	            break;
	         case '3' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/3.png")));
	            break;
	         case '4' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/4.jpeg")));
	            break;
	         case '5' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/5.png")));
	            break;
	         case '6' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/6.jpeg")));
	            break;
	         case '7' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/7.jpg")));
	            break;
	         case '8' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/8.jpeg")));
	            break;
	         case '9' :
	        	 lblPicture2.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/9.jpg")));
	            break;
	      }
		    
		    switch(TestBasket.gameList.get(2).charAt(0)) {
	         case '1' :
	        	 lblPicture3.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/1.jpg")));
	            break;
	         case '2' :
	        	 lblPicture3.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/2.jpg")));
	            break;
	         case '3' :
	        	 lblPicture3.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/3.png")));
	            break;
	         case '4' :
	        	 lblPicture3.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/4.jpeg")));
	            break;
	         case '5' :
	        	 lblPicture3.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/5.png")));
	            break;
	         case '6' :
	        	 lblPicture3.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/6.jpeg")));
	            break;
	         case '7' :
	        	 lblPicture3.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/7.jpg")));
	            break;
	         case '8' :
	        	 lblPicture3.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/8.jpeg")));
	            break;
	         case '9' :
	        	 lblPicture3.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/9.jpg")));
	            break;
		    }
		  //333333333333333333
		    lbremove.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (chckbxGame1.isSelected() && TestBasket.gameList.size()>=1) {
						JOptionPane.showMessageDialog(null, "Delete1!!");
						TestBasket.gameList.remove(0);

					}
					if (chckbxGame2.isSelected()&& TestBasket.gameList.size()>=2 ) {
						JOptionPane.showMessageDialog(null, "Delete2!!");
						TestBasket.gameList.remove(1);
					}
					if (chckbxGame3.isSelected()&& TestBasket.gameList.size()==3 ) {
						JOptionPane.showMessageDialog(null, "Delete3!!");
						TestBasket.gameList.remove(2);

					}
					refresh();
				}
			});
			/*
			lbremove.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					
					if (chckbxGame1.isSelected() && TestBasket.gameList.size()>1) {
						TestBasket.gameList.remove(0);
					}
					if (chckbxGame2.isSelected()&& TestBasket.gameList.size()>2 ) {
						TestBasket.gameList.remove(1);
					}
					if (chckbxGame3.isSelected()&& TestBasket.gameList.size()>3 ) {
						TestBasket.gameList.remove(2);
					}
					
				}
			});
		           
			
			lblName1.setText(TestBasket.gameList.get(0));
			lblName1.setText(TestBasket.gameList.get(1));
			lblName1.setText(TestBasket.gameList.get(2));
			*/
		}
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		TestBasket2.setVisible(b);
		
	}
}
