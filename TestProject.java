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
		LoginPage.login();
		assertEquals(true,LoginPage.username[0].equals("test"));

	}
	@Test
	void testregistersuccess() {

		String username = "test7";
		String password = "test4";
		String email = "test4";
		String phone = "0852542365";
		
		RegisterPage.textFieldUsername.setText(username);
		RegisterPage.textFieldPassword.setText(password);
		RegisterPage.textFieldemail.setText(email);
		RegisterPage.textFielphone.setText(phone);
		RegisterPage.register();
		
		assertEquals(true,LoginPage.frmLogin.isVisible());
		
	}
	@Test
	void testSearchGame() {
		MainPage.txt_Search.setText("Farcry");
		MainPage.search(MainPage.txt_Search.getText());
		assertEquals("1",MainPage.ID);
		MainPage.txt_Search.setText("Sekiro");
		MainPage.search(MainPage.txt_Search.getText());
		assertEquals("2",MainPage.ID);
		MainPage.txt_Search.setText("GTA V");
		MainPage.search(MainPage.txt_Search.getText());
		assertEquals("3",MainPage.ID);
		MainPage.txt_Search.setText("Stardew Valley");
		MainPage.search(MainPage.txt_Search.getText());
		assertEquals("4",MainPage.ID);
		MainPage.txt_Search.setText("Monster Hunter World");
		MainPage.search(MainPage.txt_Search.getText());
		assertEquals("5",MainPage.ID);
		MainPage.txt_Search.setText("Jump Force");
		MainPage.search(MainPage.txt_Search.getText());
		assertEquals("6",MainPage.ID);
		MainPage.txt_Search.setText("Farming Simulator");
		MainPage.search(MainPage.txt_Search.getText());
		assertEquals("7",MainPage.ID);
		MainPage.txt_Search.setText("Train Simulator");
		MainPage.search(MainPage.txt_Search.getText());
		assertEquals("8",MainPage.ID);
		MainPage.txt_Search.setText("Hand Simulator");
		MainPage.search(MainPage.txt_Search.getText());
		assertEquals("9",MainPage.ID);
	}
	@Test
	void testHeaderFunction() {
		MainPage.Action();
		assertEquals(25,MainPage.lbl_Pic1.getLocation().getX());
		assertEquals(50,MainPage.lbl_Pic1.getLocation().getY());
		
		MainPage.Simulation(); 
		assertEquals(25,MainPage.lbl_Pic7.getLocation().getX());
		assertEquals(50,MainPage.lbl_Pic7.getLocation().getY());
		
		MainPage.RPG();
		assertEquals(25,MainPage.lbl_Pic4.getLocation().getX());
		assertEquals(50,MainPage.lbl_Pic4.getLocation().getY());
		
		MainPage.HIT();
		assertEquals(25,MainPage.lbl_Pic3.getLocation().getX());
		assertEquals(50,MainPage.lbl_Pic3.getLocation().getY());
		
		MainPage.MainMenu();
		assertEquals(25,MainPage.lbl_Pic1.getLocation().getX());
		assertEquals(50,MainPage.lbl_Pic1.getLocation().getY());	 
	}
	@Test
	void testAddGame(){
		MainPage.ID = "1";
		GamePage.add();
		assertEquals("1",GamePage.gameList.get(0));
		GamePage.gameList.clear();
	}
	@Test
	void testRemoveGame() {
		GamePage.gameList.add("1");
		BasketPage.chckbxGame1.setSelected(true);
		BasketPage.remove();
		assertEquals(true,GamePage.gameList.isEmpty());
	}
	/*
	void testLoginPageform() {

		LoginPage.main(null);
		//assertEquals(true,LoginPage.frmLogin);
		assertEquals(true,LoginPage.frmLogin.isVisible());
		//assertEquals(1,LoginPage.frame);
	}
	*/
	/*
	@Test
	void testBasketPage() {
		GamePage.gameList.add("1");
		assertEquals(true,BasketPage.chckbxGame1.isVisible());
		GamePage.gameList.add("2");
		assertEquals(true,BasketPage.chckbxGame2.isVisible());
		GamePage.gameList.add("3");
		assertEquals(true,BasketPage.chckbxGame3.isVisible());
		GamePage.gameList.clear();
		GamePage.gameList.add("4");
		assertEquals(true,BasketPage2.chckbxGame1.isVisible());
		GamePage.gameList.add("5");
		assertEquals(true,BasketPage2.chckbxGame2.isVisible());
		GamePage.gameList.add("6");
		assertEquals(true,BasketPage2.chckbxGame3.isVisible());	
	}
	*/
	
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