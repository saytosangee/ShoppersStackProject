package testscripts;

import org.testng.annotations.Test;

import element_Repository.ViewTransactionsPage;
import generic_Library.BaseTest;

public class ViewTransactionsTest extends BaseTest {
	
	@Test
	public void ViewTransactionsTestCase() throws InterruptedException
	{
		ViewTransactionsPage cart = new ViewTransactionsPage(driver);
		base_Page.getAccountButton().click();
		Thread.sleep(3000);
		cart.getMyWallet().click();
		Thread.sleep(3000);
		cart.getViewTransactions().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
}


