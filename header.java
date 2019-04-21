import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class header {
	int i = 0; //for making dropdown menu
	private JFrame frmAppreviewgame;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					header window = new header();
					window.frmAppreviewgame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public header() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAppreviewgame = new JFrame();
		frmAppreviewgame.setTitle("AppReviewGame");
		frmAppreviewgame.setBounds(100, 100, 650, 410);
		frmAppreviewgame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAppreviewgame.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(header.class.getResource("/Picture/logo.png")));
		lblLogo.setBounds(0, 0, 300, 150);
		frmAppreviewgame.getContentPane().add(lblLogo);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(355, 69, 260, 35);
		frmAppreviewgame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(header.class.getResource("/Picture/search.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(288, 64, 340, 45);
		frmAppreviewgame.getContentPane().add(lblNewLabel);
		
		JLabel lbmain = new JLabel("");
		lbmain.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21\u0E2B\u0E19\u0E49\u0E32\u0E2B\u0E25\u0E31\u0E01.png")));
		lbmain.setBounds(8, 161, 200, 50);
		frmAppreviewgame.getContentPane().add(lbmain);
		
		JLabel lbgamehit = new JLabel("");
		lbgamehit.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21\u0E40\u0E01\u0E21\u0E2E\u0E34\u0E15.png")));
		lbgamehit.setBounds(218, 161, 200, 50);
		frmAppreviewgame.getContentPane().add(lbgamehit);
		
		JLabel lbstory = new JLabel("");
		lbstory.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21story.png")));
		lbstory.setBounds(428, 213, 200, 50);
		lbstory.setVisible(false);
		frmAppreviewgame.getContentPane().add(lbstory);
		
		JLabel lbaction = new JLabel("");
		lbaction.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21action.png")));
		lbaction.setBounds(428, 265, 200, 50);
		lbaction.setVisible(false);
		frmAppreviewgame.getContentPane().add(lbaction);
		
		JLabel lbsimulation = new JLabel("");
		lbsimulation.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21simulation.png")));
		lbsimulation.setBounds(428, 317, 200, 50);
		lbsimulation.setVisible(false);
		frmAppreviewgame.getContentPane().add(lbsimulation);
		
		JLabel lbtype = new JLabel("");
		lbtype.setIcon(new ImageIcon(header.class.getResource("/Picture/\u0E1B\u0E38\u0E48\u0E21\u0E2B\u0E21\u0E27\u0E14\u0E2B\u0E21\u0E39\u0E48.png")));
		lbtype.setBounds(428, 161, 200, 50);
		frmAppreviewgame.getContentPane().add(lbtype);
		
		JButton button = new JButton("");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				BasketPage basketpage = new BasketPage();
				basketpage.setVisible(true);
				frmAppreviewgame.setVisible(false);
			}
		});
		button.setIcon(new ImageIcon(header.class.getResource("/Picture/basket.png")));
		button.setBounds(537, 3, 83, 59);
		frmAppreviewgame.getContentPane().add(button);
		
		JLabel lblUser = new JLabel("User :");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUser.setBounds(312, 23, 72, 33);
		frmAppreviewgame.getContentPane().add(lblUser);
		
		
		
		
		JLabel lblname = new JLabel("New label");
		lblname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblname.setBounds(376, 27, 149, 25);
		frmAppreviewgame.getContentPane().add(lblname);
		lblname.setText(LoginPage.username[0]);
		
		
		
		lbtype.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(i == 0){
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
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frmAppreviewgame.setVisible(b);
	}
}
