package testscripts;

import org.testng.annotations.Test;

import element_Repository.PriceIncreasePage;
import element_Repository.QuantityIncreasePage;
import generic_Library.BaseTest;

public class QuantityIncreaseTest extends BaseTest {
	
	@Test
	public void QuantityIncreaseTestCase() throws InterruptedException
	{
		QuantityIncreasePage quantity = new QuantityIncreasePage(driver);
		quantity.getCartIcon().click();
		Thread.sleep(3000);
		quantity.getIncreaseQuantity().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
}


