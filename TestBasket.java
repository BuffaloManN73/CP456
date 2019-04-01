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

public class TestBasket {

	private JFrame TestBasket;
	private JTextField textField_ID;
	private JTextField textField_Name;
	private JTextField textField_Type;
	private JTextField textField_Score;
	private JTextField textField_Review;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
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
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setAction(action_1);
		btnSearch.setBounds(309, 379, 97, 25);
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnCheckout.setAction(action);
		btnCheckout.setBounds(457, 379, 97, 25);
		
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
		TestBasket.getContentPane().add(btnSearch);
		TestBasket.getContentPane().add(btnCheckout);
		
		JLabel lblHeader = new JLabel("TestBuyGame");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setBounds(40, 13, 543, 63);
		TestBasket.getContentPane().add(lblHeader);
		
		JScrollPane scrollPane_Review = new JScrollPane();
		scrollPane_Review.setBounds(324, 213, 15, 113);
		TestBasket.getContentPane().add(scrollPane_Review);
		
		JLabel lbsearch = new JLabel("");
		lbsearch.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21search.png")));
		lbsearch.setBounds(82, 389, 200, 50);
		TestBasket.getContentPane().add(lbsearch);
		
		JLabel lbbasket = new JLabel("");
		lbbasket.setIcon(new ImageIcon(TestBasket.class.getResource("/Picture/basket.png")));
		lbbasket.setBounds(609, 13, 50, 50);
		TestBasket.getContentPane().add(lbbasket);
	}
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
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Checkout");
			putValue(SHORT_DESCRIPTION, "Reset");
		}
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Search");
			putValue(SHORT_DESCRIPTION, "Find game");
		}
		public void actionPerformed(ActionEvent e) {
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
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		TestBasket.setVisible(b);
	}

}
