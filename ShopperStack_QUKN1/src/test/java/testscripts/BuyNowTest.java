package testscripts;

import org.testng.annotations.Test;

import element_Repository.AddToWishListPage;
import element_Repository.BuyNowPage;
import generic_Library.BaseTest;

public class BuyNowTest extends BaseTest {
	
	@Test
	public void BuyNowTestCase() throws InterruptedException
	{
		BuyNowPage buynow = new BuyNowPage(driver);
		Thread.sleep(3000);
		buynow.getBeauty().click();
		Thread.sleep(3000);
		buynow.getProductDesc().click();
		Thread.sleep(3000);
		buynow.getBuynowbutton().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
	}


