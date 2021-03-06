import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;


import java.awt.Color;
import javax.swing.JTextField;

public class GamePage{
	static ArrayList<String>gameList = new ArrayList<>();
	int i = 0;
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
	    
 
	
	
	
	
	private JFrame GamePage;
	private final JLabel lbl_Score_Head = new JLabel("Score");
	private final JLabel lbl_Score_Detail = new JLabel("score");
	private final JButton btnBack = new JButton("Back");
	private final JButton btnAdd = new JButton("Add");
	static JTextField txt_Search = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamePage window = new GamePage();
					window.GamePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GamePage() {
		initialize();
	}

	
	public static void addorder() {
		try {
			
		    //ResultSet rs = null;
		    Connection con = null;
		    PreparedStatement ps = null;
		    con = DriverManager.getConnection("jdbc:mysql://localhost/game","root","");
		    ps = con.prepareStatement("SELECT * FROM user WHERE username = LoginPage.username[0]");
			String query = "UPDATE user SET game1 = ?, game2 = ?, game3 = ? WHERE user.username = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(4, LoginPage.username[0]);
			//pst.setString(1, "ss");
			//pst.setString(2, "ss");
			//pst.setString(3, "sssssss");
			//pst.setString(4, LoginPage.username[0]);
			//System.out.print(LoginPage.username[0]);
			//pst.execute();
			//JOptionPane.showMessageDialog(null, "Order Success");
			//}catch (Exception e) {
			//	JOptionPane.showMessageDialog(null, "Fail");
			//}
			
			if(gameList.size() == 0) {
				JOptionPane.showMessageDialog(null, "add game before confirm");
			}else if(gameList.size() == 1){
				pst.setString(1, gameList.get(0));
				pst.setString(2, null);
				pst.setString(3, null);
				pst.execute();
				JOptionPane.showMessageDialog(null, "Order Success1");
			}else if(gameList.size() == 2){
				pst.setString(1, gameList.get(0));
				pst.setString(2, gameList.get(1));
				pst.setString(3, null);
				pst.execute();
				JOptionPane.showMessageDialog(null, "Order Success2");
			}else if(gameList.size() == 3){
				pst.setString(1, gameList.get(0));
				pst.setString(2, gameList.get(1));
				pst.setString(3, gameList.get(2));
				pst.execute();
				JOptionPane.showMessageDialog(null, "Order Success3");
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fail");
		}
		
		
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		GamePage = new JFrame();
		GamePage.setTitle("appbuygame");
		GamePage.setBounds(100, 100, 650, 1000);
		GamePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePage.getContentPane().setLayout(null);
		
		JPanel Head_panel = new JPanel();
		Head_panel.setBackground(Color.WHITE);
		Head_panel.setBounds(0, 0, 634, 410);
		GamePage.getContentPane().add(Head_panel);
		Head_panel.setLayout(null);
		Head_panel.setOpaque(false);
		
		
		txt_Search.setColumns(10);
		txt_Search.setBounds(355, 70, 260, 33);
		Head_panel.add(txt_Search);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/logo.png")));
		lblLogo.setBounds(0, 0, 300, 150);
		Head_panel.add(lblLogo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				MainPage.search(txt_Search.getText());
			}
		});
		lblNewLabel.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/search.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(288, 64, 340, 45);
		Head_panel.add(lblNewLabel);
		
		JLabel lbmain = new JLabel("");
		lbmain.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				MainPage mainpage = new MainPage();
				mainpage.setVisible(true);
				GamePage.setVisible(false);
				MainPage.MainMenu();
			}
		});
		lbmain.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21\u0E2B\u0E19\u0E49\u0E32\u0E2B\u0E25\u0E31\u0E01.png")));
		lbmain.setBounds(8, 161, 200, 50);
		Head_panel.add(lbmain);
		
		JLabel lbgamehit = new JLabel("");
		lbgamehit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				MainPage mainpage = new MainPage();
				mainpage.setVisible(true);
				GamePage.setVisible(false);	
				MainPage.HIT();
			}
		});
		lbgamehit.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21\u0E40\u0E01\u0E21\u0E2E\u0E34\u0E15.png")));
		lbgamehit.setBounds(218, 161, 200, 50);
		Head_panel.add(lbgamehit);
		
		JLabel lbrpg = new JLabel("");
		lbrpg.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				MainPage mainpage = new MainPage();
				mainpage.setVisible(true);
				GamePage.setVisible(false);	
				MainPage.RPG();
			}
		});
		lbrpg.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21rpg.png")));
		lbrpg.setBounds(428, 213, 200, 50);
		lbrpg.setVisible(false);
		Head_panel.add(lbrpg);
		
		JLabel lbaction = new JLabel("");
		lbaction.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				MainPage mainpage = new MainPage();
				mainpage.setVisible(true);
				GamePage.setVisible(false);	
				MainPage.Action();
			}
		});
		lbaction.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21action.png")));
		lbaction.setBounds(428, 265, 200, 50);
		lbaction.setVisible(false);
		Head_panel.add(lbaction);
		
		JLabel lbsimulation = new JLabel("");
		lbsimulation.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				MainPage mainpage = new MainPage();
				mainpage.setVisible(true);
				GamePage.setVisible(false);	
				MainPage.Simulation();
			}
		});
		lbsimulation.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21simulation.png")));
		lbsimulation.setBounds(428, 317, 200, 50);
		lbsimulation.setVisible(false);
		Head_panel.add(lbsimulation);
		
		JLabel lbtype = new JLabel("");
		lbtype.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21\u0E2B\u0E21\u0E27\u0E14\u0E2B\u0E21\u0E39\u0E48.png")));
		lbtype.setBounds(428, 161, 200, 50);
		Head_panel.add(lbtype);
		
		JButton button = new JButton("");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				BasketPage basketpage = new BasketPage();
				basketpage.setVisible(true);
				GamePage.setVisible(false);
			}
		});
		button.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/basket.png")));
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
		
		
		JPanel Game_panel = new JPanel();
		Game_panel.setPreferredSize(new Dimension(600,900));
		Game_panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(Game_panel);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 236, 634, 714);
		GamePage.getContentPane().add(scrollPane);
		scrollPane.setPreferredSize(new Dimension(600,700));
		
		JLabel lbl_Picture = new JLabel("picture");
		lbl_Picture.setBounds(149, 5, 300, 400);
		Game_panel.add(lbl_Picture);
		lbl_Picture.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_Name = new JLabel("Name");
		lbl_Name.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbl_Name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Name.setBounds(42, 416, 510, 29);
		Game_panel.add(lbl_Name);
		
		JLabel lbl_Review_Head = new JLabel("Review");
		lbl_Review_Head.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_Review_Head.setBounds(10, 456, 73, 16);
		Game_panel.add(lbl_Review_Head);
		
		JLabel lbl_Review_Detail = new JLabel("Detail\r\n");
		lbl_Review_Detail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_Review_Detail.setVerticalAlignment(SwingConstants.TOP);
		lbl_Review_Detail.setBounds(42, 483, 510, 200);
		Game_panel.add(lbl_Review_Detail);
		
		lbl_Score_Head.setBounds(10, 700, 57, 31);
		Game_panel.add(lbl_Score_Head);
		lbl_Score_Head.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_Score_Detail.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		lbl_Score_Detail.setBounds(100, 695, 100, 31);
		Game_panel.add(lbl_Score_Detail);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnBack.setBounds(100, 800, 150, 50);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainPage.MainMenu();
				MainPage mainpage = new MainPage();
				mainpage.setVisible(true);
				GamePage.setVisible(false);
			}
		});
		Game_panel.add(btnBack);
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				add();
			}

		});
		
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBounds(350, 800, 150, 50);
		Game_panel.add(btnAdd);
		
		Function f = new Function();
	    ResultSet rs = null;
	    rs = f.find(MainPage.ID);
	    try{
	      if(rs.next()){
	          lbl_Name.setText(rs.getString("name"));
	          lbl_Review_Detail.setText(rs.getString("review"));
	          lbl_Score_Detail.setText(rs.getString("Score"));
	          
	      }  else{
	          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
	      }
	    }catch(Exception ex){
	           JOptionPane.showMessageDialog(null, ex.getMessage());
	            }
	    switch(MainPage.ID) {
        case "1" :
       	 lbl_Picture.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/1.jpg")));
           break;
        case "2" :
       	 lbl_Picture.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/2.jpg")));
           break;
        case "3" :
       	 lbl_Picture.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/3.png")));
           break;
        case "4" :
       	 lbl_Picture.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/4.jpeg")));
           break;
        case "5" :
       	 lbl_Picture.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/5.png")));
           break;
        case "6" :
       	 lbl_Picture.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/6.jpeg")));
           break;
        case "7" :
       	 lbl_Picture.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/7.jpg")));
           break;
        case "8" :
       	 lbl_Picture.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/8.jpeg")));
           break;
        case "9" :
       	 lbl_Picture.setIcon(new ImageIcon(GamePage.class.getResource("/Picture/9.jpg")));
           break;
	    }
	    lbl_Picture.setText(null);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		GamePage.setVisible(b);
	}
	public static void add() {
		if (gameList.size() < 3){
			gameList.add(MainPage.ID);
			JOptionPane.showMessageDialog(null, "Added!!");
			//System.out.print(gameList);
	}else {
			JOptionPane.showMessageDialog(null, "Can't do that!!");
	}
	
	}
}
