import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.MouseEvent;

import org.junit.jupiter.api.Test;

/*import org.junit.runner.*;
@RunWith(JUnit5.class)*/
class TestProject {
	@Test
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
	
	
	void testregistersuccess() {
		String username = "test1";
		String password = "test1";
		String email = "test1";
		String phone = "0852542365";
		
		RegisterPage.textFieldUsername.setText(username);
		RegisterPage.textFieldPassword.setText(password);
		LoginPage.btnLogin.doClick();
		assertEquals("test",LoginPage.username[0]);
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