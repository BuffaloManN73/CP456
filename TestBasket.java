import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
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

public class TestBasket {

	private JFrame TestBasket;
	private JTextField textField_ID;
	private JTextField textField_Name;
	private JTextField textField_Type;
	private JTextField textField_Score;
	private JTextField textField_Review;
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
	           con = DriverManager.getConnection("jdbc:mysql://localhost/game","root","");
	           ps = con.prepareStatement("select * from game where id = 1");
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
		
		JLabel lblPicture = new JLabel("picture");
		lblPicture.setBounds(351, 89, 267, 274);
		lblPicture.setVerticalAlignment(SwingConstants.TOP);
		
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
		
		JLabel lblReview = new JLabel("Type");
		lblReview.setBounds(40, 213, 38, 16);
		
		textField_Review = new JTextField();
		textField_Review.setEditable(false);
		textField_Review.setBounds(166, 212, 173, 114);
		textField_Review.setColumns(10);
		TestBasket.getContentPane().setLayout(null);
		TestBasket.getContentPane().add(lblNewLabel);
		TestBasket.getContentPane().add(lblName);
		TestBasket.getContentPane().add(lblType);
		TestBasket.getContentPane().add(lblReview);
		TestBasket.getContentPane().add(textField_ID);
		TestBasket.getContentPane().add(textField_Review);
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
		
		JScrollPane scrollPane_Review = new JScrollPane();
		scrollPane_Review.setBounds(324, 213, 15, 113);
		TestBasket.getContentPane().add(scrollPane_Review);
		
		JLabel label = new JLabel("\u0E15\u0E30\u0E01\u0E23\u0E49\u0E32");
		label.setBounds(550, 33, 84, 43);
		TestBasket.getContentPane().add(label);
		TestBasket.getContentPane().add(scrollPane_Review);
		
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
			          textField_Review.setText(rs.getString("review"));
			          textField_Score.setText(rs.getString("score"));
			          //lblPicture.setText(rs.getString("picture")); i didn't why i doesn't work lul (BuffMan 31-3-19)
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
