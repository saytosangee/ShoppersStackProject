package testscripts;

import org.testng.annotations.Test;

import element_Repository.PriceIncreasePage;
import generic_Library.BaseTest;

public class PriceIncreaseTest extends BaseTest {
	
	@Test
	public void PriceIncreaseTestCase() throws InterruptedException
	{
		PriceIncreasePage price = new PriceIncreasePage(driver);
		price.getCartIcon().click();
		Thread.sleep(3000);
		price.getIncreasePrice().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
}


