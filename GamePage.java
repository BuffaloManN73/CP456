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

public class GamePage{
	static ArrayList<String>gameList = new ArrayList<>();
	
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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		GamePage = new JFrame();
		GamePage.setBounds(100, 100, 650, 1000);
		GamePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePage.getContentPane().setLayout(null);
		
		JPanel Head_panel = new JPanel();
		Head_panel.setBackground(Color.WHITE);
		Head_panel.setBounds(0, 0, 634, 410);
		GamePage.getContentPane().add(Head_panel);
		Head_panel.setLayout(null);
		Head_panel.setOpaque(false);
		
		/*
		 * copypaste from header.java 21/04/19 
		 * 
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(header.class.getResource("/Picture/logo.png")));
		lblLogo.setBounds(0, 0, 300, 150);
		Head_panel.add(lblLogo);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(header.class.getResource("/Picture/search.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(287, 24, 340, 45);
		Head_panel.add(lblNewLabel);
		
		JLabel lbmain = new JLabel("");
		lbmain.setIcon(new ImageIcon("C:\\Users\\Administrator\\appreviewgame\\Picture\\\u0E1B\u0E38\u0E48\u0E21\u0E2B\u0E19\u0E49\u0E32\u0E2B\u0E25\u0E31\u0E01.png"));
		lbmain.setBounds(8, 161, 200, 50);
		Head_panel.add(lbmain);
		
		JLabel lbgamehit = new JLabel("");
		lbgamehit.setIcon(new ImageIcon("C:\\Users\\Administrator\\appreviewgame\\Picture\\\u0E1B\u0E38\u0E48\u0E21\u0E40\u0E01\u0E21\u0E2E\u0E34\u0E15.png"));
		lbgamehit.setBounds(218, 161, 200, 50);
		Head_panel.add(lbgamehit);
		
		JLabel lbstory = new JLabel("");
		lbstory.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21story.png")));
		lbstory.setBounds(428, 213, 200, 50);
		lbstory.setVisible(false);
		Head_panel.add(lbstory);
		
		JLabel lbaction = new JLabel("");
		lbaction.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21action.png")));
		lbaction.setBounds(428, 265, 200, 50);
		lbaction.setVisible(false);
		Head_panel.add(lbaction);
		
		JLabel lbsimulation = new JLabel("");
		lbsimulation.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21simulation.png")));
		lbsimulation.setBounds(428, 317, 200, 50);
		lbsimulation.setVisible(false);
		Head_panel.add(lbsimulation);
		
		JLabel lbtype = new JLabel("");
		lbtype.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21\u0E2B\u0E21\u0E27\u0E14\u0E2B\u0E21\u0E39\u0E48.png")));
		lbtype.setBounds(428, 161, 200, 50);
		Head_panel.add(lbtype);
		lbtype.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				if(i  == 0){
					lbaction.setVisible(true);
					lbstory.setVisible(true);
					lbsimulation.setVisible(true);
					i = 1;
				}else {
					lbaction.setVisible(false);
					lbstory.setVisible(false);
					lbsimulation.setVisible(false);
					i = 0;
				}
			}
		});
		*/
		
		
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
				MainPage mainpage = new MainPage();
				mainpage.setVisible(true);
				GamePage.setVisible(false);
			}
		});
		Game_panel.add(btnBack);
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (gameList.size() < 3){
					gameList.add(MainPage.ID);
					JOptionPane.showMessageDialog(null, "Added!!");
					//System.out.print(gameList);
			}else {
					JOptionPane.showMessageDialog(null, "Can't do that!!");
			}
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
	   	 lbl_Picture.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/1.jpg")));
	       break;
	    case "2" :
	   	 lbl_Picture.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/2.jpg")));
	       break;
	    case "3" :
	   	 lbl_Picture.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/3.png")));
	       break;
	    case "4" :
	   	 lbl_Picture.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/4.jpeg")));
	       break;
	    case "5" :
	   	 lbl_Picture.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/5.png")));
	       break;
	    case "6" :
	   	 lbl_Picture.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/6.jpeg")));
	       break;
	    case "7" :
	   	 lbl_Picture.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/7.jpg")));
	       break;
	    case "8" :
	   	 lbl_Picture.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/8.jpeg")));
	       break;
	    case "9" :
	   	 lbl_Picture.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/9.jpg")));
	       break;
	   }
	}
	
	

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		GamePage.setVisible(b);
	}
}
