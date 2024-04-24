package testscripts;

import org.testng.annotations.Test;

import element_Repository.HelpPage;
import generic_Library.BaseTest;

public class HelpTest extends BaseTest {
	
	@Test
	public void HelpTestCase() throws InterruptedException
	{
		HelpPage help = new HelpPage(driver);
		Thread.sleep(3000);
		help.getHelpCenter().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
}
