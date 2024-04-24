package testscripts;

import org.testng.annotations.Test;

import element_Repository.AddToCartPage;
import generic_Library.BaseTest;

public class AddToCartTest extends BaseTest {
	
	@Test
	public void AddToCartTestCase() throws InterruptedException
	{
		AddToCartPage cart = new AddToCartPage(driver);
		Thread.sleep(3000);
		cart.getWomen().click();
		Thread.sleep(3000);
		cart.getProductDesc().click();
		Thread.sleep(3000);
		cart.getAddtocart().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
}


