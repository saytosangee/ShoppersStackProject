package testscripts;

import org.testng.annotations.Test;

import element_Repository.EditProfilePage;
import element_Repository.MyLikesPage;
import generic_Library.BaseTest;

public class MyLikesTest extends BaseTest {
	
	@Test
	public void MyLikesTestCase() throws InterruptedException
	{
		MyLikesPage likes = new MyLikesPage(driver);
		base_Page.getAccountButton().click();
		Thread.sleep(3000);
		likes.getMyLikes().click();
		Thread.sleep(3000);
		utility_Methods.takeScreenshot(driver);
	}
}
