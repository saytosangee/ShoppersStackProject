package testscripts;

import org.testng.annotations.Test;

import element_Repository.BuyNowPage;
import element_Repository.CheckDeliveryPage;
import generic_Library.BaseTest;

public class CheckDeliveryTest extends BaseTest {
	
	@Test
	public void CheckDeliveryTestCase() throws InterruptedException
	{
		CheckDeliveryPage check = new CheckDeliveryPage(driver);
		Thread.sleep(3000);
		check.getElectronics().click();
		Thread.sleep(3000);
		check.getProductDesc().click();
		Thread.sleep(3000);
		check.getCheckDelivery().sendKeys("560010");
		Thread.sleep(3000);
		check.getCheckButton().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
	}



