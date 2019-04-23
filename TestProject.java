import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.MouseEvent;

import org.junit.jupiter.api.Test;

/*import org.junit.runner.*;
@RunWith(JUnit5.class)*/
class TestProject {
	//@Test
	void testloginsuccess() {
		String username = "test";
		String password = "test";
		
		
		LoginPage.textFieldusername.setText(username);
		LoginPage.textFieldpassword.setText(password);
		//LoginPage.btnLogin.doClick();
		LoginPage.login();
		assertEquals(true,LoginPage.username[0].equals("test"));
		//assertEquals(true,LoginPage.textFieldusername.getText().equals("ok"));
		//assertEquals(true,username.equals("test"));
		//assertEquals(true,LoginPage.textFieldusername.getText().equals("test"));
	}
	
	//@Test
	void testregistersuccess() {
		/*for (int i = 20; i > 0; i++) {
			String test = Integer.toString(i);
			String username = test;
			String password = test;
			String email = test;
			String phone = test;
		}*/
		String username = "test2";
		String password = "test2";
		String email = "test2";
		String phone = "0852542365";
		
		
		
		RegisterPage.textFieldUsername.setText(username);
		RegisterPage.textFieldPassword.setText(password);
		RegisterPage.textFieldemail.setText(email);
		RegisterPage.textFielphone.setText(phone);
		RegisterPage.register();
		
		//LoginPage.btnLogin.doClick();
		assertEquals(1,RegisterPage.reg);
	}
	@Test
	void testLoginPageform() {

		LoginPage.main(null);

		
		//assertEquals(true,LoginPage.frmLogin);
		assertEquals(true,LoginPage.frmLogin.isVisible());
		//assertEquals(1,LoginPage.frame);
	}

	/*
	@Test
	void testAddArray() {
		//checking User can add ID into Array
		String gameid = "1";
		TestBasket.addgameid(gameid);
		assertEquals("1",TestBasket.gameList.get(0));
	} */
	/*
	@Test
	void testRemoveArray() {
		//checking User can remove ID in Array
		String gameid = "1";
		TestBasket.addgameid(gameid);
		int index = TestBasket.gameList.indexOf(gameid);
		TestBasket.removegameid(index);
		boolean test = TestBasket.gameList.isEmpty();
		assertEquals(true,test);
	}
	*/
	/*
	void testSQL() {
		//checking SQL can connect to Program by looking at I
		String gameid = "1";
		TestBasket.addgameid(gameid);
		//TestBasket.finegamename(1);
		//TestBasket.
		assertEquals("Farcry5",TestBasket.name.get(0));
		 
	}*/


}