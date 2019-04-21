import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;

public class GamePage {
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
		Head_panel.setBounds(12, 13, 608, 210);
		GamePage.getContentPane().add(Head_panel);
		Head_panel.setLayout(null);
		
		
		
		JPanel Game_panel = new JPanel();
		Game_panel.setPreferredSize(new Dimension(600,900));
		Game_panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(Game_panel);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(12, 236, 608, 714);
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
		Game_panel.add(btnBack);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnAdd.setBounds(350, 800, 150, 50);
		Game_panel.add(btnAdd);
		
		Function f = new Function();
	    ResultSet rs = null;
	    rs = f.find("1");
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
	}
}
