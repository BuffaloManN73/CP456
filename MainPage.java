import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class MainPage {
	int i = 0;
	public static class Function{
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

	public static JFrame MainPage = new JFrame();;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.MainPage.setVisible(true);
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
	static String ID;
	static JPanel Head_panel = new JPanel();
	static JPanel Main_panel = new JPanel();
	static JLabel lbl_Pic1 = new JLabel("GamePic1");
	static JLabel lbl_Pic2 = new JLabel("GamePic2");
	static JLabel lbl_Pic3 = new JLabel("GamePic3");
	static JLabel lbl_Pic4 = new JLabel("GamePic4");
	static JLabel lbl_Pic5 = new JLabel("GamePic5");
	static JLabel lbl_Pic6 = new JLabel("GamePic6");
	static JLabel lbl_Pic7 = new JLabel("GamePic7");
	static JLabel lbl_Pic8 = new JLabel("GamePic8");
	static JLabel lbl_Pic9 = new JLabel("GamePic9");
	
	static JLabel lbl_Game1 = new JLabel("Game1");
	static JLabel lbl_Game2 = new JLabel("Game2");
	static JLabel lbl_Game3 = new JLabel("Game3");
	static JLabel lbl_Game4 = new JLabel("Game4");
	static JLabel lbl_Game5 = new JLabel("Game5");
	static JLabel lbl_Game6 = new JLabel("Game6");
	static JLabel lbl_Game7 = new JLabel("Game7");
	static JLabel lbl_Game8 = new JLabel("Game8");
	static JLabel lbl_Game9 = new JLabel("Game9");
	static JTextField txt_Search = new JTextField();
	
	
	public void initialize() {
		MainPage.setTitle("appbuygame");
		
		MainPage.setBounds(100, 100, 650, 1000);
		MainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainPage.getContentPane().setLayout(null);
		
		
		Head_panel.setBounds(0, 0, 634, 410);
		MainPage.getContentPane().add(Head_panel);
		Head_panel.setOpaque(false);
		Head_panel.setLayout(null);
		
		txt_Search.setBounds(355, 70, 260, 33);
		Head_panel.add(txt_Search);
		txt_Search.setColumns(10);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/logo.png")));
		lblLogo.setBounds(0, 0, 300, 150);
		Head_panel.add(lblLogo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				search(txt_Search.getText());
			}
		});
		lblNewLabel.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/search.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(288, 64, 340, 45);
		Head_panel.add(lblNewLabel);
		
		JLabel lbmain = new JLabel("");
		lbmain.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				MainMenu();
			}
		});
		lbmain.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21\u0E2B\u0E19\u0E49\u0E32\u0E2B\u0E25\u0E31\u0E01.png")));
		lbmain.setBounds(8, 161, 200, 50);
		Head_panel.add(lbmain);
		
		JLabel lbgamehit = new JLabel("");
		lbgamehit.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21\u0E40\u0E01\u0E21\u0E2E\u0E34\u0E15.png")));
		lbgamehit.setBounds(218, 161, 200, 50);
		Head_panel.add(lbgamehit);
		
		JLabel lbrpg = new JLabel("");
		lbrpg.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21rpg.png")));
		lbrpg.setBounds(428, 213, 200, 50);
		lbrpg.setVisible(false);
		Head_panel.add(lbrpg);
		
		JLabel lbaction = new JLabel("");
		lbaction.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21action.png")));
		lbaction.setBounds(428, 265, 200, 50);
		lbaction.setVisible(false);
		Head_panel.add(lbaction);
		
		JLabel lbsimulation = new JLabel("");
		lbsimulation.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21simulation.png")));
		lbsimulation.setBounds(428, 317, 200, 50);
		lbsimulation.setVisible(false);
		Head_panel.add(lbsimulation);
		
		JLabel lbtype = new JLabel("");
		lbtype.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21\u0E2B\u0E21\u0E27\u0E14\u0E2B\u0E21\u0E39\u0E48.png")));
		lbtype.setBounds(428, 161, 200, 50);
		Head_panel.add(lbtype);
		
		JButton button = new JButton("");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				BasketPage basketpage = new BasketPage();
				basketpage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		
		button.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/basket.png")));
		button.setBounds(537, 3, 83, 59);
		Head_panel.add(button);
		
		JLabel lblUser = new JLabel("User :");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUser.setBounds(312, 23, 72, 33);
		Head_panel.add(lblUser);
		
		
		
		
		JLabel lblname = new JLabel("New label");
		lblname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblname.setBounds(376, 27, 149, 25);
		Head_panel.add(lblname);
		lblname.setText(LoginPage.username[0]);
		
		lbtype.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(i  == 0){
					lbaction.setVisible(true);
					lbrpg.setVisible(true);
					lbsimulation.setVisible(true);
					i = 1;
				}else {
					lbaction.setVisible(false);
					lbrpg.setVisible(false);
					lbsimulation.setVisible(false);
					i = 0;
				}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 221, 632, 750);
		MainPage.getContentPane().add(scrollPane);
		scrollPane.setPreferredSize(new Dimension(600,700));
		
		
		scrollPane.setViewportView(Main_panel);
		Main_panel.setLayout(null);
		Main_panel.setPreferredSize(new Dimension(600,1000));
		
		
		lbl_Pic1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "1";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Pic1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic1.setBounds(25, 50, 150, 200); //position for display game
		Main_panel.add(lbl_Pic1);
		

		lbl_Pic2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "2";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Pic2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic2.setBounds(225, 50, 150, 200);//position for display game
		Main_panel.add(lbl_Pic2);
		

		lbl_Pic3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "3";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Pic3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic3.setBounds(425, 50, 150, 200);//position for display game
		Main_panel.add(lbl_Pic3);
		

		lbl_Game1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "1";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Game1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game1.setBounds(25, 287, 150, 40);//position for display game
		Main_panel.add(lbl_Game1);
		

		lbl_Game2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "2";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Game2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game2.setBounds(225, 287, 150, 40);//position for display game
		Main_panel.add(lbl_Game2);
		

		lbl_Game3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "3";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Game3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game3.setBounds(425, 287, 150, 40);//position for display game
		Main_panel.add(lbl_Game3);
		

		lbl_Pic4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "4";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Pic4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic4.setBounds(25, 383, 150, 200);
		Main_panel.add(lbl_Pic4);
		

		lbl_Pic5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "5";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Pic5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic5.setBounds(225, 383, 150, 200);
		Main_panel.add(lbl_Pic5);
		

		lbl_Pic6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "6";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Pic6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic6.setBounds(425, 383, 150, 200);
		Main_panel.add(lbl_Pic6);
		

		lbl_Game4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "4";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Game4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game4.setBounds(25, 620, 150, 40);
		Main_panel.add(lbl_Game4);
		
	
		lbl_Game5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "5";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Game5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game5.setBounds(225, 620, 150, 40);
		Main_panel.add(lbl_Game5);
		

		lbl_Game6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "6";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Game6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game6.setBounds(425, 620, 150, 40);
		Main_panel.add(lbl_Game6);
		

		lbl_Pic7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "7";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Pic7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic7.setBounds(25, 716, 150, 200);
		Main_panel.add(lbl_Pic7);
		

		lbl_Pic8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "8";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Pic8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic8.setBounds(225, 716, 150, 200);
		Main_panel.add(lbl_Pic8);
		

		lbl_Pic9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "9";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Pic9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pic9.setBounds(425, 716, 150, 200);
		Main_panel.add(lbl_Pic9);
		

		lbl_Game7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "7";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Game7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game7.setBounds(25, 953, 150, 40);
		Main_panel.add(lbl_Game7);
		

		lbl_Game8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "8";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Game8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game8.setBounds(225, 953, 150, 40);
		Main_panel.add(lbl_Game8);
		
		
		lbl_Game9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ID = "9";
				GamePage gamepage = new GamePage();
				gamepage.setVisible(true);
				MainPage.setVisible(false);
			}
		});
		lbl_Game9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Game9.setBounds(425, 953, 150, 40);
		Main_panel.add(lbl_Game9);
		
		Function f = new Function();
	    ResultSet rs = null;
	    rs = f.find("1");
	    try{
	      if(rs.next()){
	          lbl_Game1.setText(rs.getString("name"));
	          lbl_Pic1.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/1.jpg")));
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
	          lbl_Pic2.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/2.jpg")));
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
	          lbl_Pic3.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/3.png")));
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
	          lbl_Pic4.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/4.jpeg")));
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
	          lbl_Pic5.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/5.png")));
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
	          lbl_Pic6.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/6.jpeg")));
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
	          lbl_Pic7.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/7.jpg")));
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
	          lbl_Pic8.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/8.jpeg")));
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
	          lbl_Pic9.setIcon(new ImageIcon(MainPage.class.getResource("/Picture/9.jpg")));
	      }  else{
	          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
	      }
	    }catch(Exception ex){
	           JOptionPane.showMessageDialog(null, ex.getMessage());
	            }
	    lbaction.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Action();
			}
		});
	    lbrpg.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				RPG();
			}
		});
	    lbsimulation.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Simulation();
			}
		});
	    lbgamehit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				HIT();
			}
		});
	    
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		MainPage.setVisible(b);
	}
	
	public static void Action() {
		lbl_Game4.setVisible(false);
		lbl_Game5.setVisible(false);
		lbl_Game6.setVisible(false);
		lbl_Game7.setVisible(false);
		lbl_Game8.setVisible(false);
		lbl_Game9.setVisible(false);
		lbl_Pic4.setVisible(false);
		lbl_Pic5.setVisible(false);
		lbl_Pic6.setVisible(false);
		lbl_Pic7.setVisible(false);
		lbl_Pic8.setVisible(false);
		lbl_Pic9.setVisible(false);
		
		lbl_Game1.setVisible(true);
		lbl_Game2.setVisible(true);
		lbl_Game3.setVisible(true);
		lbl_Pic1.setVisible(true);
		lbl_Pic2.setVisible(true);
		lbl_Pic3.setVisible(true);
		
		lbl_Pic1.setBounds(25, 50, 150, 200);
		lbl_Pic2.setBounds(225, 50, 150, 200);
		lbl_Pic3.setBounds(425, 50, 150, 200);
		lbl_Game1.setBounds(25, 287, 150, 40);
		lbl_Game2.setBounds(225, 287, 150, 40);
		lbl_Game3.setBounds(425, 287, 150, 40);
	}
	
	public static void Simulation() {
		lbl_Game4.setVisible(false);
		lbl_Game5.setVisible(false);
		lbl_Game6.setVisible(false);
		lbl_Game1.setVisible(false);
		lbl_Game2.setVisible(false);
		lbl_Game3.setVisible(false);
		lbl_Pic4.setVisible(false);
		lbl_Pic5.setVisible(false);
		lbl_Pic6.setVisible(false);
		lbl_Pic1.setVisible(false);
		lbl_Pic2.setVisible(false);
		lbl_Pic3.setVisible(false);
		
		lbl_Game7.setVisible(true);
		lbl_Game8.setVisible(true);
		lbl_Game9.setVisible(true);
		lbl_Pic7.setVisible(true);
		lbl_Pic8.setVisible(true);
		lbl_Pic9.setVisible(true);
		
		lbl_Pic7.setBounds(25, 50, 150, 200);
		lbl_Pic8.setBounds(225, 50, 150, 200);
		lbl_Pic9.setBounds(425, 50, 150, 200);
		lbl_Game7.setBounds(25, 287, 150, 40);
		lbl_Game8.setBounds(225, 287, 150, 40);
		lbl_Game9.setBounds(425, 287, 150, 40);
	}
	
	public static void RPG() {
		lbl_Game1.setVisible(false);
		lbl_Game2.setVisible(false);
		lbl_Game3.setVisible(false);
		lbl_Game7.setVisible(false);
		lbl_Game8.setVisible(false);
		lbl_Game9.setVisible(false);
		lbl_Pic1.setVisible(false);
		lbl_Pic2.setVisible(false);
		lbl_Pic3.setVisible(false);
		lbl_Pic7.setVisible(false);
		lbl_Pic8.setVisible(false);
		lbl_Pic9.setVisible(false);
		
		lbl_Game4.setVisible(true);
		lbl_Game5.setVisible(true);
		lbl_Game6.setVisible(true);
		lbl_Pic4.setVisible(true);
		lbl_Pic5.setVisible(true);
		lbl_Pic6.setVisible(true);
		
		lbl_Pic4.setBounds(25, 50, 150, 200);
		lbl_Pic5.setBounds(225, 50, 150, 200);
		lbl_Pic6.setBounds(425, 50, 150, 200);
		lbl_Game4.setBounds(25, 287, 150, 40);
		lbl_Game5.setBounds(225, 287, 150, 40);
		lbl_Game6.setBounds(425, 287, 150, 40);
	}
	
	public static void HIT() {
		
		lbl_Game1.setVisible(true);
		lbl_Game2.setVisible(true);
		lbl_Game3.setVisible(true);
		lbl_Game4.setVisible(true);
		lbl_Game5.setVisible(true);
		lbl_Game6.setVisible(true);
		lbl_Game7.setVisible(true);
		lbl_Game8.setVisible(true);
		lbl_Game9.setVisible(true);
		lbl_Pic1.setVisible(true);
		lbl_Pic2.setVisible(true);
		lbl_Pic3.setVisible(true);
		lbl_Pic4.setVisible(true);
		lbl_Pic5.setVisible(true);
		lbl_Pic6.setVisible(true);
		lbl_Pic7.setVisible(true);
		lbl_Pic8.setVisible(true);
		lbl_Pic9.setVisible(true);
		
		lbl_Pic3.setBounds(25, 50, 150, 200);
		lbl_Pic2.setBounds(225, 50, 150, 200);
		lbl_Pic4.setBounds(425, 50, 150, 200);
		lbl_Game3.setBounds(25, 287, 150, 40); 
		lbl_Game2.setBounds(225, 287, 150, 40);
		lbl_Game4.setBounds(425, 287, 150, 40);
		lbl_Pic5.setBounds(25, 383, 150, 200);
		lbl_Pic1.setBounds(225, 383, 150, 200);
		lbl_Pic7.setBounds(425, 383, 150, 200);
		lbl_Game5.setBounds(25, 620, 150, 40);
		lbl_Game1.setBounds(225, 620, 150, 40);
		lbl_Game7.setBounds(425, 620, 150, 40);
		lbl_Pic9.setBounds(25, 716, 150, 200);
		lbl_Pic6.setBounds(225, 716, 150, 200);
		lbl_Pic8.setBounds(425, 716, 150, 200);
		lbl_Game9.setBounds(25, 953, 150, 40);
		lbl_Game6.setBounds(225, 953, 150, 40);
		lbl_Game8.setBounds(425, 953, 150, 40);
		
	}
	
	public static void MainMenu() {
		
		lbl_Game1.setVisible(true);
		lbl_Game2.setVisible(true);
		lbl_Game3.setVisible(true);
		lbl_Game4.setVisible(true);
		lbl_Game5.setVisible(true);
		lbl_Game6.setVisible(true);
		lbl_Game7.setVisible(true);
		lbl_Game8.setVisible(true);
		lbl_Game9.setVisible(true);
		lbl_Pic1.setVisible(true);
		lbl_Pic2.setVisible(true);
		lbl_Pic3.setVisible(true);
		lbl_Pic4.setVisible(true);
		lbl_Pic5.setVisible(true);
		lbl_Pic6.setVisible(true);
		lbl_Pic7.setVisible(true);
		lbl_Pic8.setVisible(true);
		lbl_Pic9.setVisible(true);
		
		lbl_Pic1.setBounds(25, 50, 150, 200);
		lbl_Pic2.setBounds(225, 50, 150, 200);
		lbl_Pic3.setBounds(425, 50, 150, 200);
		lbl_Game1.setBounds(25, 287, 150, 40); 
		lbl_Game2.setBounds(225, 287, 150, 40);
		lbl_Game3.setBounds(425, 287, 150, 40);
		lbl_Pic4.setBounds(25, 383, 150, 200);
		lbl_Pic5.setBounds(225, 383, 150, 200);
		lbl_Pic6.setBounds(425, 383, 150, 200);
		lbl_Game4.setBounds(25, 620, 150, 40);
		lbl_Game5.setBounds(225, 620, 150, 40);
		lbl_Game6.setBounds(425, 620, 150, 40);
		lbl_Pic7.setBounds(25, 716, 150, 200);
		lbl_Pic8.setBounds(225, 716, 150, 200);
		lbl_Pic9.setBounds(425, 716, 150, 200);
		lbl_Game7.setBounds(25, 953, 150, 40);
		lbl_Game8.setBounds(225, 953, 150, 40);
		lbl_Game9.setBounds(425, 953, 150, 40);
		
	}
	
	public static void search(String A) {
		
		switch(A) {
		case"Farcry" : ID = "1";GamePage gamepage = new GamePage();gamepage.setVisible(true);MainPage.setVisible(false);break;
		case"Sekiro" : ID = "2";GamePage gamepage1 = new GamePage();gamepage1.setVisible(true);MainPage.setVisible(false);break;
		case"GTA V" : ID = "3";GamePage gamepage2 = new GamePage();gamepage2.setVisible(true);MainPage.setVisible(false);break;
		case"Stardew Valley" : ID = "4";GamePage gamepage3 = new GamePage();gamepage3.setVisible(true);MainPage.setVisible(false);break;
		case"Monster Hunter World" : ID = "5";GamePage gamepage4 = new GamePage();gamepage4.setVisible(true);MainPage.setVisible(false);break;
		case"Jump Force" : ID = "6";GamePage gamepage5 = new GamePage();gamepage5.setVisible(true);MainPage.setVisible(false);break;
		case"Farming Simulator" : ID = "7";GamePage gamepage6 = new GamePage();gamepage6.setVisible(true);MainPage.setVisible(false);break;
		case"Train Simulator" : ID = "8";GamePage gamepage7 = new GamePage();gamepage7.setVisible(true);MainPage.setVisible(false);break;
		case"Hand Simulator" : ID = "9";GamePage gamepage8 = new GamePage();gamepage8.setVisible(true);MainPage.setVisible(false);break;
		default :
			JOptionPane.showMessageDialog(null,"No Game Found");
		}
	}
	
}
