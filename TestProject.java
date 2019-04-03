import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.MouseEvent;

import org.junit.jupiter.api.Test;

class TestProject {

	@Test
	void testAddArray() {
		//checking User can add ID into Array
		String gameid = "1";
		TestBasket.addgameid(gameid);
		assertEquals("1",TestBasket.gameList.get(0));
	}
	
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
