import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.MouseEvent;

import org.junit.jupiter.api.Test;

class TestProject {
	private final TestBasket Test = new TestBasket();
	@Test
	void testArray() {
		//checking User can add ID into Array
		Test.textField_ID.setText("1");
		assertEquals("1",TestBasket.gameList.get(0));
	}
	void testSQL() {
		//checking SQL can connect to Program by looking at I

		 //assertEquals("Farcry5",TestBasket.textField_Name.setText(TestBasket.rs.getString("name")));
		 
	}
	void testChange() {
		//checking it can change to TestBasket2
		/*
		Test = TestBasket.lblBasket.addMouseListener().mouseClicked(MouseEvent arg0);
		assertEquals(TestBasket2.setVisible(true),);
		*/
	}
	void testInvisible() {
		//checking Testbasket 2 doesn't show text if Array is empty
	}
	void testVisible() {
		//checking TestBasket2 show content when Array has element
	}

}
