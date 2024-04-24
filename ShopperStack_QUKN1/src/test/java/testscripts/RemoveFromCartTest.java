package testscripts;

import org.testng.annotations.Test;

import element_Repository.RemoveFromCartPage;
import generic_Library.BaseTest;

public class RemoveFromCartTest extends BaseTest {
	
	@Test
	public void RemoveFromCartTestCase() throws InterruptedException
	{
		RemoveFromCartPage cart = new RemoveFromCartPage(driver);
		cart.getCartIcon().click();
		Thread.sleep(3000);
		cart.getRemoveFromCart().click();
		Thread.sleep(3000);
		cart.getYesButton().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
}



