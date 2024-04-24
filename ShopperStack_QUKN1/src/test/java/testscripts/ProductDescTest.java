package testscripts;

import org.testng.annotations.Test;

import element_Repository.PriceIncreasePage;
import element_Repository.ProductDescPage;
import generic_Library.BaseTest;

public class ProductDescTest extends BaseTest {
	
	@Test
	public void ProductDescTestCase() throws InterruptedException
	{
		ProductDescPage product = new ProductDescPage(driver);
		product.getMen().click();
		Thread.sleep(3000);
		product.getProductDesc().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
}


