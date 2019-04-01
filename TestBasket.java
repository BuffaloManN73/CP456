import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JScrollPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;


public class TestBasket {

	private JFrame TestBasket;
	private JTextField textField_ID;
	private JTextField textField_Name;
	private JTextField textField_Type;
	private JTextField textField_Score;
	private JTextArea textArea_Review;
	ArrayList<String>gameList = new ArrayList<>();
	/**
	 * Launch the application.
	 */
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
	public static void main(String[] args) {
			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestBasket window = new TestBasket();
					window.TestBasket.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public TestBasket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		TestBasket = new JFrame();
		TestBasket.setBounds(100, 100, 700, 500);
		TestBasket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		textField_ID = new JTextField();
		textField_ID.setBounds(166, 86, 116, 22);
		textField_ID.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(40, 89, 56, 16);
		
		JLabel lblPicture = new JLabel("picture",SwingConstants.CENTER);
		lblPicture.setBounds(351, 89, 267, 274);
		
		textField_Name = new JTextField();
		textField_Name.setEditable(false);
		textField_Name.setBounds(166, 132, 116, 22);
		textField_Name.setColumns(10);
		
		textField_Type = new JTextField();
		textField_Type.setEditable(false);
		textField_Type.setBounds(166, 172, 116, 22);
		textField_Type.setColumns(10);
		
		textField_Score = new JTextField();
		textField_Score.setEditable(false);
		textField_Score.setBounds(166, 344, 116, 22);
		textField_Score.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(40, 135, 56, 16);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(40, 175, 56, 16);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setBounds(40, 347, 56, 16);
		
		JLabel lblReview = new JLabel("Review");
		lblReview.setBounds(40, 213, 71, 16);
		
		textArea_Review = new JTextArea();
		textArea_Review.setEditable(false);
		textArea_Review.setBounds(166, 212, 173, 114);
		textArea_Review.setColumns(10);
		textArea_Review.setLineWrap(true);
		textArea_Review.setWrapStyleWord(true);
		
		
		TestBasket.getContentPane().setLayout(null);
		TestBasket.getContentPane().add(lblNewLabel);
		TestBasket.getContentPane().add(lblName);
		TestBasket.getContentPane().add(lblType);
		TestBasket.getContentPane().add(lblReview);
		TestBasket.getContentPane().add(textField_ID);
		TestBasket.getContentPane().add(textArea_Review);
		TestBasket.getContentPane().add(textField_Name);
		TestBasket.getContentPane().add(textField_Type);
		TestBasket.getContentPane().add(lblPicture);
		TestBasket.getContentPane().add(lblScore);
		TestBasket.getContentPane().add(textField_Score);
		
		JLabel lblHeader = new JLabel("TestBuyGame");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setBounds(40, 13, 543, 63);
		TestBasket.getContentPane().add(lblHeader);
		
		JLabel label = new JLabel("\u0E15\u0E30\u0E01\u0E23\u0E49\u0E32");
		label.setBounds(550, 33, 84, 43);
		TestBasket.getContentPane().add(label);
		
		JLabel lblSearch = new JLabel("");
		lblSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Function f = new Function();
			    ResultSet rs = null;
			    String name = "name";
			    String type = "type";
			    String review = "review";
			    String score = "score";
			    String picture = "picture";
			    
			 
			    rs = f.find(textField_ID.getText());
			    System.out.print(rs);
			    try{
			      if(rs.next()){
			          textField_Name.setText(rs.getString("name"));
			          textField_Type.setText(rs.getString("type"));
			          textArea_Review.setText(rs.getString("review"));
			          textField_Score.setText(rs.getString("score"));
			          lblPicture.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/1.jpg")));//lblPicture.setText(rs.getString("picture"))
			          
			      }  else{
			          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
			      }
			    }catch(Exception ex){
			           JOptionPane.showMessageDialog(null, ex.getMessage());
			            }
			}
		});
		lblSearch.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21search.png")));
		lblSearch.setBounds(150, 379, 200, 50);
		TestBasket.getContentPane().add(lblSearch);
		
		JLabel lblBasket = new JLabel("");
		lblBasket.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				TestBasket2 testbasket = new TestBasket2();
				testbasket.setVisible(true);
				TestBasket.setVisible(false);
			}
		});
		lblBasket.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/basket.png")));
		lblBasket.setBounds(609, 13, 50, 50);
		TestBasket.getContentPane().add(lblBasket);
		
		JLabel lblAdd = new JLabel("AddGame");
		lblAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (Integer.parseInt(textField_ID.getText()) < 10 &&Integer.parseInt(textField_ID.getText()) >0 && gameList.size() < 3){
						gameList.add(textField_ID.getText());
						JOptionPane.showMessageDialog(null, "Added!!");
						//System.out.print(gameList);
				}else {
						JOptionPane.showMessageDialog(null, "Can't do that!!");
				}
					
			}
		});
		lblAdd.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21add.png")));
		lblAdd.setBounds(417, 376, 200, 53);
		TestBasket.getContentPane().add(lblAdd);
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		TestBasket.setVisible(b);
	}
}
